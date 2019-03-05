// 10단계: 멀티 스레드 상황에서 db커넥션을 공유할 때의 문제점과 그 해결책
//
// [멀티스레드에서 db커넥션 공유할 떄의 문제점 확인하기]
// 1) 클라이언트1
// -/photoboard/add 를 사용한다.
// - 사진 제목은 "aaa", 수업은 101로 입력한다.
// - 사진 파일은 a.gif,b.gif를 입력한다 그리고 파일 입력을 잠시 멈춘다.

//또한 lms_photo와 lms photo file 테이블도 확인한다.
// 클라이언트 1이 insert한 데이터도 들어가있다.
// 왜 클라이언트 1과 클라이언트2의 요청을 처리할 떄 사용하는  db커넥션이 같기 때문이다.

//3) 클라이언트1
 // 파일명을 255가 넘어가게 입력한다.
// 에외가 발생하면 rollback할것이다.
// 그러나 이미 이전에 insert한 작업들이 클라이언트 2가 commit 하면서 table에 저장되었기때문에
//rollback 할수없다 이것이 mutilthread에서 db 커넥션을 공유할 떄의 문제점이다.

//[해결책]
// 1)DAO가 작업할떄 매번 새 커넥션을 사용한다.
// => 그러나 DAO의 메서드를 호출할때마다 매번 커넥션객체를 생성하면 가비지가 DB커넥션 객체의
// 가비지가 많이 생성된다. 
// 2) DBMS에 연결할떄마다 인증과 권한 검사에 시간이 소요된다.
// => 그래서 DB커넥션 풀을 사용한다.


//작업:
// 1 ConnectionFactory 클래스의 이름을 DataSource

package com.eomcs.lms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.handler.Command;
import com.eomcs.util.DataSource;

public class ServerApp {

  // ApplicationContextListener(옵저버) 목록을 보관할 객체
  ArrayList<ApplicationContextListener> listeners = new ArrayList<>();

  // 공용 객체를 보관하는 저장소
   HashMap<String,Object> context = new HashMap<>();
  
  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  public void service() throws Exception {

    try (ServerSocket ss = new ServerSocket(8888)) {
      

      // 애플리케이션을 시작할 때, 등록된 리스너에게 알려준다.
      for (ApplicationContextListener listener : listeners) {
        listener.contextInitialized(context);
      }

      System.out.println("서버 실행 중...");
      
      while (true) {

        new RequestHandlerThread(ss.accept()).start();
        
      } // while

      // 애플리케이션을 종료할 때, 등록된 리스너에게 알려준다.
//      for (ApplicationContextListener listener : listeners) {
//        listener.contextDestroyed(context);
//      }

    } catch (Exception e) {
      e.printStackTrace();
    } // try(ServerSocket)

  }


  
  public static void main(String[] args) throws Exception {
    ServerApp app = new ServerApp();

    // App이 실행되거나 종료될 때 보고를 받을 옵저버를 등록한다.
    app.addApplicationContextListener(new ApplicationInitializer());

    // App 을 실행한다.
    app.service();
  }
  
  //바깥 클래스의 인스턴스 필드를 사용해야 한다면 inner클래스로 정의하라
  
   class RequestHandlerThread extends Thread{
     
     Socket socket;
     
     public RequestHandlerThread(Socket socket) {
       this.socket= socket;
     }
     
    public void run() {
      
      DataSource dataSource =(DataSource) context.get("dataSource");
      
      // 커넥션 풀에서 현재 스레드가 사용할 커넥션 갹체를 빌린다.
      Connection con = dataSource.getConnection();
      
      try (Socket socket = this.socket;
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

        // 클라이언트의 요청 읽기
        String request = in.readLine();
        
        
        // 클라이언트에게 응답하기
        Command commandHandler = (Command) context.get(request);
        
        if (commandHandler == null) {
          out.println("실행할 수 없는 명령입니다.");
          out.println("!end!");
          out.flush();
          return;
        }
        try {
          commandHandler.execute(in, out);
          con.commit();
        }catch(Exception e) {
          
          out.printf("실행 오류! : %s\n", e.getMessage());
        }
        
        out.println("!end!");
        out.flush();
        
        //클라이언트 요청을 처리한 후 커넥션을 통해 작업한 것을 최종처리한다.
       

      } catch (Exception e) {
        
        try {
          con.rollback();
        } catch (SQLException e1) {
          //rollback 하다가 발생한 예외는 무시한다.
        }
        
        System.out.println("명령어 실행 중 오류 발생 : " + e.toString());
        e.printStackTrace();
      }finally {
         //클라이언트 요청을 모두 처리했으면 db커넥션 객체를 커넥션풀에 반납한다.
        //커넥션 객체를 close() 해서는 안된다.
        // 왜? 다음에 다시 사용해야 하기때문이다.
        
        dataSource.returnConnection(con);
      }
      
      
    }
  }
  
  
}










// 계산기 클라이언트 만들기 : 최소 +, -, *, /, % 연산자는 지원한다. 
package ch23.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


/*
실행 예:
- 클라이언트가 계산기 서버에 접속한 후 

계산기 서버에 오신 걸 환영합니다! <== 서버의 응답
계산식을 입력하세요! <== 서버의 응답
예) 23 + 7 <== 서버의 응답
> 23 + 7 <== 사용자의 입력. '>'문자는 클라이언트에서 출력한다.
결과는 30 입니다. <== 서버의 응답
> 23 ^ 7 <== 사용자의 입력. '>'문자는 클라이언트에서 출력한다.
^ 연산자를 지원하지 않습니다. <== 서버의 응답
> ok + yes <== 사용자의 입력
식의 형식이 잘못되었습니다. <== 서버의 응답
> quit <== 사용자의 입력. '>'문자는 클라이언트에서 출력한다.
안녕히 가세요! <== 서버의 응답

 */
public class CalculatorClient {
public static void main(String[] args) {
    
    try (Scanner keyboard = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        // 문자열을 주고 받기 편하도록 오리지널 입출력 스트림 객체에 데코레이터를 붙인다.
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {
      
      System.out.println("서버와 연결되었음!");
        
       String r =in.nextLine();
       String r1 =in.nextLine();
       String r2 =in.nextLine();
       
       System.out.println(r);
       System.out.println(r1);
       System.out.println(r2);
        
     
       System.out.print(">");
      String no = keyboard.next(); 
      String operator = keyboard.next(); 
      String no2 = keyboard.next(); 
      
      out.println(no);
      out.println(operator);
      out.println(no2);

      out.flush(); // 스트림 객체의 내부 버퍼에 출력된 내용을 네트워크로 방출시킨다.
      System.out.println("서버에 데이터를 보냈음!");
     
      String response = in.nextLine();
      System.out.println(response);
    
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
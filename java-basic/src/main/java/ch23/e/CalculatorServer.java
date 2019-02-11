// Stateless 서버 만들기
package ch23.e;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {
    
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");
      
     
      
      while (true) {
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {
           System.out.println("클라이언트 연결됨");
         
         int result1=Integer.parseInt(in.readLine());
           
          String [] input = in.readLine().split(" ");
          int b=0; 
           String op =null;
           
          try {
         
           op = input[0];
           b = Integer.parseInt(input[1]);
        
          }catch (Exception e) {
            out.println("식의 형식이 바르지 않습니다.");
            out.flush();
            continue;
          }
          switch (op) {
            case "+": result1 +=   b; break;
            case "-": result1 -=   b; break;
            case "*": result1 *=   b; break;
            case "/": result1 /=   b; break;
            case "%": result1 %=   b; break;
            default:
              out.printf("%s 연산자를 지원하지 않습니다.\n", op);
              out.flush();
              continue;
          }
          
          out.printf("결과는 %d 입니다.\n", result1);
          out.println(result1);

          out.flush();
          
        }catch (Exception e) {
          System.out.println("클라이언트와 통신 중오류 발생!");
        }
        
        System.out.println("클라이언트와 연결 끊음");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

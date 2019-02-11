package ch23.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class CalculatorServer {
  public static void main(String[] args) {
    
      try(ServerSocket serverSocket = new ServerSocket(8888)){
        System.out.println("서버 실행중");
        
    while(true) {
    try(Socket socket = serverSocket.accept();
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in =new BufferedReader(
            new InputStreamReader(socket.getInputStream()))){
      
      String[] input =in.readLine().split(" ");
      
      int a= Integer.parseInt(input[0]);
      String op= input[1];
      int b= Integer.parseInt(input[2]);
      int result=0;
      
      switch(op) {
        case("+") : result= a+b; break;
        case("-") : result= a-b; break;
        case("/") : result= a/b; break;
        case("%") : result= a%b; break;
        default:
          out.printf("계산할수없는 %s연산자 입니다",op);
          out.flush();
          continue;
      }
      out.printf("결과는 %s입니다\n",result);
      out.flush();
      
      
      
    }
  
    }
    }catch (Exception e) {
      e.printStackTrace();
    
    
   
    
  }
  }

}

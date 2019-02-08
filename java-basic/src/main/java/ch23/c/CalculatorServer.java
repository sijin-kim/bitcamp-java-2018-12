// 계산기 서버 만들기
package ch23.c;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {
     
      try (
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {
        
       

       out.println("계산기 서버에 오신걸 환영합니다!");
       out.println("계산식을 입력하세요!");
       out.println("예)23 + 7");
       out.flush();
       
        int result=0;
       
       int no =Integer.parseInt(keyboard);
        System.out.println(no);
      
        String operator = in.next();
        System.out.println(operator);
        
        String no2 = in.next();
        System.out.println(no2);
        result=no+no2;
        
        out.flush();
        
      }
      System.out.println("클라이언트와의 연결을 끊었음.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}
  
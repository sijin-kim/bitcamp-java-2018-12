// 2단계 클라이언트 연결을 승인한다.
package com.eomcs.lms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverApp {

  public static void main(String[] args) {

    try(ServerSocket serversocket =new ServerSocket(8888)){
      System.out.println("서버시작!...");

      while(true) {

        try(Socket socket = serversocket.accept();
            PrintStream out = new PrintStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
          System.out.println("클라이언트와 연결되었음");

      
            String request = in.readLine();
              System.out.println(request);
              
              
              out.println("객체를 받았습니다");
              out.flush();
          
          
        }catch (Exception e){
          e.printStackTrace();

        }
        System.out.println("클라이언트와 연결을끊음");
      }


    }catch (Exception e){
      e.printStackTrace();
    }
  }
}


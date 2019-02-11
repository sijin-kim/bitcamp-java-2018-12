package ch23.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class testServer {

  public static void main(String[] args) {

    try(ServerSocket serversocket = new ServerSocket(8888)){
      System.out.println("서버실행중");

      while(true) {
        try(Socket socket = serversocket.accept();
            PrintStream out =new  PrintStream(socket.getOutputStream());
            BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()))) {  


          String[] input =in.readLine().split(" ");


          int a= Integer.parseInt(input[0]);
          String op = input[1];
          int b= Integer.parseInt(input[2]);
          
          out.printf("계산결과는 %s", a+b);

        }
      }
    }catch (Exception e){
      e.printStackTrace();


    }
  }
}



package ch23.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class CalculatorClient {
public static void main(String[] args) {
  

  
  try(Scanner keybaord=new Scanner(System.in);
      Socket socket = new Socket("localhost",8888);
      PrintStream out = new PrintStream(socket.getOutputStream());
      BufferedReader in =new BufferedReader(
          new InputStreamReader(socket.getInputStream()))){
   
    System.out.print(">");
    String input=keybaord.nextLine();
    
    out.printf(input);
    out.flush();
    
   String respones=in.readLine();
   System.out.println(respones);
    
  }catch (Exception e) {
    e.printStackTrace();
  }
  
 
  
}
}

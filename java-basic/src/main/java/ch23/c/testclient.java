package ch23.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class testclient {

  public static void main(String[] args) {
    
      try(Scanner keyboard= new Scanner(System.in);
          Socket socket =new Socket("localhost",8888);
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
          System.out.print(">");
          String input=keyboard.nextLine();
        
          out.println(input);
          out.flush();
          
       
        
          String input1 = in.readLine();
          System.out.println(input1);
        
    
        
            
          }catch (Exception e){
            e.printStackTrace();
          }
          
          
    
    
  }
}

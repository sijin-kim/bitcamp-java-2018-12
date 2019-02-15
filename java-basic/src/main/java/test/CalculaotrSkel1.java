package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//중계인 역할을 하는놈 // orb라고 부른다 .
//서버쪽 중계인!!!!!!
public class CalculaotrSkel1 {
public static void main(String[] args) {
  
      Calculator  crl = new Calculatorlmpl();
  
  
      try(ServerSocket ss =new ServerSocket(8888)){
             System.out.println("서버실행중");
        
        
        while(true) {
        try(Socket socket = ss.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream())){
              
              
          int a= in.readInt();
          int b=in.readInt();
           String op= in.readUTF();
           
           switch(op) {
             case "+": 
               out.writeUTF("OK");
               out.writeInt(crl.plus(a, b));
               break;
             case "-" :
               out.writeUTF("OK");
               out.writeInt(crl.minus(a, b));;
               break;
               
               default:
               out.writeUTF("FAIL");
               out.writeUTF("실행할수없는 명령어입니다.");
              
           }
             out.flush();
             
            }catch (Exception e){
              
              System.out.println("클라이언트 처리중 오류발생");
            }
            
        
        }
        
      }catch (Exception e) {
          e.printStackTrace();
 
  
}
    
}      
}

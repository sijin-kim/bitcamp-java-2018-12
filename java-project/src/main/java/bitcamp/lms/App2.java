package bitcamp.lms;

import java.util.Date;
import java.util.Scanner;

public class App2 {
 
  public static void main(String[] args) {
    
    Scanner key =new Scanner(System.in);
    int room = 10 ;
    int[] number=new int[room];
    String[] name =new String[room]; 
    String[] email =new String[room];
    String[] pwd =new String[room];
    String[] picture =new String[room];
    String[] tell =new String[room];
   
   
    
      
      int i=0;
    
      while(i<room) {
     System.out.print("번호? ");
     number[i] =key.nextInt();
      
     key.nextLine();
     
     System.out.print("이름? ");
     name[i] =key.nextLine();
      
     System.out.print("이메일? ");
     email[i] =key.nextLine();
     
     System.out.print("암호");
     pwd[i] =key.nextLine();
     
     System.out.print("사진? ");
     picture[i] =key.nextLine();
     
     System.out.print("전화? ");
     tell[i] =key.nextLine();
   
  
   
     i++;
     
     System.out.println("계속입력하시겠습니까?(y/n)");
       String use =key.next();
     if(!use.equals("y") && use.equals("n")) {
       break;
     }
      
       System.out.println("");
      
      }
      for (int j = 0; j < i; j++) {
        System.out.printf("%d,%s,%s,%s,%s\n", 
            number[j], name[j], email[j], tell[j],"2019-01-01");
        
        
  
}
    
    
    
    
    
    
    
    }
}

package bitcamp.lms;

import java.util.Date;
import java.util.Scanner;

public class App2 {
 
  public static void main(String[] args) {
    
    Scanner key =new Scanner(System.in);
    
    System.out.print("번호? ");
    int number = key.nextInt();
    
    System.out.print("이름? ");
    String name = key.next();
    
    System.out.print("이메일? ");
    String email =key.next();
    
    System.out.print("암호? ");
    int pwd =key.nextInt();
    
    System.out.print("사진? ");
    String picture =key.next();
    
    System.out.print("전화? ");
    String  phoneNumber =key.next();
    
    
    
    System.out.printf("번호: %d\n",number);
    System.out.printf("이름: %s\n",name);
    System.out.printf("이메일: %s\n",email);
    System.out.printf("암호: %d\n",pwd);
    System.out.printf("사진: %s\n",picture);
    System.out.printf("전화: %s\n",phoneNumber);
    System.out.println("가입일: 2019-01-01");
    
    
    
    
    
    
    
    
    
    }
}

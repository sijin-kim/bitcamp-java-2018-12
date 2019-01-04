package bitcamp.lms;

import java.util.Scanner;

public class App3 {
 
    public static void main(String[] args) {
      
      Scanner key = new Scanner(System.in);
      
      System.out.print("번호? ");
      int number=key.nextInt();
      
      System.out.print("내용? ");
      String contents= key.next();
      
      System.out.printf("번호: %d\n",number);
      System.out.printf("내용: %s\n",contents);
      System.out.println("작성일: 2019-01-01");
      System.out.println("조회수: 0");
      
      
      
      
      
      
      
    }
}

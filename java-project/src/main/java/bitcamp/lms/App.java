
package bitcamp.lms;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
      
        Scanner key =new Scanner(System.in);
        
         System.out.print("번호? ");
         int number =key.nextInt();
          
         key.nextLine();
         
         System.out.print("수업명? ");
          String className =key.nextLine();
          
         System.out.print("수업내용? ");
         String classContents =key.nextLine();
         
         System.out.print("시작일? ");
         String start =key.nextLine();
         
         System.out.print("종료일? ");
         String end =key.nextLine();
         
         System.out.print("총수업시간? ");
         int totalClass = key.nextInt();
         
         System.out.print("일수업시간? ");
         int totalDay = key.nextInt();
         
        
         System.out.println(); // 빈 줄 출력
         
         System.out.printf("번호: %d\n",number);
         System.out.printf("수업명: %s\n",className);
         System.out.printf("설명: %s\n",classContents);
         System.out.printf("기간:%s\n",start );
         System.out.printf("총수업시간: %d시간\n",totalClass);
         System.out.printf("일수업시간: %d시간\n",totalDay);
      
    }
}

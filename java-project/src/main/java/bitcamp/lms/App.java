
package bitcamp.lms;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
      
        Scanner key =new Scanner(System.in);
        int room = 10 ;
        int[] number=new int[room];
        String[] className =new String[room]; 
        String[] classContents =new String[room];
        String[] start =new String[room];
        String[] end =new String[room];
        int[] totalClass =new int[room];
        int[] totalDay =new int[room];
        
          
          int i=0;
        
          while(i<room) {
         System.out.print("번호? ");
         number[i] =key.nextInt();
          
         key.nextLine();
         
         System.out.print("수업명? ");
         className[i] =key.nextLine();
          
         System.out.print("수업내용? ");
         classContents[i] =key.nextLine();
         
         System.out.print("시작일? ");
         start[i] =key.nextLine();
         
         System.out.print("종료일? ");
         end[i] =key.nextLine();
         
         System.out.print("총수업시간? ");
         totalClass[i] = key.nextInt();
         
         System.out.print("일수업시간? ");
         totalDay[i] = key.nextInt();
         
         i++;
         
         System.out.println("계속입력하시겠습니까?(y/n)");
           String use =key.next();
         if(!use.equals("y") && use.equals("n")) {
           break;
         }
          
           System.out.println("");
          
          }
          for (int j = 0; j < i; j++) {
            System.out.printf("%d, %s, %s ~ %s, %d\n", 
                number[j], className[j], start[j], end[j], totalClass[j]);
      
    }
    }
}

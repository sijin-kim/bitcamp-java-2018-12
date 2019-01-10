
package bitcamp.lms;

import java.util.Scanner;




public class App {
 
    

    public static void main(String[] args) {
      
        Scanner key =new Scanner(System.in);
       
          int room =100;
          Lesson[]  lessons =new Lesson[room];  
         
          
           
          int i=0;
        
          while(i<room) {
          Lesson lesson = new Lesson();
          
         System.out.print("번호? ");
          lesson.number=key.nextInt();
          
         key.nextLine();
         
         System.out.print("수업명? ");
          lesson.className=key.nextLine();
          
         System.out.print("수업내용? ");
          lesson.classsContents=key.nextLine();
         
         System.out.print("시작일? ");
          lesson.start=key.nextLine();
         
         System.out.print("종료일? ");
          lesson.end=key.nextLine();
         
         System.out.print("총수업시간? ");
         lesson.totalClass= key.nextInt();
         
         System.out.print("일수업시간? ");
          lesson.totoalDay= key.nextInt();
            
       // i 번째 배열에 수업 정보를 담고 있는 Lesson 객체(의 주소)를 보관한다.
          lessons[i] = lesson;
          
          i++;
         
         System.out.println("계속입력하시겠습니까?(y/n)");
           String input =key.next();
         if(!input.equals("y") && input.equals("n")) {
           break;
         }
          
           System.out.println("");
          
          }
          for (int j = 0; j < i; j++) {
            System.out.printf("%d ,%s,%s,%s %d\n",
              lessons[j].number,lessons[j].className,
              lessons[j].start,lessons[j].end,lessons[j].totalClass);
      
    }
    }

 
}

package bitcamp.lms;

import java.util.Scanner;

public class App3 {
 
    public static void main(String[] args) {
      
      Scanner key = new Scanner(System.in);
      int room=10;
      
      int[] number = new int[room];
      Board[] boards = new Board[room];
      
      
      
      
      int i=0;
      while(i<room) {
        Board board =new Board(); 
        
          System.out.print("번호");
          board.number=key.nextInt();
            System.out.print("내용?");
            board.contents=key.next();
            boards[i]=board;
            i++;
            
            System.out.println("계속입력하시겠습니까?(y/n)");
            String use =key.next();
          if(!use.equals("y") && use.equals("n")) {
            break;
      }
      
      System.out.println("---------");
      
      
    }
      for (int j = 0; j < i; j++) {
      System.out.printf("%d,%s,%s,%s\n",boards[j].number
          ,boards[j].contents
          ,"2019-01-01","0");
      
      
}
}
}

package bitcamp.lms;

import java.util.Scanner;

public class App3 {
 
    public static void main(String[] args) {
      
      Scanner key = new Scanner(System.in);
      int room=10;
      
      int[] number = new int[room];
      String[] contents = new String[room];
      
      
      
      
      int i=0;
      while(i<room) {
          System.out.print("번호");
            number[i]=key.nextInt();
            System.out.print("내용?");
            contents[i]=key.next();
            i++;
            
            System.out.println("계속입력하시겠습니까?(y/n)");
            String use =key.next();
          if(!use.equals("y") && use.equals("n")) {
            break;
      }
      
      System.out.println("---------");
      
      
    }
      for (int j = 0; j < i; j++) {
      System.out.printf("%d,%s,%s,%s\n",number[j],contents[j]
          ,"2019-01-01","0");
      
      
}
}
}

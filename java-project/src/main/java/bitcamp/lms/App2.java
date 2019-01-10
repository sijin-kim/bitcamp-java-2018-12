package bitcamp.lms;

import java.util.Scanner;

public class App2 {
 
  public static void main(String[] args) {
    
        
        Scanner key =new Scanner(System.in);
        int index=30;
        Member[] members = new Member[index];
        
        
       int a=0;
       while(a<index) {
         Member member =new Member();
         
           System.out.print("번호");
           member.number=key.nextInt();
            key.nextLine();
            
            System.out.print("이름: ");
            member.name =key.nextLine();
            
            System.out.print("이메일?");
            member.email =key.nextLine();
           
            System.out.print("암호?");
            member.pwd =key.nextLine();
            
            System.out.print("사진?");
            member.picture =key.nextLine();
            
            System.out.print("전화?");
            member.tell =key.nextLine();
            
            members[a] =member;
            a++;
         
            System.out.print("계속입력하시겠습니까?(y/n)");
                String input = key.nextLine();
                if(!input.equals("y") && input.equals("n")); {
                      break;
                }
       }
          System.out.println("------------");
       


             
             for(int j=0; j<a; j++) {
                   System.out.printf("%d,%s,%s%s%s%s\n"
                       ,members[j].number,members[j].name
                       ,members[j].email,members[j].pwd,
                       members[j].picture,members[j].tell);
             }
  }
}

                    
        
  
         
  


   





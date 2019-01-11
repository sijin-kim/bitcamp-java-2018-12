//패키지 용도 - 유사 역할을 서로 관련된 클래스를 분류할떄 사용한다.
package ch08;

import java.util.Scanner;

class Test08{
  

  public static void main(String[] args) {
    // Calulator 클래스를 향후 유지보수하기 쉽도록 별도의 패키지로 분류한다.
    //ch08.util 패키지를 만들어 분류한다.
      Scanner keyboadr =new Scanner(System.in);
      System.out.println("계산식? 12*2");
      int a= keyboadr.nextInt();
      String op= keyboadr.next();
      int b= keyboadr.nextInt();


      keyboadr.close();
      
      int result  =0;
      switch (op) {
        case "+": result =ch08.util.Calculator2.plus(a, b); break;
        case "-": result =ch08.util.Calculator2.minus(a,b); break;
        case "*": result =ch08.util.Calculator2.multiple(a,b); break;
        case "/": result =ch08.util.Calculator2.divide(a,b); break;
        default:
          System.out.println("지원하지 않는 연산자입니다.");
          return; // main()메서드를 그만 실행하고 나간다.즉 jvm종료
          
      }
      System.out.printf("%d%s%d=%d\n",a,op,b,result);
    
  }
  
 }
 


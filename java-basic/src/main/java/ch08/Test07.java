
package ch08;

import java.util.Scanner;

class Test07{
  

  public static void main(String[] args) {
      Scanner keyboadr =new Scanner(System.in);
      System.out.println("계산식? 12*2");
      int a= keyboadr.nextInt();
      String op= keyboadr.next();
      int b= keyboadr.nextInt();


      keyboadr.close();
      
      int result  =0;
      switch (op) {
        case "+": result =Calculator.plus(a, b); break;
        case "-": result =Calculator.minus(a,b); break;
        case "*": result =Calculator.multiple(a,b); break;
        case "/": result =Calculator.divide(a,b); break;
        default:
          System.out.println("지원하지 않는 연산자입니다.");
          return; // main()메서드를 그만 실행하고 나간다.즉 jvm종료
          
      }
      System.out.printf("%d%s%d=%d\n",a,op,b,result);
    
  }
  

 }
 


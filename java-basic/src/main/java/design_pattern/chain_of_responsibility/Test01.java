package design_pattern.chain_of_responsibility;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    
    Scanner key = new Scanner(System.in);
    TerminalHandler ter = new TerminalHandler();

    PlusHandler plus = new PlusHandler();
    MinusHandler minus = new MinusHandler();
    MultipleHandler mu = new MultipleHandler();
    plus.setNext(minus);
    minus.setNext(mu);
    mu.setNext(ter);
    
    while(true) {
      System.out.println("a");
      int a=key.nextInt();
      System.out.println("b");
     int b=key.nextInt();
      System.out.println("op");
      String op=key.next();
      
       plus.handle(a,b,op);
    }
    
   
  }

}

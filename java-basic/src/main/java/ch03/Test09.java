//키보드로 입력한 값을 받기
package ch03;


public class Test09{

  public static void main(String[] args){

    
    
    java.util.Scanner keyboard= new java.util.Scanner(System.in);
    
    System.out.print("a? ");
    int a =keyboard.nextInt();
    
    keyboard.nextLine();
    System.out.print("b? ");
    int b =keyboard.nextInt();
    System.out.printf("%d * %d= %d\n",a,b,a*b);
    
    
    
    
   
  
  
  
  }

}

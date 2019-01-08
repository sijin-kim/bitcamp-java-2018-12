//키보드로 입력한 값을 받기
package ch03;


public class Test08{

  public static void main(String[] args){

    
    
    java.util.Scanner keyboard= new java.util.Scanner(System.in);
    
    System.out.print("나이");
    int age =keyboard.nextInt();
    
    
    System.out.print("이름 :");
    String name =keyboard.next();
    System.out.printf("%d(%s)\n",age,name);
    
    
    
    
   
  
  
  
  }

}

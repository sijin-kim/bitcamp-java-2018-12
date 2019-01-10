//메서드의 리턴값
package ch06;

public class Test04{

  public static void main(String[] args){
      int i;
//      i=m1();
      String s;
      s=m1();
      System.out.println(s);
      
      i =m2();
      System.out.println(i);
      
      
        
  }

  
  static String  m1() {
    
    return "홍길동";
  }
  
  static int m2() {
    return 100;
  }
  
}

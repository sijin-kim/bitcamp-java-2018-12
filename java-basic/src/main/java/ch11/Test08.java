//  클래사용법  
package ch11;


   
public class Test08 {
  public static void main(String[] args) {

      StringBuffer b1 =new StringBuffer("Hello");
      StringBuffer b2 =new StringBuffer("Hello");

      System.out.println(b1==b2);
      //string buffer의 equals()는 값을 비교하는 것이 아니라 인스턴스가 같은지 비교한다
      System.out.println(b1.equals(b2));
      

      
      



      
  }
  
}
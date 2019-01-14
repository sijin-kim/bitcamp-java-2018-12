//클래스 필드가 필요한 이유
package ch09;

   
public class Test01 {
  public static void main(String[] args) {
    
    //계산하기
    
   int result= Calculator1.multiple(2, 3);
   result =Calculator1.minus(result, 2);
   result =Calculator1.plus(result, 7);
     
      System.out.println(result);
      
      //Calculator1의 메서드를 이용하요 계산을 수행할떄 
      // 계산결를 호출하는 쪽에서 관리
      
  
  }
  
}
//클래스 필드의 한
package ch09;

   
public class Test04 {
  public static void main(String[] args) {
    //calculatro1을 사용하여 두계산식을 동시에 하
    //두 계산식을 동시에하기
    
    //계산하기기
    
    int result1=0;
    int result2 =0;
    
    result1 =Calculator1.plus(2,3); 
    result2= Calculator1.divide(6,2); 
    
    result1 =Calculator1.minus(result1, 2);
    result2 =Calculator1.plus(result2, 8);
    
 
    result1 =Calculator1.plus(result1, 8);

   


     
      System.out.println(result1);
      System.out.println(result2);
      
//        calculator1 1을 사용할 경우 계산 결과를 직접 관리해야 하기 떄문에 불편하다.
  
  }
  
}
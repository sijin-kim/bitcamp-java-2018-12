//클래스 필드의 한
package ch09;

   
public class Test05 {
  public static void main(String[] args) {
    //calculatro3을 사용하여 두계산식을 동시에 하
    //두 계산식을 동시에하기
    
    //Calculator
    Calculator3 c1 =new Calculator3();
    Calculator3 c2 =new Calculator3();

    
    Calculator3.plus(c1, 2);
    Calculator3.plus(c2,6); 
    
    
    Calculator3.multiple(c1, 3);
    Calculator3.divide(c2, 2);
    
    Calculator3.minus(c1, 2);
    Calculator3.plus(c2, 9);
    
    Calculator3.plus(c1, 7);
   
     
      System.out.println(c1.result);
      System.out.println(c2.result);
      
//        calculator1 1을 사용할 경우 계산 결과를 직접 관리해야 하기 떄문에 불편하다.
  
  }
  
}
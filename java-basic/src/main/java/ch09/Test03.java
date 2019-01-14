//클래스 필드의 한
package ch09;

   
public class Test03 {
  public static void main(String[] args) {
    //두 계산식을 동시에하기
    
    //계산하기
    Calculator2.plus(2); //식1 계산
    Calculator2.plus(6); //식2 계산

    
    Calculator2.multiple(3); //식1
    Calculator2.divide(2); //식2

    
    
    Calculator2.minus( 2);//식1
    Calculator2.plus(8); //식2

    Calculator2.plus( 7);

     
      System.out.println(Calculator2.result);
      
      //Calculator1의 메서드를 이용하요 계산을 수행할떄 
      // 계산결를 호출하는 쪽에서 관리
      
  
  }
  
}
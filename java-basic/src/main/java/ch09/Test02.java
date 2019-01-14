//메서드가 사용하느 변수는 그 메서드가 있는 클래스에 두는 것이 좋다.
//클래스 필드가 등
package ch09;

   
public class Test02 {
  public static void main(String[] args) {
    
    //계산하기
    Calculator2.plus(2);
    Calculator2.multiple(3);
    Calculator2.minus( 2);
    Calculator2.plus( 7);
     
      System.out.println(Calculator2.result);
      
      //Calculator1의 메서드를 이용하요 계산을 수행할떄 
      // 계산결를 호출하는 쪽에서 관리
      
  
  }
  
}
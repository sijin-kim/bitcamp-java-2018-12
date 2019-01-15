// 초기화 블록 -클래스 로딩과 스태틱 블록 실행 과정

package ch10;

class A{
  static int a=7;
  
  static {
    System.out.println("A.staitc{}");
    a +=B.b;   //29
  }
}
class B{
  static int b=22;
  
  static {
    System.out.println("B.staitc{}");
    b +=A.a;    //29
  }
  
  
}




public class Test13 {
  
  public static void main(String[] args) {
    
    System.out.println(A.a);
    System.out.println(B.b);
    
   
    //클래스 로딩 절차
    // 1 클래스를 method area 에 로딩한다.
//    2 스태틱 블록을 실행한다.
//    3 스태틱 블록을 실행한다.
    
    //스태틱  블록의 목적
    
    
//   
//    
  
  }
 
  }

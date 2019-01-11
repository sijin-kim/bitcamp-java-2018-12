//클래스 로딩과 클래스 필드의 생
package ch08;

class My2{
    //클래스 필드
  static String manager= "관리자";
  static String member= "회원";
  static String guest= "손님";
  //인스턴스 필드
   String name;
   int age;
   String userType;
   
}


public class Test02 {
  public static void main(String[] args) {
    
    //클래스 로딩과정
//          java test    
        System.out.println(My2.manager);
        System.out.println(My2.member);
  
  }
  
}
/*
 클래스 로딩
 외부 저장장치 .class 파이을 jvm 이 관리하는 메모리를 로딩하는 것
 1 Heap 
     new 명령으로 생성한 인스턴스가 놓인다.
     가비지 컬렉터는 이메모리의 가비지들을 관리한다.
 2. Jvm stack
     각 스레드가 개인적으로 관리하는 메모리 영역이다.
     
 3.method area
  jvm이 실행하는 바이트코드를 두는 메로이 영역이다.
  스태틱 변수를 이 영역에 생성한다.
 
*/


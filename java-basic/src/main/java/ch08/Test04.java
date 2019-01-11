//그 밖의 클래스 맴버들
package ch08;

class My4{
    //클래스 필드 =스태틱 필드
  static int a;
  
  //클래스 블록 =스태틱 블록
  static {
    System.out.println("오호라");
  }
  static {
    System.out.println("여러개를 선언 할수있네");
  }
  //클래스 메서드 ==스태틱 메서드
  
  static void m1() {
    System.out.println("나를 호출 하셨군요");
  }
  
}


public class Test04 {
  public static void main(String[] args) {
    System.out.println("********");
//     
    My4 obj1;
    System.out.println("--------------------------");
        My4.a=300;
    
    My4.m1();
    My4.m1(); //한 번 클래스가 로딩되면 다시 로딩되지않는다 따라서 스태틱 블록은 딱 한 번 실행된다.
    My4.a=100;
  }
}
/*
 * 클래스 로딩
 * 1.클래스를 외부 저장소에서 내부저장소인  ram으로 로딩한다.
 * 클래스의 바이트코드 유효성을 검사한다.
 * 클래스 내부에서 사용하는 모든 이름 (변수명 메서드명 클래스명 등 목록을 준비한다)
 * 클래스 필드를 찾아 생성한다.
 * 스테틱 블록이 있으면 순서대로 실행한다.
 */



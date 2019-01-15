// 인스턴스 필드와 초기화 - 초기화 문장을 통해 필들에 기본 값을 미리 저장한다.
package ch10;
//초기화 문장
//변수를 선언할 떄 값을 설정하는 것을 초기화 문장이라 부른다.
class Monitor6{
  int bright ; //밝기 (0~100%)
  int contratst= 50; // 명암 (0~100%)Test04.java
  int widthRes; // 해상도 너비
  int heightRes = 1080;// 해상도 높이
  
  // 생성자 형식은 다음과 같다
  // 클래스명(파라미터,파라미터)
  // 생성자는 리턴 타입이 없다.
  
  //생성자에 목적 
  // 인스턴스를 정상적으로 사용할수 있도록
//   인스턴스가 사용하는 인스턴스 필드의 값을 
//   유효한 값으로 설정하는 기능을 수행한다.
  
  //생성자의 호출 절차
  // 인스터스 생성 ㅡ 인스턴스 필드 초기화 문장 실행 - 인스턴스 블록 실행 생성자 실행
  
  //생성자 호출하는 방법
   // new 클래스명(생상저의 파라미터값)
    Monitor6(){
    this.bright=50;
    this.contratst = 70;
    this.widthRes= 2560;
    this.heightRes=1200;
    
  }
   public void on() {
      System.out.println("화면을 출력한다.");
   }
  
  void display() {
    System.out.println("----------------------------------");
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contratst);
    System.out.printf("해상도(%d x %d)\n",this.widthRes,this.heightRes);
    System.out.println("----------------------------------");

  }
  
}

public class Test08 {
  
  public static void main(String[] args) {
      //모니터 인스턴스 생성
    
//    1)생성자의 파라미터 값을 주지않고 인스턴스를 생성할수 없다.
    //  new Monitor6; //컴파일 오류!
    
    //2 파리미터가 없는 생성자를 호출할 경우 값 없이 지정한다.
     new Monitor6();
    
    //3 파리미터 값을 받지 않는 생성자를 호출할 떄 값을 주면 컴파일 오류가 발생한다.
     //new Monitor6(100);
    
     
  
  }
  
}
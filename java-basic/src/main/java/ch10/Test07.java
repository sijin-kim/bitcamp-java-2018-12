// 인스턴스 필드와 초기화 - 초기화 문장을 통해 필들에 기본 값을 미리 저장한다.
package ch10;
//초기화 문장
//변수를 선언할 떄 값을 설정하는 것을 초기화 문장이라 부른다.
class Monitor5{
  int bright ; //밝기 (0~100%)
  int contratst= 50; // 명암 (0~100%)Test04.java
  int widthRes; // 해상도 너비
  int heightRes = 1080;// 해상도 높이
  
  {
    
    this.bright =50;
    this.contratst=60;
    this.widthRes=1920;
    
  }
    
    Monitor5(){
    this.contratst = 70;
    this.widthRes= 2560;
    this.heightRes=1200;
    
  }
  
  
  void display() {
    System.out.println("----------------------------------");
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contratst);
    System.out.printf("해상도(%d x %d)\n",this.widthRes,this.heightRes);
    System.out.println("----------------------------------");

  }
  
}

public class Test07 {
  
  public static void main(String[] args) {
      //모니터 인스턴스 생성
    Monitor5 m1= new Monitor5();
    
    
    
     
    //인스턴스 필드의 값이 유효한 기본 값들로 미리 초기화 되었기 때문에 바로 사용할수 있다.
    m1.display();
      
    m1.bright =40;
     
     
    m1.display();

    //고객의 의견! 이클래스를 사용하는 다른 개발자의 의견
    // 인스턴스의 메서드를 사용하는데 문제가 없도록
  
  }
  
}
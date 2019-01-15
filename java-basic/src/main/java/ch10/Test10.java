// 생성자 -기본생성자 두번
package ch10;
//초기화 문장
//변수를 선언할 떄 값을 설정하는 것을 초기화 문장이라 부른다.
class Monitor8{
  int bright ; //밝기 (0~100%)
  int contratst= 50; // 명암 (0~100%)Test04.java
  int widthRes; // 해상도 너비
  int heightRes = 1080;// 해상도 높이
  
  
  //만약 생성자가 한개라도 있으면 컴파일러는 기본 생성자를 추가하지않는다.
  
  //클래스에 기본 생성자가 없으면 컴파일러 자동으로 기본 생성자를 추가한다.
//   그래서 모든 클래스는 기본생성자가 있다.
  
  Monitor8(int bright,int contrast){
      this.bright =bright;
      this.contratst=contratst;
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

public class Test10 {
  
  public static void main(String[] args) {
      //인스턴스 생성
    
    
     //new Monitor7();
        
    //기본 생성자가 있으니 인스턴스를 생성할 떄 호출될 기본 생성자를 표시해야한다.
//      클래스 이름 뒤에 괄호를 쳐라!
    //기본 생성자가 없는 경우 기본생성자를 지정할수 없다.
    new Monitor8(50,50);//ok
     
  
  }
  
}
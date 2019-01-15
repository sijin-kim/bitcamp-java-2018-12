// 생성자 -기본생성자 두번
package ch10;
//초기화 문장
//변수를 선언할 떄 값을 설정하는 것을 초기화 문장이라 부른다.
class Monitor9{
  int bright ; //밝기 (0~100%)
  int contratst= 50; // 명암 (0~100%)Test04.java
  int widthRes; // 해상도 너비
  int heightRes = 1080;// 해상도 높이
  
  Monitor9(){
  this.bright=50;
  this.contratst = 70;
  this.widthRes= 2560;
  this.heightRes=1200;
  System.out.println("Monitor9()");
  
}
  
  Monitor9(int bright,int contrast){
      this.bright =bright;
      this.contratst=contratst;
      System.out.println("Monitor9 int, int");
  }

  Monitor9(int bright,int contrast,int widthRes,int heightRes){
    this.bright =bright;
    this.contratst=contratst;
    this.widthRes=widthRes;
    this.heightRes=heightRes;
    System.out.println("Monitor9 int itntintitntintint");
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

public class Test11 {
  
  public static void main(String[] args) {
      //인스턴스 생성
    
    
      //생성자를 지정할 때 파라미터의 값에 결정된다.
    new Monitor9();
    new Monitor9(50,50);//ok
    new Monitor9(50,50,1920,1080);
    
    //파라미터 타입이나 개수가 일치하지 않는 생성자는 호출할수 없다.
//    new Monitor9(50);
  
  }
  
}
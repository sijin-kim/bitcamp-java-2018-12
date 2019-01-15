// 생성자 -생성자와 this()
package ch10;
//초기화 문장
//변수를 선언할 떄 값을 설정하는 것을 초기화 문장이라 부른다.
class Monitor10{
  int bright ; //밝기 (0~100%)
  int contratst= 50; // 명암 (0~100%)Test04.java
  int widthRes; // 해상도 너비
  int heightRes = 1080;// 해상도 높이
  
  Monitor10(){

  this(50,50,2560,1200);
  System.out.println("Monitor9()");
  
}
  
  Monitor10(int bright,int contrast){
      this.bright =bright;
      this.contratst=contratst;
      System.out.println("Monitor9 int, int");
  }

  Monitor10(int bright,int contrast,int widthRes,int heightRes){
    this.bright =bright;
    this.contratst=contratst;
    this.widthRes=widthRes;
    this.heightRes=heightRes;
    System.out.println("Monitor9 int itntintitntintint");
}
  

   public static void on() {
     //일반 메서드는 생성자를 호출할 수없다.
     
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

public class Test12 {
  
  public static void main(String[] args) {
      //인스턴스 생성
    
    
      //생성자를 지정할 때 파라미터의 값에 결정된다.
    new Monitor10();
    System.out.println("----------------------");
    new Monitor10(50,50);//ok
    System.out.println("----------------------");

    new Monitor10(50,50,1920,1080);

    Monitor10 obj1 =new  Monitor10();
    

    
  
  }
  public static void on() {
    //일반 메서드는 생성자를 호출할 수없다.
    
     System.out.println("화면을 출력한다.");
  }
}
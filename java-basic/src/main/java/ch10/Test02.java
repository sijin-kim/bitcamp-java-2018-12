// 인스턴스 필드와 초기화
package ch10;

class Monitor0{
  int bright; //밝기 (0~100%)
  int contratst; // 명암 (0~100%)
  int widthRes; // 해상도 너비
  int heightRes;// 해상도 높이
  
  void display() {
    System.out.println("----------------------------------");
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contratst);
    System.out.printf("해상도(%d x %d)\n",this.widthRes,this.heightRes);
    System.out.println("----------------------------------");

  }
  
}

   
public class Test02 {
  public static void main(String[] args) {
      //모니터 인스턴스 생성
    Monitor1 m1= new Monitor1();
     
    m1.display();
    //모니터의 중요 필드 값을 초기화시키지 않고 사용하면 제대로 동작이 안될수 있다.
    
    
    //모니터 인스턴스 값 초기화시키기
    m1.bright=50;
    m1.contratst=50;
    m1.widthRes=1920;
    m1.bright=1080;
    
    

    
  
  }
  
}
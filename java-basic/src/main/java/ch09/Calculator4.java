package ch09;

public class Calculator4 {
  
  
  
   int result =0; 
  //인스턴스 주소를 파라미터로 받지 않고 호출될 떄 앞에서 받는 방법!
  static void plus(Calculator4 that, int a) {
   //result 가 더이상 클래스 필드가 아니기떄문에 다음과 같이 사용할 수없다.
    that.result +=a;
    
  
}
 void minus(int a ) {
    this.result -=a;

  
}
   void multiple(int a ) {
    this.result *=a;

  
}
   void divide(int a ) {
    this.result /=a;

    
  }

}

   
   




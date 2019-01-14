package ch09;

public class Calculator3 {
  
  
  // 클래스에서 공통으로 관리하지않고 
  // 개별적으로 관리 해야할 값이 있다면 인스턴스 필드로 선언하라.
  
   int result =0; 
  
  static void plus(Calculator3 that, int a) {
   //result 가 더이상 클래스 필드가 아니기떄문에 다음과 같이 사용할 수없다.
    that.result +=a;
    
  
}
  static void minus(Calculator3 that,int a ) {
    that.result -=a;

  
}
  static void multiple(Calculator3 that,int a ) {
    that.result *=a;

  
}
  static void divide(Calculator3 that,int a ) {
    that.result /=a;

    
  }

}

   
   




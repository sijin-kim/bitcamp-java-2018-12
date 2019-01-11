//그 밖의 클래스 맴버들
package ch08;




 class Test05 {
  static int a;
  static int b;
  
  
  
  
  public static void main(String[] args) {
    
    
    a=200;

  
    System.out.println(Test05.a);
    System.out.println(b);

    
  }
  static void m1() {
    a= 200;
    b= 300;
   
  }
  static void m2() {
    a=300;
  }
}



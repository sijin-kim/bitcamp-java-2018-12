//  생성자 활용
package ch11;


   
public class Test01 {
  public static void main(String[] args) {
        //string 인스턴스
    //string 은 자바 기본 타입이아니다.
    // 클래스이다.
    String s1;

    s1= new String ("hello");
    
    String s2=new String ("hello");
    
    if(s1==s2) {
      System.out.println("같다");
    }else {
      System.out.println("틀림");
    }
    

  
  }
  
}
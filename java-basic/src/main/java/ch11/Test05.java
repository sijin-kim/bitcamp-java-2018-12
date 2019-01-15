//  클래사용법  
package ch11;


   
public class Test05 {
  public static void main(String[] args) {

      String s1 =new String("hello");
      //string 인스턴스가 한번 생성되면 절대로 값을 바꿀 수없다.
      
      String s2= s1.replace('l', 'x');
      System.out.println(s1);
      System.out.println(s2);
      
      String s3= s1.replace("ll", "dd");
      System.out.println(s3);

  }
  
}
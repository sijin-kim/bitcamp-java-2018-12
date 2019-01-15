//  클래사용법 2번째 -문자열 리터럴로 string 인스턴스 생성하기
package ch11;


   
public class Test02 {
  public static void main(String[] args) {

      String s1;
      s1="hello";
      
      String s2= "hello";
      
      if(s1==s2) 
        System.out.println("같다");
      else 
        System.out.println("다르다");
      
          String s3 =new String ("hello");
          if(s1==s3)
            System.out.println("s1==s3");
          else
            System.out.println("s1!=s3");
          
          
          
      System.out.println(s1 instanceof String);
      System.out.println(s1 instanceof String);

      
  }
  
}
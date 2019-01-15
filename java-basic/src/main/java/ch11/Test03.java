//  클래사용법 2번째 -힙에있는 인스턴스를 상수 풀에도 만들
package ch11;


   
public class Test03 {
  public static void main(String[] args) {

      String s1 =new String("hello");
      String sx= "hello";
      String s2= s1.intern();
      String s3 ="hello";
      
      

      
      if(s1==s2) 
        System.out.println("같다");
      else 
        System.out.println("다르다");
      
          if(s2==s3)
            System.out.println("같다");
          else
            System.out.println("다르다");
          
          if(s1==sx)
            System.out.println("같다");
          else
            System.out.println("다르다");
          
      System.out.println(s1 instanceof String);
      System.out.println(s1 instanceof String);

      
  }
  
}
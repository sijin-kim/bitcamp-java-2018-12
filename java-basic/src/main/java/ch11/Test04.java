//  클래사용법 2번째 
package ch11;


   
public class Test04 {
  public static void main(String[] args) {

      String s1 =new String("hello");
      String s2 =new String("hello");
      
      if(s1==s2) 
        System.out.println("같다");
      else 
        System.out.println("다르다");
      
          if(s1.equals(s2))
            System.out.println("s1과 s2의 문자열이 같다");
          else
            System.out.println("s1과 s2의 문자열이 같다");
          

          
     String s3 = "hello";
     String s4 ="HEllo";
     
     if(s3.equalsIgnoreCase(s4)) 
       System.out.println("같다");
     

      
  }
  
}
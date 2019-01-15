// 생성자 활용 - string 클래스의 생성자 활

package ch10;

public class Test14 {
  
  public static void main(String[] args) {
   
    String s1= new String();
    
  //생성자에서 넘겨주는 값을 배열에 저장한다.
    
    System.out.println(s1);//빈 문자열 출력
    
    String s2=new String("Hello");
    char[] chars = {'h','e','l','l','o'};
    String s3= new String(chars);
    
    byte[] bytes3 = {(byte)0xb0,(byte)0xa1,(byte)0xb0,(byte)0xa2,0x30,0x31,0x32,0x41,0x42,0x43};
    
    String s4 = new String(bytes3);

    
    System.out.println(s2);
    System.out.println(s3);
  

    //string 생성자는 파라미터로 받은 바이트 배열에 iso =8859-1 문자 코드가 들어 있다가
    //간주한다.
    
    
 
  }
 
  }

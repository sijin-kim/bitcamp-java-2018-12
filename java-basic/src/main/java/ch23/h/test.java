package ch23.h;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class test {

  public static void main(String[] args) throws Exception{
    
    // 웹서버에 접속
    URL url= new URL("https://www.naver.com");
    
     //웹서버에 응답하는 데이터를 읽어드릴 도구를 만든다.
    InputStream uu=url.openStream();
    
    BufferedReader in = new BufferedReader(new InputStreamReader(uu));
    
    while(true) {
      String input=in.readLine();
      if(input==null)
        break;
      System.out.println(input);
      
    }
    
   uu.close();
   in.close();
    
    
    
  }

}

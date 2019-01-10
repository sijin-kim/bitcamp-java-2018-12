//메서드 재귀호
package ch06;

import java.util.Properties;
import java.util.Set;

public class Test18{

  public static void main(String[] args){
          
     
      Properties props = System.getProperties();
      
      Set keySet=props.keySet();
      
      for(Object key : keySet) {
        String value= System.getProperty((String)key);
          System.out.printf("%s=%s\n",key,value);
      }
  }
  
  }
 
 
 




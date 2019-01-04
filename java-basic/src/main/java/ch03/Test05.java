//값 변수와 레퍼런스 변수
package ch03;

import java.util.Date;

public class Test05{

  public static void main(String[] args){
    java.util.Date d1= new java.util.Date();
    java.util.Date d2 =d1;
    
    System.out.printf("%d,%d\n",d1.getDate(),d2.getDate());
    
    d1.setDate(22);
   System.out.printf("%d,%d\n",d1.getDate(),d2.getDate());

    
    
    
    
   
  
  
  
  }

}

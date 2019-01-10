//메서드 재귀호
package ch06;

public class Test17{

  public static void main(String[] args){
          
     
    
        String name =System.getProperty("name");
        int kor =Integer.parseInt(System.getProperty("kor"));
        int eng =Integer.parseInt(System.getProperty("eng"));
        int math =Integer.parseInt(System.getProperty("math"));
        int sum =kor +eng+math;
          
              
          System.out.printf("이름:%s\n",name);
          System.out.printf("국,영,수 총점:%s\n",sum);
          System.out.printf("국,영,수 평균:%s\n",sum/3f);
      
  }
  
  }
 
 
 




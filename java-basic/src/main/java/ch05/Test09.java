
package ch05;

public class Test09{

  public static void main(String[] args){
    int a=1;
    while(a<=10) {
      if(a% 2==0) {
        a++;
        continue;
      }
      System.out.println(a + "");
      a++;
    }
    
  }
       
}


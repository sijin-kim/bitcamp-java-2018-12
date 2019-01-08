
package ch04;

public class Test13{

  public static void main(String[] args){
    int a =0xca;
    int b =0x66;
    System.out.println(a&b);
    
    System.out.println(a|b);

       System.out.println(a^b);
       System.out.println(~a);
       
       int data =0b0111_1001_0111_1111;
       System.out.println(Integer.toBinaryString (data & 0b0000_1111_1100_0000));
       
       
   }
   
  
  }



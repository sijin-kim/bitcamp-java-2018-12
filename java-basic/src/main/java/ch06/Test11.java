//call by value  와 call by reference
package ch06;

public class Test11{

  public static void main(String[] args){
    int value = 100;
    m1(value);
    System.out.println(value);
    
    //2call by reference
    int[] arr =new int[] {100,200,300};
    System.out.println(arr[0]);

    m2(arr);
    System.out.println(arr[0]);
    System.out.println(arr[2]);
  }
  static void m1(int value) {
    value *=2;
  }
  static void m2(int[] arr) {
      arr[1] =111;
      arr[2] =222;
  }
  
  }
 
 
 




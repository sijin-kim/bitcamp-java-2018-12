//메서드의 리턴값
package ch06;

public class Test07{

  public static void main(String[] args){
    int result =plus1();
     System.out.println(result);
     
     result =plus1(10,20);
     System.out.println(result);
  
    
   
     System.out.println(result);
    plus2(new int[] {10});
    plus2(new int[] {10,20});

    
  }
  
  static int plus1(int...value) {
    int sum =0; //메서드 안에 선언된 변수를 로컬 변수라 한다
    for(int i=0; i<value.length; i++) {
      sum +=value[i];
    }
      return sum;
  }
  
  static int plus2(int[]value) {
    int sum =0; //메서드 안에 선언된 변수를 로컬 변수라 한다
    for(int i=0; i<value.length; i++) {
      sum +=value[i];
    }
      return sum;
  }
  
}

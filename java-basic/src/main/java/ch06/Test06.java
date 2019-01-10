//메서드의 리턴값
package ch06;

public class Test06{

  public static void main(String[] args){
  
    int result =plus();
    System.out.println(result);
    
    result =plus(2);
    System.out.println(result);
    
    result =plus(2,3);
    System.out.println(result);
    result =plus(2,3,4);
    System.out.println(result);
    
    result =plus(new int[] {10,20,30});
    System.out.println(result);
    
    
    
    
  }
  
  static int plus(int...value) {
    int sum =0; //메서드 안에 선언된 변수를 로컬 변수라 한다
    for(int i=0; i<value.length; i++) {
      sum +=value[i];
    }
      return sum;
  }
  
}

// 
package ch07;
      


class Score1 {
  String name; 
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
}

public class Test09 {
  
  //중첩 클래스
  // 클래스 안에 소속된 클래스이다.
  //보통 특정 클래스 안에서만 사용될 경우 중첩 클래스로 정의한다.
//  stauic 중첩 클래스 
  static class Score2 {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
   class Score3 {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  public static void main(String[] args) throws Exception {
    
    //로컬 클래스
    class Score4 {
      String name; 
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }
    
  }
  
    static void m1() {
        
      Score1 s1 =new Score1();
      
      Score2 s= new Score2();
      
   //   Score s3= new Score3();
      }
     void m2() {
      
      Score1 s1 =new Score1();
      
      Score2 s2= new Score2();
      
     Score3 s3= new Score3();
    }

}


  
  



















// 클래스 사용 후
package ch07;

public class Test03 {
  
  static class Score {
    String name;  // 설계 도면이기 때문에 변수가 존재하는 상태가 아니다.
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  public static void main(String[] args) throws Exception {
    
    
    Score s1;  // Score 설계도에 따라 준비한 메모리(변수들)의 주소를 저장하는 변수 
    s1 = new Score(); // Score 설계도에 따라 메모리(변수들)를 준비시킨다.
    
    Class c = Class.forName("ch07.Test03$Score");
    Score s3 = (Score)c.newInstance();
    
    
    Score s2 = new Score();
    
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    
    
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;
    
    s3.name = "유관순";
    s3.kor = 80;
    s3.eng = 80;
    s3.math = 80;
    
    printScore(s1); 
    
    printScore(s2);
    
    printScore(s3);
  
  }
  
  // 새 데이터 타입의 메모리 주소를 받을 변수를 파라미터로 선언한다.
  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
  
}

/*
# 자바 기본 데이터 타입의 변수 선언 vs 클래스의 변수 선언
- 자바 기본 데이터 타입은 변수를 선언하는 순간 메모리에 생성된다.
    int a;  // 바로 int 값을 저장할 메모리가 준비된다.
- 클래스의 변수 선언은 주소를 담는 레퍼런스이다. 따라서 주소를 담는 메모리만 준비된다.
    Score s;  // 아직 Score 설계도에 따라 변수들이 준비된 상태가 아니다.
- 클래스의 설계도에 따라 메모리를 준비하려면 따로 new 명령을 사용해야 한다.
    new Score();
- 생성된 메모리를 사용하려면 주소를 잘 보관해 두어야 한다.
    s = new Score();
    
 */

















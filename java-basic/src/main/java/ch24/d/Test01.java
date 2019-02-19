package ch24.d;

public class Test01 {

  public static void main(String[] args) {
    Account acc = new Account("홍길동", 1000000);
    
    ATM kang101 = new ATM("강남-101", acc);
    ATM kang102 = new ATM("강남-102", acc);
    ATM kang103 = new ATM("강남-103", acc);
    
    kang101.start();
    kang102.start();
    kang103.start();
  
     // 세마포어(n); semaphore 
    // => 크리티컬 섹션에 진입할수 있는 스레드에 수를 지정한다.
    // 자바에서는 세마포어를 지원하지 않는다.
    // 개발자가 직접 처리해야한다.
    // 뮤텍스 : mutex (mutual exclusion ,상호배제)
    // 한 번에 오직 한 개의 스레드만이 크리티컬 섹션에 접근 할수 있다.
    // 예) 선풍기 풍량세기,라디오,TV채널 
    // SEMAPHORE(1)과 같다.
    // 자바는 sysnchronized 키워드를 통해 뮤텍스를 사용 할수 있다.
  }

}

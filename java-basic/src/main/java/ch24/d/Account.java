package ch24.d;

public class Account {
  String name;
  double balance;
  
  public Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  synchronized public double withdraw(double money) { 
    //이 메서드처럼 여러 스레드가 같은 메모리의 값을 동시에 변경할 때
    //문제가 발생하는 코드를 크리티컬 색션 또는 크리티털 리젼이라고한다.
    //크리티컬 섹션에 동시에 접근하지 못하게 하는 기법을
    // 뮤텍스 또는 세마포어(1)(semaphore)"라 부른다.
    // 자바에서 뮤텍스를 구현하는 방법
    //  sychronized
    double temp = this.balance;
    
    if (temp - money < 0)
      return 0;
    
    temp = temp - money;
    
    this.balance = temp;
    
    return money;
  }
  
  
}

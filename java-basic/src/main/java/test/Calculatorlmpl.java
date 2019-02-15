package test;
//실제로 계산을 처리하는 객체  calcuator 인터페이스를 상속 이 규칙에 따라서
public class Calculatorlmpl implements Calculator{

  @Override
  public int plus(int a, int b) {
    return a + b;
  }

  @Override
  public int minus(int a, int b) {
    return a-b;
  }

}

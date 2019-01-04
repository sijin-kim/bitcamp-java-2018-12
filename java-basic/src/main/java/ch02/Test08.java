//논리 리터럴

package ch02;

public class Test08{

  public static void main(String[] args){
    System.out.println(true);
    System.out.println(false);
   // System.out.println((boolean)1); 자바느 정수값을 true/false 로 형변환할수없다
    // 작은 따음표(single quoto)의 리턴값은 2바이트 정수 값 (utf-16 코드)이다.
    if('가' == 0xac00) {
      System.out.println("맞다");
    }else {
      System.out.println("아니다!");
    }
/*
    if(10-10) {   컴파일 오류
      System.out.println("참이다");
  */
    }
}




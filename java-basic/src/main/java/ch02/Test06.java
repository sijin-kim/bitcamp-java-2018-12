//부동소수점의 구동 원리
package ch02;

public class Test06{
  
  public static void main(String[] args){
    System.out.println(0xac00); //utf-16
    // 해당숫자가 utf-16문자 코드임을 알려주지 않으면 println은
    // 그냥 일반 숫자인 줄 알고 10빈수로 출력한다.
    //이 숫자가 평범한 숫자가 아니라
    //문자의 utf-16 코드 값임을 알려줘라
    //utf-16은 2바이트 크기를 갖는다.
   //코드의 값은 0~65535 이다.
   //음스가 없다.
    // 참고 숫자 2바이트의 범위는 -32768~ 32767 이다.
    
    System.out.println((char) 0xac00);
    
    //문자의 코드를 알지못한다면 작은 따음표를 이용할수 있다
    //'가'?ㄴ
    //한글 가의 UTF-16값을 리턴 한다.
    //또한 이 값이 문자의 코드 값임을 알려준다.
    System.out.println('가');
    System.out.println('가'+2);
    System.out.println((char)('가'+2));
    
    // 작은 따음표 안에 직접 유니코드를 표기할 수 있다.
    System.out.println('\uac00');
    //작은 따음표 안에 직접 유니코드를 지정하는 경우?
    System.out.println('\u32d4');
    
}

}
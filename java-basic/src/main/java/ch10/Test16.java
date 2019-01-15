// 생성자 활용 - java.util.Calendar 

package ch10;

import java.util.Calendar;
import java.util.Date;

public class Test16 {
  
  public static void main(String[] args) {
   
    Calendar c1;
    
    //생성자가 있다하더라도 접근 권한이 없으면 호출할 수 없다.
    
//    c1= new Calendar();
    
//     Calendar는 인스턴스 생성을 도와주는 별도의 클래스 메서드 (스태틱 메서드)를 제공한다.
          c1 =Calendar.getInstance();
          System.out.println(c1.get(Calendar.YEAR));
          
          /*
           *  팩토리 메서드(facorty method)
           *  디자인 패턴
           *  - 인스턴스를 생성해주는 메서드이다.
           *  인스턴스를 생성과정이 복잡할 경우에 인스턴스를 생성해주는 메서드를 미리 정의해 둔다.
           *  
           *  싱글톤 (singleton)
           *  인스턴스를 한개만 생성하도록 제한할 떄 사용한다.
           *  생성자를 pirvate으로  처리하여 직접 인스터스를 생성하지 못하도록 만든다/
           */
          
  }
 
  }

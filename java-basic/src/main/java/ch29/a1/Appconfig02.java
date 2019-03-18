package ch29.a1;

import org.springframework.context.annotation.Bean;


//bean 어노테이션 메서들 통해 객체 == 인스터스 =구현체 생성 리턴받기
public class Appconfig02 {
@Bean public Student1 b1() {
  return new Student1();
}

  
  
}

package ch29.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {

  public static void main(String[] args) {

    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch29/a1/application-contextt.xml");
    
    System.out.println("실행완료");
    
    ApplicationContext iocContainer1 = 
        new AnnotationConfigApplicationContext(Appconfig1.class);
    System.out.println("정상연결");
    
  }

}

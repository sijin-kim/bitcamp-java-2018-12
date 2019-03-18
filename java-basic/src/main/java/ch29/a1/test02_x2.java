package ch29.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02_x2 {

  public static void main(String[] args) {
    
        ApplicationContext iocContair =
            new ClassPathXmlApplicationContext("ch29/a1/application-contextt2.xml");
        
        System.out.println(iocContair.getBean("b1"));
    
    
    
    
  }

}

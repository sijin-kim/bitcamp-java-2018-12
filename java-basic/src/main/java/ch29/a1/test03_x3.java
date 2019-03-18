package ch29.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test03_x3 {

  public static void main(String[] args) {
    
        ApplicationContext iocContair =
            new ClassPathXmlApplicationContext("ch29/a1/application-contextt3.xml");
        
        
        
        Student1 s1 = (Student1) iocContair.getBean("student1");
        System.out.println(iocContair.getBean("student1"));
    
    
    
    
  }

}

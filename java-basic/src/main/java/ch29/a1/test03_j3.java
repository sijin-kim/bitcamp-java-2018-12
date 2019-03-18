package ch29.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test03_j3 {

  public static void main(String[] args) {
    
    ApplicationContext iocContair =
        new AnnotationConfigApplicationContext(Appconfig3.class);
    
    
    Student1 s1 = (Student1) iocContair.getBean("student1");
    System.out.println(s1);
    
    
    System.out.println(iocContair.getBean("student1"));
    
    
    
    
  }

}

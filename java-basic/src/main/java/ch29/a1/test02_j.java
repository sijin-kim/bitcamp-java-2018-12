package ch29.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test02_j {

  public static void main(String[] args) {
    
    ApplicationContext iocContanir = 
        new AnnotationConfigApplicationContext(Appconfig02.class);
    
    Student1 s = (Student1) iocContanir.getBean("b1");
    System.out.println(s);
    
    System.out.println(iocContanir.getBean("b1"));
    
    
    
    
  }

}

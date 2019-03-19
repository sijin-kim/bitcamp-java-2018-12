// BeanPostProcessor - @Autowired 사용법: 필드에 븉여도된다 .
package ch29.h;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
  public static void main(String[] args) {
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch29/h/application-context-06.xml");
    
    System.out.println("---------------------------------------");
    
    System.out.println(iocContainer.getBean("c1"));
    
    
  }
}







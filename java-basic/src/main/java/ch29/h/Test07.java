// BeanPostProcessor - @Autowired 사용법: 필드에 븉여도된다 .
package ch29.h;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {
  public static void main(String[] args) {
    ApplicationContext iocContainer = 
        new ClassPathXmlApplicationContext("ch29/h/application-context-07.xml");
    
    
    //@qualifier("객체이름") 를 사용하여 여러개의 객체 중에서 어떤 것을 주입할 지 지정한다.
    System.out.println("---------------------------------------");
    
    System.out.println(iocContainer.getBean("c1"));
    
    
  }
}







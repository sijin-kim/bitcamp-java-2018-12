package ch29.j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import ch29.j2.sub1.Sub1Car;

//@Configuration // 스프링 IoC 컨테이너에게 이 클래스를 직접 알려주기 때문에 이 애노테이션은 필요없다.
@ComponentScan(basePackages="ch29.j2")
public class AppConfig4 {
  
  // 애노테이션을 사용할 수 없는 경우 다음과 같이 수동으로 객체를 생성할 수 있다.
  // 이때 @Bean 애노테이션을 붙여 이 메서드를 호출하라고 스프링 IoC 컨테이너에게 알려줘야 한다.
  // 스프링 IoC 컨테이너는 이 메소드를 호출한 후 그 리턴 값을 메서드 이름으로 저장한다.
  // 만약 @Bean 애노테이션이 따로 이름을 지정한다면 그 이름으로 리턴 값을 저장한다.
  // 
 
  @Bean
  public BlackBox blackBox() {
    
    BlackBox obj= new BlackBox();
    obj.setMaker("시진메이커");
    obj.setModel("시진정밀블랙박스");
    return obj;
    
  }
  
  @Bean
  public Car car1(BlackBox blackBox) {
    Car c = new Car();
    c.setMaker("시진메이커");
    c.setModel("시진제트기");
    c.setCc(20000);
    c.setBlackBox(blackBox);
    return c;
    
  }
  
  @Bean
  public Car car2(ApplicationContext iocContainer) {
    BlackBox a = (BlackBox) iocContainer.getBean("blackBox");
    Car c1= new Car();
    c1.setMaker("승빈메이커");
    c1.setModel("승빈로켓");
    c1.setCc(20000);
    c1.setBlackBox(a);
    
    return c1;
   
    
  }
  
}







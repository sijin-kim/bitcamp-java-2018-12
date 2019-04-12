package bitcamp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// WebApplicationInitializer 구현체를 만드는 두 번째 방법
// => 인터페이스를 직접 구현하는 대신에 그 인터페이스를 구현한 
//    AbstractAnnotationConfigDispatcherServletInitializer 클래스를 상속 받기
// 
//
public class WebApplicationInitializerImpl2 
extends AbstractAnnotationConfigDispatcherServletInitializer {


  
  
  
  

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    // 이 메서드가 호출될 때 간단한 메시지를 출력하기 위해 오버라이딩 하였다.
    // 따라서 원래의 메서드를 반드시 호출해줘야 한다.
    System.out.println("WebApplicationInitializerImpl2.onStartup()...호출됨!");
    super.onStartup(servletContext);
  }

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    // ioc 컨테이너 등록
    return new Class<?>[]  {AppConfig.class};
  }

  @Override
  protected String[] getServletMappings() {
    // dispatcher를 등록할때 리턴되는 값은  url패턴
    return  new String [] {"/app/*"};
  }
  
  @Override
  protected String getServletName() {
    // dispacher 등록할때 호출되는 메서드
    // 서블릿 이름을 지정하지않고 오버라이딩 하지않으면 기
    return "app7";
  }
  
}













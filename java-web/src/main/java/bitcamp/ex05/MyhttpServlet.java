package bitcamp.ex05;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//서블릿 클래스를 만들떄 http 프로토콜을 쉽게 다룰 수 있도록 
// service() 이 메서드를 추가하였다.
// 따라서 gebericservlet을 상속 받아 서블릿을 만들기 보다
// 이 클래스를 상속 받아 서블릿을 만든다면
// 훨씬 편하게 service()를 구현할 수있다.

 @SuppressWarnings("serial")
public abstract class MyhttpServlet extends GenericServlet{

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) res;
    
    
    this.service(request, response);
    
  }
  
protected void service(HttpServletRequest request,HttpServletResponse response) 
  throws ServletException,IOException{
  
}
}

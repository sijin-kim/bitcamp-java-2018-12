// 클라이언트가 보낸 데이터 읽기 -myhttpservlet2 클래스 활용하기
package bitcamp.ex05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex05/s4")
public class Servlet04 extends HttpServlet {
  
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException,IOException{
    
    // 테스트
    // - http://localhost:8080/java-web/ex05/test04.html 실행
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("get방식입니다.");
    
    // httpservletrequest에는 http 프로토콜의 요청방식을 리턴하는 메서드가 있따.
  
    
  }
  
  @Override
  protected void doPost(HttpServletRequest request,HttpServletResponse response)
      throws ServletException,IOException{
    
    // 테스트
    // - http://localhost:8080/java-web/ex05/test04.html 실행
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("get방식입니다.");
    
    // httpservletrequest에는 http 프로토콜의 요청방식을 리턴하는 메서드가 있따.
  
    
  }
  
  
}








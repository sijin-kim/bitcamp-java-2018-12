// 보관소에 값넣기
package bitcamp.ex09;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex09/s1")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet {
  
  @Override
  protected void service(
      HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
    
    // 테스트 방법:
    // => http://localhost:8080/java-web/ex09/s1
    
    //1)servlet context 보관소에 값 넣기
    
    ServletContext sc= this.getServletContext();
    sc.setAttribute("v1", "aaa");
    
    //2) httpsession 보관소에 값넣기
    // => 이 요청을 한 클라이언트의 httpsession 객체가 없다면 만들어준다.
    // => 이미 이 클라이언트 위해 만든 객체가 있다면 그 객체를 리턴한다.
    HttpSession session = request.getSession();
    session.setAttribute("v2", "bbb");
    
    
    request.setAttribute("v3", "cccc");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("보관소에 값을 넣었다- /ex09/s1");
    
    
    
    
  }
}


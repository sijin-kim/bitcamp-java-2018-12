package com.eomcs.lms.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@SuppressWarnings("serial")
@WebServlet("/member/search")
public class MemberSearchServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext sc = this.getServletContext();
    ApplicationContext iocContainer = 
        (ApplicationContext) sc.getAttribute("iocContainer");
    MemberService memberService = iocContainer.getBean(MemberService.class);
    
    String keyword = request.getParameter("keyword");
    List<Member> members = memberService.list(keyword);
    
    if (members == null) {
      request.setAttribute("error/title", "회원 번호가 없습니다.");
      request.setAttribute("error.content", "해당번호의 회원이없습니다.");
      request.getRequestDispatcher("/error.jsp").forward(request, response);
    }
    
    request.setAttribute("search", members);

    response.setContentType("text/html;charset=UTF-8");
    
    request.getRequestDispatcher("/member/serach.jsp").include(request, response);
  }
  
}

package com.eomcs.lms.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;


@WebFilter("/*")
public class CharacterEncodingFilter implements Filter{

  @Override
  public void doFilter(ServletRequest request,
      ServletResponse response, 
      FilterChain chain)
      throws IOException, ServletException {
    
    // post요청으로 들어오는 경우 데이터의 인코딩이 utf-8임을 지저한다.
    request.setCharacterEncoding("UTF-8");
    // 그런 후에 다음 필터나 또는 최종 목적지인 서블릿을 실행한다.
    chain.doFilter(request, response);
    
    
    
  }
  
}

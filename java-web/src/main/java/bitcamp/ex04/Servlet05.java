// 멀티파트 파일 업로드 처리하기 - 서블릿3.0 기본 라이브러리 사용 
package bitcamp.ex04;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

// 멀티파트 형식의 데이터를 처리할 서블릿으로 선어하라
//@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
@WebServlet("/ex04/s5")
public class Servlet05 extends GenericServlet {

  private static final long serialVersionUID = 1L;
  private  String uploadDir;

  @Override
  public void init() throws ServletException {

    this.uploadDir=this.getServletContext().getRealPath("/upload");

  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {


    // 테스트
    // - http://localhost:8080/java-web/ex04/test05.html 실행

    req.setCharacterEncoding("UTF-8");
    // 파리미터로 받은 serveltrequest 를 원래의 타입으로 변환하라
    HttpServletRequest httpReq =(HttpServletRequest) req;
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.printf("<html>");
    out.printf("<head><title>servlet04</title></head>");
    out.printf(" <body><h1>파일 업로드 결과</h1>");
    
    //일반 폼 데이터를 원래 하던 방식대로 값을 꺼낸다.
    
    out.printf("이름=%s<br>\n", httpReq.getParameter("name"));
    out.printf("나이=%s<br>\n", httpReq.getParameter("age"));
    
   Part photoPart =httpReq.getPart("photo");
   String filename ="";
   if(photoPart.getSize() >0) {
      filename = UUID.randomUUID().toString();
     photoPart.write(this.uploadDir+ "/" + filename);
   }
    
    out.printf("사진 =%s<br>\n",filename);
    out.printf("<img src='../upload/%s'><br>\n",filename);
    out.printf("</body></html>");






}
}












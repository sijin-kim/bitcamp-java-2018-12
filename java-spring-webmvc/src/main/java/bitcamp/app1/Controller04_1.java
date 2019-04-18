// 요청 핸들러의 아규먼트 - 프론트 컨트롤러부터 받을 수 있는 파라미터값
package bitcamp.app1;

import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("/c04_1")
public class Controller04_1 {

  //ServletContext는 의존 객체로 주입받아야한다.
  // 요청 행핸들러에서 아규먼크로 받을수 없다.
 @Autowired ServletContext sc;
  
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
     // ServletContext sc, //ServletContext는 파라미터로 받을 수 없다. 예외 발생
                            //의존객체로 주입 받아야한다.
      ServletRequest request,
      ServletResponse response,
      HttpServletRequest request2,
      HttpServletResponse response2,
      HttpSession session,
      Map<String,Object> map,
      Model model,
     PrintWriter out //클라이언트에게 콘텐트를 보낼떄 사용할 출력스트림
      ) {
out.printf("ServletContext:%b\n",sc !=null);
out.printf("ServletRequest:%b\n",request !=null);
out.printf("ServletResponse:%b\n",response !=null);
out.printf("HttpServletRequest:%b\n",request2 !=null);
out.printf("HttpServletResponse:%b\n",response2 !=null);
out.printf("HttpSession:%b\n",session !=null);
out.printf("Map:%b\n",map !=null);
out.printf("Model:%b\n",model !=null);
  }

}

// 요청 핸들러의 파라미터 - @requestparam
package bitcamp.app1;

import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("/c04_2")
public class Controller04_2 {


  // 요청 핸들러에 아규먼트로 선언하면 된다.
  // 단 파라미터 앞에 @requstoaran 애노테이션을 붙인다.
  // 그리고 클라리이언트가 보낸 파라미터 이름을 지정한다.
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
      PrintWriter out,
      ServletRequest request,
      @RequestParam(value="name")String name1,
      @RequestParam(name="name")String name2,
      @RequestParam("name")String name3,
      String name// 파라미터 이름과 아규먼트의 이름이 같다면 애노테이션을 생략해도된다.
      ) {
    out.printf("name=%s\n",request.getParameter("name"));
    out.printf("name=%s\n",name1);
    out.printf("name=%s\n",name2);
    out.printf("name=%s\n",name3);
    out.printf("name=%s\n",name);
  }

  @GetMapping("h2")
  @ResponseBody 
  public void handler2(
      PrintWriter out,
      @RequestParam("name1")String name1,//애노테이션을 붙이면 필수 항목으로 인지한다.
      // 따라서 파라미터 값이 없으며 예외가 발생한다.
      String name2,// 파라미터 이름과 아규먼트의 이름이 같다면 애노테이션을 생략해도된다.
      @RequestParam(value="name3",required = false)String name3,
      //required 프로퍼티를 false로 설정하면 선택항목으로 인지한다.
      @RequestParam(value="name4",defaultValue = "ohora")String name4
      ) {

    out.printf("name1=%s\n",name1);
    out.printf("name2=%s\n",name2);
    out.printf("name3=%s\n",name3);
    out.printf("name4=%s\n",name4);
  }

}

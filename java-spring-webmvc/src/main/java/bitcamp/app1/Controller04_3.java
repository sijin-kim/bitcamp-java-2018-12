// 요청 핸들러의 아규먼트 - 도메인 객체(값 객체; value object)로 요청 파라미터 값 받기
package bitcamp.app1;

import java.io.PrintWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("/c04_3")
public class Controller04_3 {

      //=> 요청 핸들러의 아규먼트가 값 객체라면
      // 프론트 컨트로럴는 메서드를 호출할 떄 
      //=>값 객체의 프로퍼티 이름과 일치하는 요청 파라미터가 있다면
  //model=sonata&maker=hyundai&capacity=5&auto=tue
 
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
      PrintWriter out,
     String model,
     String maker,
     int capacity,
     boolean auto,
     Car car
     
      ) {
    out.printf("model=%s\n",model);
    out.printf("maker=%s\n",maker);
    out.printf("capacity=%s\n",capacity);
    out.printf("auto=%s\n",auto);
    out.printf("car=%s\n",car);
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

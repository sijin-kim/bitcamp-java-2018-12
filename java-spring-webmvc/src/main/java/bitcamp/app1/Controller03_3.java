// 파라미터 이름으로 request handler 구분하기
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/c03_3")
public class Controller03_3 {

  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/html/app1/c03_3.html
  // => 요청 헤더 중에서 특정 이름을 갖는 헤더가 있을 떄 호출될 메서드를 지정할수있다.
  // => 웹페이지에서 링크를 클릭하거나 입력 폼에 값을 넣고 등록 버튼을 누르는
  // 일반적인 상황에서는 요청헤더에 임의의 헤더를 추가할 수 없다.
  //=> 자바스크립트 등의 프로그래밍으로 임으의 http 요청할떄 
  // HTTP 프로토콜에 표준이 아닌 헤더를 추가할 수있다.
  // 그럴떄 이기능을 사용하는 것이다.
  // 보통 open API를 개발하는 서비스 회사에서 많이 사용한다.
  @GetMapping(produces = "text/plain") 
  @ResponseBody 
  public String handler1() {
    return "handler1";
  }
  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/html/app1/c03_1?age=20
  @GetMapping(produces = "text/html") // POST 요청일 때만 호출된다. 
  @ResponseBody 
  public String handler2() {
    return "handler2";
  }
  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/app1/c03_1?name=kim&age=20
  @GetMapping(produces = "application/json") // POST 요청일 때만 호출된다. 
  @ResponseBody 
  public String handler3() {
    return "handler3";
  }
  @GetMapping // POST 요청일 때만 호출된다. 
  @ResponseBody 
  public String handler4() {
    return "handler4";
  }
}

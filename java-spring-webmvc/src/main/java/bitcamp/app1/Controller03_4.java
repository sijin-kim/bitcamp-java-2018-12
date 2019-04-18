// 파라미터 이름으로 request handler 구분하기
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/c03_4")
public class Controller03_4 {

  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/html/app1/c03_3.html
  // => 요청 헤더 중에서 특정 이름을 갖는 헤더가 있을 떄 호출될 메서드를 지정할수있다.
  // => 웹페이지에서 링크를 클릭하거나 입력 폼에 값을 넣고 등록 버튼을 누르는
  // 일반적인 상황에서는 요청헤더에 임의의 헤더를 추가할 수 없다.
  //=> 자바스크립트 등의 프로그래밍으로 임으의 http 요청할떄 
  // HTTP 프로토콜에 표준이 아닌 헤더를 추가할 수있다.
  // 그럴떄 이기능을 사용하는 것이다.
  // 보통 open API를 개발하는 서비스 회사에서 많이 사용한다.
  @PostMapping(consumes = "application/x-www-form-urlencoded") 
  @ResponseBody 
  public String handler1() {
    return "handler1";
  }
  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/html/app1/c03_4.html
  //클라이언트가 요청으로 데이터를 보낼떄 기본 형식은 다음과 같다 
  //application/x-www-form-urlencoded
  // => <form 태그에서 enctype= 속성에 "mulpart/form-data"를 지정하면 
  // 해당 형식으로 서버에 값을 보낸다.
  // 자바 스크립트를 사용하여 개발자가 임의의 형식으로 값을 보낼 수 있다.
  //클라이언트가 보내는 값의 유형에 따라 호출될 메서드를 구분할 수있다.
  @PostMapping(consumes = "multipart/form-data") 
  @ResponseBody 
  public String handler2() {
    return "handler2";
  }
  // 테스트 방법:
  // => http://localhost:8080/java-spring-webmvc/app1/c03_1?name=kim&age=20
  @PostMapping(consumes = "text/csv") 
  @ResponseBody 
  public String handler3() {
    return "handler3";
  }
  @PostMapping(consumes = "application/json") 
  @ResponseBody 
  public String handler4() {
    return "handler4";
  }
  @RequestMapping
  @ResponseBody 
  public String handler5() {
    return "handler5";
  }
}

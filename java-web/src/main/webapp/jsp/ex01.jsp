<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp구동원리</title>
</head>
<body>
<h1>jsp구동원리</h1>
<pre>
1)웹브라우저 ==> 서블릿 컨테이너
 - JSP 실행 요청
 
 2) 사블릿 컨테이너가 실행
  - JSP의 서블릿 객체를 찾는다.
   -있으면,
    - 그 서블릿 객체를 호출한다.
    -없으면
     -JSP 엔진을 이용하여 JSP파일을 가지고 서블릿 자바 소스 파일을 생성한다.
     - 자바 컴파일러를 이용하여 소스 파일을 컴파일 한다.
     - 서블릿 객체를 호출한다.
     -그 서블릿 객체를 호출한다.
     3)서블릿 컨테이너 --> 웹브라우저
     -서블릿 실행 결과를 응답
     
     JSP파일을 가지고 생성한 서블릿 소스와(.java) 클래스 파일(.class)의 위치
     -org.eclipse.wst.werver.core/tmpx/work/...
     
     정리!
    -jsp 파일은 Python 이나 php처럼직접 그 스크립트가 인터프리팅 되는 것이 아니다.
    -jsp 엔진의 역할을 jsp파일을 분석하여 서블릿 클래스를 생성하는 것이다.
    - 즉 jsp파일이 직접 실행되지 않는다.
    
   JSP
   -자바 서블릿 클래스를 만드는 재료로 사용된다.
   -그래서 서블릿 클래스를 만드는 틀 이라 해서 템플릿이라 부른다.
   -jsp를 템플릿 기술이라 부르기도 한다.
  
  jsp공부법
  -jsp를 작성할 떄 사용하는 특정 태그들이 어떤 자바 코드를 생성하는지 이해하는 것이 중요하다.
  
  jsp실행을 요청하기
  -jsp 파일이 있는 위치를 지정한다.
  예) http://localhost:8080/java-web/jsp/ex01.jsp
  
  jsp를 변경한 후 실행을 요청하기
  - 그냥 jsp파일이 있는 위치를 지정하면 된다.
  - 위에서 설명한대로 jsp구동 원리에 따라 동작된다.


</pre>
</body>
</html>
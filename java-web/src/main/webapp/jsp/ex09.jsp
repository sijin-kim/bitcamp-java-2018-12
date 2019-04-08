<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06</title>
</head>


<body>
<h1>지시문 (directiove element))- tablib</h1>
<c:forEach items="홍길동,임꺽정 ,유관순,안중근,윤봉길,김구,김원봉" var="n">
이름 =<%=pageContext.getAttribute("n")%><br>
</c:forEach>

</body>
</html>
<%--
=>외부의 따로 정의된 jsp확장 테그를 가져올때 사용한다.
=> jsp확장 태그
예) jstl (jsp standard tahg library)
-- jps 명세에 추가로 정의된 태그이다.
- serlvet /jsp api에서는 jstl 구현체를 제공하지 않는다.
- 따로 구현된 라이브러리를 다운 받아야한다.
- 보통 apache.org 사이트에서 구현한 것을 사용한다.
2) 개발자가 정의한 태그 
- 개발자가 따로 자신이 사용할 태그를 정의할수 있다.
-그러나 실무에서는 유지보수의 일관성을 위해 jstl과 같은 표준 api를 사용한다.
- 즉 개발자가 자신의 회사에서만 사용할 태그를 따로 정의하지 않는다.

=> 사용방법

  <%@ taglib uri=
  "확장 태그를 정의할때 부여한 확장 태그 uri"
   prfix="확장태그를 사용할 떄 붙이는 접두사" %>
   jsp페이지에서 사용하기
   <확장태그접두사: 사용다 태그명 속성명="값".../>

 --%>


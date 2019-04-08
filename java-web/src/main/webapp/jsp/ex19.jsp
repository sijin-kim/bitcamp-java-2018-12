<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex19</title>
</head>


<body>
<h1>jsp 액션 태그 - jsp:include(계속)</h1>

<jsp:include page="ex19_header.jsp"></jsp:include>

<p>테스트</p>

<jsp:include page="ex19_footer.jsp"></jsp:include>

</body>
</html>
<%--
jsp:include
=> 다른 페이지에 실행을 위임할 떄 사용한다.,
실행이 끝난 후 제어권이 되돌아 온다.,
=> 따라서 page 속성에 지정하는 url은 서블릿/jsp이어야 한다.
=> requestdispatcher .include() 코드를 생성한다.

jsp:forward
=> 다른 패이지로 실행을 위임할 때 사용한다.
제어권이 넘어가면 되돌아 오지 않는다.,
requestdispatcher .forword() 코드를 생성한다.
 --%>


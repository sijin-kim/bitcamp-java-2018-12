<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    isErrorPage="true"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10</title>
</head>


<body>
<h1>jsp 빌트인 객체 jsp에서 기본으로 사용 </h1>

</body>
</html>
<%--
 jps 빌트인 객체
 - jsp를 가지고 서블릿 클래스를 만들때 _JSPSERVICE() 메서드의 기본으로 준비하는 객체
 jsp 엔지는 반드시 다음과 같은 이름으로 래퍼런스를 선언해야한다.
 1) request- httpServletrRequest => _jspService () 파라미터이다. 
 2) response -httpServletResponse -=> _jspService () 파리미터이다.
 3)pageContext -Page COntext => jspService() 의 로컬 변수이다.

 --%>


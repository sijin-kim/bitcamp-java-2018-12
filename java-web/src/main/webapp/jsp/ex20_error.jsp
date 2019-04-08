<%@page import="java.util.ArrayList"%>
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
<title>ex20</title>
</head>


<body>
<h1>오류발생</h1>
<%=exception.getMessage() %>


</body>
</html>
<%--
오류가 발생했을떄 실행되는 jsp페이지는
execptiond이라는 변수를 통해 오류 내용
 --%>


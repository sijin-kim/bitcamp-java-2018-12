<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    errorPage="ex20_error.jsp"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex19</title>
</head>


<body>
<h1>pagge error, ispage error </h1>
10 / 0 = <%=10 / 0 %>


</body>
</html>
<%--
pageerror
=> jsp를 실행하는 중에 오류가 발생했을때 실행할 jsp를 지정할 수 있다.
=> 어떻게?
<%@ page errorPage="URL"%>

isErrorPage
=> 오류가 발생했을 때 실행되ㅏ는 js
 --%>


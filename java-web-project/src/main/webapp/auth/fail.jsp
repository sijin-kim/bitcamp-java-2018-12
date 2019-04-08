<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  String email = (String) request.getAttribute("email");
%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Refresh" content="2;url=login">
<title>로그인 </title>
</head>
<body>

  <jsp:include page="/header.jsp" />

  <h1>로그인 jsp</h1>
  <p>이메일 또는 암호가 맞지 않습니다.</p>

</body>
</html>
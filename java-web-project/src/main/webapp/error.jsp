
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<htm>
<head>
<title>실행오류</title>
</head>
<meta http-equiv="Refresh" content ="2;url=<%=request.getHeader("Referer")%>">
<body>
  <%
  out.flush();
    request.getRequestDispatcher("/header").include(request, response);
  %>
  <h1><%=request.getAttribute("error.title") %></h1>
    <p><%=request.getAttribute("error.content") %>
</body>
</html>
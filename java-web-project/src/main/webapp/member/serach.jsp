<%@page import="com.eomcs.lms.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
  <%
     List<Member> members = (List<Member>)request.getAttribute("search");
  %>
  
<!DOCTYPE html>
<html>
<head>
<title>회원 검색</title>
</head>
<body>
  <header>
    <img src='http://bitcamp.co.kr/img/logo.jpg' style='height: 50px'> <img
      src='/java-web-project/upload/member/fc405ff3-3852-40e4-b201-71a118341470'
      style='height: 20px;'> 베인<a href='/java-web-project/auth/logout'>로그아웃</a>
  </header>
  <h1>회원 검색</h1>
  <table border='1'>
    <tr>
      <th>번호</th>
      <th>이름</th>
      <th>이메일</th>
      <th>전화</th>
      <th>가입일</th>
    </tr>
    
    <%for (Member member : members) { %>
    <tr>
      <td><%=member.getNo() %></td>
      <td><a href='detail?no=<%=member.getNo()%>'><%=member.getName() %></a></td>
      <td><%=member.getEmail() %></td>
      <td><%=member.getTel() %></td>
      <td><%=member.getRegisteredDate() %></td>
    </tr>
    <% } %>
  </table>
  <p>
    <a href='list'>목록</a>
  </p>
</body>
</html>

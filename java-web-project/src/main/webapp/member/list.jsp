<%@page import="com.eomcs.lms.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%
  List<Member> list = (List<Member>) request.getAttribute("list");
  
%>
<!DOCTYPE html>
<html>
<head>
<title>회원 목록</title>
</head>
<body>

  <header>
    <img src='http://bitcamp.co.kr/img/logo.jpg' style='height: 50px'> <img
      src='/java-web-project/upload/member/null' style='height: 20px;'> 김시진<a
      href='/java-web-project/auth/logout'>로그아웃</a>
  </header>
  <h1>회원 목록</h1>
  <p>
    <a href='add'>새 회원</a>
  </p>
  <table border='1'>
    <tr>
      <th>번호</th>
      <th>이름</th>
      <th>이메일</th>
      <th>전화</th>
      <th>가입일</th>
    </tr>
    <%for (Member member : list){%>
    <tr>
      <td><%=member.getNo() %></td>
      <td><a href='detail?no=<%=member.getNo()%>'><%=member.getName() %></a></td>
      <td><%=member.getEmail() %></td>
      <td><%=member.getTel() %></td>
      <td><%=member.getRegisteredDate() %></td>
    </tr>
    <%}%>

  </table>
  <form action='search'>
    <input type='text' name='keyword'>
    <button type='submit'>검색</button>
  </form>
</body>
</html>
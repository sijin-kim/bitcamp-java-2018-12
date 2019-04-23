<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>수업 조회</title>
</head>
<body>

  <jsp:include page="../header.jsp" />

  <h1>수업 조회</h1>

<c:choose>
<c:when test="${empty lesson}">
  <p>해당 수업이 없습니다</p>
</c:when>
<c:otherwise>
  <form action='update' method='post'>
    <table border='1'>
      <tr>
        <th>번호</th>
        <td><input type='text' name='no' readonly value='${lesson.no}'></td>
      </tr>
      <tr>
        <th>수업</th>
        <td><input type='text' name='title' value='${lesson.title}'></td>
      </tr>
      <tr>
        <th>내용</th>
        <td><textarea name='contents' rows='5' cols='50'>${lesson.contents}</textarea></td>
      </tr>
      <tr>
        <th>시작일</th>
        <td><input type='date' name='startDate' value='${lesson.startDate}'></td>
      </tr>
      <tr>
        <th>종료일</th>
        <td><input type='date' name='endDate' value='${lesson.endDate}'></td>
      </tr>
      <tr>
        <th>총 교육시간</th>
        <td><input type='number' name='totalHours' value='${lesson.totalHours}'></td>
      </tr>
      <tr>
        <th>일 교육시간</th>
        <td><input type='number' name='dayHours' value='${lesson.dayHours}'></td>
      </tr>
    </table>
    <p>
      <a href='.'>목록</a> 
      <a href='delete/${lesson.no}'>삭제</a>
      <button type='submit'>변경</button>
    <p>
  </form>
</c:otherwise>
</c:choose>
</body>
</html>

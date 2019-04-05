
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<htm>
<head>
<title>새 글</title>
</head>

<body>

<jsp:include page="/header.jsp"/>

  <header>
    <img src='http://bitcamp.co.kr/img/logo.jpg' style='height: 50px'> <img
      src='/java-web-project/upload/member/null' style='height: 20px;'> 김시진<a
      href='/java-web-project/auth/logout'>로그아웃</a>
  </header>
  <h1>새 글(JSP)</h1>
  <form action='add' method='post'>
    <table border='1'>
      <tr>
        <th>내용</th>
        <td><textarea name='contents' rows='5' cols='50'></textarea></td>
      </tr>
    </table>
    <p>
      <button type='submit'>등록</button>
      <a href='list'>목록</a>
    </p>
  </form>
</body>
</html>
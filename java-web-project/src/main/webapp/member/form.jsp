<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
   
<!DOCTYPE html>

<html>
<head><title>새 회원</title></head>
<body>
<header>
  <img src='http://bitcamp.co.kr/img/logo.jpg' style='height:50px'>
<img src='/java-web-project/upload/member/null' style='height:20px;'> 김시진<a href='/java-web-project/auth/logout'>로그아웃</a></header>
<h1>새 회원</h1>
<form action='add' method='post' enctype='multipart/form-data'>
<table border='1'>
<tr>
  <th>이름</th>
  <td><input type='text' name='name'></td>
</tr>
<tr>
  <th>이메일</th>
  <td><input type='email' name='email'></td>
</tr>
<tr>
  <th>암호</th>
  <td><input type='password' name='password'></td>
</tr>
<tr>
  <th>사진</th>
  <td><input type='file' name='photo'></td>
</tr>
<tr>
  <th>전화</th>
  <td><input type='text' name='tel'></td>
</tr>
</table>
<p>
  <button type='submit'>등록</button>
  <a href='list'>목록</a>
</p>
</form>
</body>
</html>

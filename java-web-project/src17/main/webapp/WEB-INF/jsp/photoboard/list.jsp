<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>사진 목록</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>
  <jsp:include page="../header.jsp" />
  
  <div class="container">
  <h1>사진 목록</h1>
  <p><a href='form' class="btn btn-primary btn-sm">새 사진</a></p>
  <div class="bit-list">
  <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">등록일</th>
      <th scope="col">조회수</th>
      <th scope="col">수업</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="board">
    <tr>
      <th scope="row">${board.no}</th>
      <td><a href='${board.no}'>${board.title}</a></td>
      <td>${board.createdDate}</td>
      <td>${board.viewCount}</td>
      <td>${board.lessonNo}</td>
    </tr>
  </c:forEach>
  </tbody>
  </table>
  </div>
  
  <form action='search'>
    수업번호: <input type='text' name='lessonNo'> 검색어: 
    <input type='text' name='keyword'>
    <button type='submit'>검색</button>
  </form>
  <br>
  <nav aria-label="목록 페이지 이동">
  <ul class="pagination justify-content-center">
    <li class="page-item ${pageNo <= 1 ? 'disabled' : ''}"><a class="page-link" 
    href="?pageNo=${pageNo-1}&pageSize=${pageSize}">이전</a></li>
    
    <c:choose>
    
    <c:when test="${rowCount <= pageSize*3}">
      <c:forEach var="no" begin="1" end="${totalPage}" step="1">
        <li class="page-item"><a class="page-link" href="?pageNo=${no}&pageSize=${pageSize}">${no}</a></li>
      </c:forEach>
    </c:when>
        
    <c:otherwise>
      <c:choose>
        <c:when test="${pageNo == 1}">
          <c:forEach var="no" begin="1" end="3" step="1">
          <li class="page-item"><a class="page-link" href="?pageNo=${no}&pageSize=${pageSize}">${no}</a></li>
          </c:forEach>
        </c:when>
        <c:when test="${pageNo == totalPage}">
          <c:forEach var="no" begin="${totalPage-2}" end="${totalPage}" step="1">
          <li class="page-item"><a class="page-link" href="?pageNo=${no}&pageSize=${pageSize}">${no}</a></li>
          </c:forEach>
        </c:when>
      <c:otherwise>
        <c:forEach var="no" begin="${pageNo-1}" end="${pageNo+1}" step="1">
          <li class="page-item"><a class="page-link" href="?pageNo=${no}&pageSize=${pageSize}">${no}</a></li>
        </c:forEach>
      </c:otherwise>
      </c:choose>
    </c:otherwise>
    
    </c:choose>
    
    
    
    <li class="page-item ${pageNo == totalPage ? 'disabled' : ''}"><a class="page-link" 
    href="?pageNo=${pageNo+1}&pageSize=${pageSize}">다음</a></li>
  </ul>
</nav>
</div><!-- .container -->

<jsp:include page="../javascript.jsp"/>
</body>
</html>









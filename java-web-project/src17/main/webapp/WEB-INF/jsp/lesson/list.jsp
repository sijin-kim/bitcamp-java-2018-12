<%@ page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>수업 목록</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>
<jsp:include page="../header.jsp"/>

<div class="container">
<h1>수업 목록</h1>
<p><a href='form' class="btn btn-primary btn-sm">새 수업</a></p>

<table class="table table-hover">
<thead>
  <tr>
  <th scope="col">번호</th>
  <th scope="col">수업</th>
  <th scope="col">기간</th>
  <th scope="col">총교육시간</th>
  </tr>
</thead>
<tbody>
<c:forEach items="${list}" var="lesson">
  <tr>
    <th scope="row">${lesson.no}</th>
    <td><a href='${lesson.no}'>${lesson.title}</a></td>
    <td>${lesson.startDate} ~ ${lesson.endDate}</td>
    <td>${lesson.totalHours}</td>
  </tr>
</c:forEach>
</tbody>
</table>

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








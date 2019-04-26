<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>사진 조회</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>
  <jsp:include page="../header.jsp" />

<div class="container">
  <h1>사진 조회</h1>
<c:choose>
<c:when test="${empty board}">
  <p>해당 사진을 찾을 수 없습니다.</p>
</c:when>
<c:otherwise>
  <form action='update' method='post' enctype='multipart/form-data'>
  
  <div class="form-group row">
    <label for="no" class="col-sm-2 col-form-label">번호</label>
    <div class="col-sm-10">
      <input type="text" class="form-control-plaintext" id="no" 
             name='no' value='${board.no}' readonly>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="no" class="col-sm-2 col-form-label">사진 제목</label>
    <div class="col-sm-10">
      <input type="text" class="form-control-plaintext" id="title" 
             name='title' value='${board.title}' >
    </div>
  </div>
  
  <div class="form-group row">
    <label for="no" class="col-sm-2 col-form-label">등록일</label>
    <div class="col-sm-10">
      <input type="text" class="form-control-plaintext" id="createdDate" 
             value='${board.createdDate}' readonly>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="no" class="col-sm-2 col-form-label">조회수</label>
    <div class="col-sm-10">
      <input type="text" class="form-control-plaintext" id="viewCount" 
             value='${board.viewCount}' readonly>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="lessonNo" class="col-sm-2 col-form-label">수업</label>
    <div class="col-sm-10">
      <select class="custom-select" name='lessonNo'>
          <c:forEach items="${lessons}" var="lesson">
            <option value="${lesson.no}"
              ${board.lessonNo == lesson.no ? "selected" : ""}>${lesson.title}(${lesson.startDate}
              ~
              ${lesson.endDate})
            </option>
          </c:forEach>
        </select>
    </div>
  </div>
  
  
  <div class="form-group row">
    <div class="col-sm-10">
      <h6>최소 한 개의 사진 파일을 등록해야 합니다.</h6>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="photo" class="col-sm-2 col-form-label">사진1</label>
    <div class="col-sm-10">
      <input type="file" class="form-control-plaintext" id="photo"
      name='photo'>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="photo2" class="col-sm-2 col-form-label">사진2</label>
    <div class="col-sm-10">
      <input type="file" class="form-control-plaintext"
      name='photo'>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="photo3" class="col-sm-2 col-form-label">사진3</label>
    <div class="col-sm-10">
      <input type="file" class="form-control-plaintext"
      name='photo'>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="photo4" class="col-sm-2 col-form-label">사진4</label>
    <div class="col-sm-10">
      <input type="file" class="form-control-plaintext"
      name='photo'>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="photo5" class="col-sm-2 col-form-label">사진5</label>
    <div class="col-sm-10">
      <input type="file" class="form-control-plaintext" id="photo5"
      name='photo'>
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm-10">
      <c:set var="contextRootPath" value="${pageContext.servletContext.contextPath}"></c:set>
          <c:forEach items="${board.files}" var="file"> 
            <img src='${contextRootPath}/upload/photoboard/${file.filePath}' style='height: 80px'> 
          </c:forEach>
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm-10">
      <a class="btn btn-primary" href='.'>목록</a> 
      <a class="btn btn-primary" href='delete/${board.no}'>삭제</a> 
      <button class="btn btn-primary">변경</button>
      <a class="btn btn-primary" href='${contextRootPath}'>메인화면</a>
    </div>
  </div>
  
    <p>
      
    <p>
  </form>
</c:otherwise>
</c:choose>

</div><!-- .container -->

<jsp:include page="../javascript.jsp"/>
</body>
</html>
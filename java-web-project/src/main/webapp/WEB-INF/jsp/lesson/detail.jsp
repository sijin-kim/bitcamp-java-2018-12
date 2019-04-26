<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>수업 조회</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>

  <jsp:include page="../header.jsp" />
  <div class="container">
  <h1>수업 조회</h1>

<c:choose>
<c:when test="${empty lesson}">
  <p>해당 수업이 없습니다</p>
</c:when>
<c:otherwise>
  <form action='update' method='post'>
  
  <div class="form-group row">
    <label for="no" class="col-sm-2 col-form-label">번호</label>
    <div class="col-sm-10">
      <input type="text" class="form-control-plaintext" id="no" 
             name='no' value='${lesson.no}' readonly>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="title" class="col-sm-2 col-form-label">수업</label>
    <div class="col-sm-8">
      <input class="form-control" id="title" 
                name='title' value='${lesson.title}'/>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="contents" class="col-sm-2 col-form-label">내용</label>
    <div class="col-sm-8">
      <textarea class="form-control" id="contents" 
                name='contents' rows='5'>${lesson.contents}</textarea>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="startDate" class="col-sm-2 col-form-label">시작일</label>
    <div class="col-sm-8">
      <input class="form-control" id="startDate" type='date'
                name='startDate' value='${lesson.startDate}'/>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="endDate" class="col-sm-2 col-form-label">종료일</label>
    <div class="col-sm-8">
      <input class="form-control" id="endDate" type='date'
                name='endDate' value='${lesson.endDate}'/>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="totalHours" class="col-sm-2 col-form-label">총 교육시간</label>
    <div class="col-sm-8">
      <input class="form-control" id="totalHours" type='number'
                name='totalHours' value='${lesson.totalHours}'/>
    </div>
  </div>
  
  <div class="form-group row">
    <label for="dayHours" class="col-sm-2 col-form-label">일 교육시간</label>
    <div class="col-sm-8">
      <input class="form-control" id="dayHours" type='number'
                name='dayHours' value='${lesson.dayHours}'/>
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm-10">
      <a class="btn btn-primary" href='.'>목록</a> 
      <a class="btn btn-primary" href='delete/${lesson.no}'>삭제</a> 
      <button class="btn btn-primary">변경</button>
    </div>
  </div>
  </form>
</c:otherwise>
</c:choose>
</div><!-- .container -->

<jsp:include page="../javascript.jsp"/>
</body>
</html>

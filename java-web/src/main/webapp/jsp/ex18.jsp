<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex13</title>
</head>


<body>
<h1>jsp 액션 태그 - jsp:useBean(계속)</h1>

<!--  type 속성 대신에 class속성을 사용하면
id로 지정한 객체를 찾지 못했을때 해당 객체르 만들고
그 id로 저장한다.. -->
<jsp:useBean id="list" type="java.util.List<String>" class="java.util.ArrayList" scope ="page"/>

<%
// 제네릭 문법을 사용하지 못했기 떄문에 LIST의 타입은 java.util.arraylist이다.
// 따라서  for문에서 항목의 타입을 지정할때 string 으로 지정할수없다.
for (String n : list)
  out.println(n + "<br>");
%>

</body>
</html>
<%--
=> 따로 taglib를 사용하여 라이브러리를 선언할 필요가 없다.
=> jsp에서 기본으로 제공하기 떄문에 그대로 사용하면 된다.
=> 네임스페이스는 이름은 jsp이다.
<jsp: 태그명 .../>

jsp :useBean
=> jsp에서 사용할 객체를 생성할 떄 사용할 수 있다.
=> 또는 보관소에 저정된 객체를 꺼낼 떄도 사용한다.

=> 사용법
<jsp:useBean scope="보관소명" id ="객체명" class="클래스명"
=> 주요속성 
scope 
- 객체를 꺼내거나 생성된 객체를 저장할 보관소 이름
- 다음 4개의 값 중 한개를 지정할 수있다. 값을 지정하지 않으면 기본이  page이다.
-aaplication(servletcontext ) session (httpsession)
request(servletrequest) page

id
- 객체를 꺼내거나 저장할 떄 사용할 이름
class
- 보관소에서 객체를 찾을수 없을떄 생성할 객체의 클래스명 
- 반드시 패키지이름을 포함하여 클래스명(fully -qualifued name ; fqname )을 지정해야한다. 
<%@ page import= "..."
- 객체를 꺼내는 경우 레퍼런스의 타입으로도 사용된다.
-객체를 생성할 떄도 사용할수 있기 떄문에 반드시 콘크리트 클래스명이어야 한다.
- 추상클래스와 인터페이스는 객체를 생성할수 없기떄문에 안된다.

 --%>


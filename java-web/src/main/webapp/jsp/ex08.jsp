<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06</title>
</head>


<body>
<h1>지시문 (directiove element))- include</h1>
<%@ include file ="./ex08_header.txt" %>
<p>테스트</p>
<%@ include file ="./ex08_footer.txt" %>
</body>
</html>
<%--
includ 지시문
1) file =jsp에 포함시킬 파일경로
- 지정한 파일을 jps로  포함시킨 후에 자바 클래스를 생성한다.
- 자동 생성된 자바 서블릿 클래스의 소스를 확인해보라!
-- 따라서 일반 텍스트 파일이면 된다. jsp파일일 필요가없다.
- requestdispatecher의 inclide 와 다르다.
-비록 jsp파일이 아니더라도 <%@ page%>해당 파일의 문자표를 지정해야한다.
jsp엔진이 해당 파일의 내용을 가져올 떄 pageencoding에 지정된 문자집합으로
내용을 인식힌다.
또한 jsp 엔진은 <%@ page...%> 는 참고만 할뿐 가져오지 않는다. 

 --%>


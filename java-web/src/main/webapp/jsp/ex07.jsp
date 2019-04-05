<%@ page language="java" 
contentType="text/html; 
charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.Socket"
    import="java.net.ServerSocket"
    trimDirectiveWhitespaces="true"
    buffer="8kb"
    autoFlush="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06</title>
</head>


<body>
<h1>지시문 (directiove element))</h1>
<% for (int i=0; i<1000; i++){ 
out.print(". ");
}
%>

</body>



</html>

<%--
1)page
   -페이지의 특정 기능을 설정한다.
 2) include
 - 다른 파일의 내용을 복사 해온다.
 3)taglib
 - jstl 등 외부에서 정의한 태그 정보를 가져온다.
 
 page 지시문 
 1)language="java" 
    -jsp 페이지에서 코드를 작성할떄 사용할 언어를 지정한다.
    -즉 java 언어만 사용가능하다.
    - 이속성은 생략해도 된다.
    -- 다음 자바 코드를 생성한다.
    responee.setContentType 

6 )buffer ="8kb"
     - 출력 버퍼의 크기를 변경할 떄 사용한다.
     - 지정하지 않으면 기본이 8kb이다.
     -출력 내용이 버퍼의 크기를 엄으면 예외가 발생한다.
      서블릿에서는 자동으로 출력하였다.
      그러나 jsp에서는 예외가 발생한다.
      
     7) autoflush="true"
     - 출력버퍼가 찾을때 자동으로 출력한다.
     -기본은 true 이다.
     - false로 설정하면 출력 버퍼가 찼을때 예외가 발생한다.
--%>
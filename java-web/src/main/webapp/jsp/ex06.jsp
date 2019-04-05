<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06</title>
</head>

<%!
public void jspInit(){
  System.out.println("ex06.jsp의 jspInit()");
  
}
public void jspDestory(){
  System.out.println("ex06.jsp의 jspDestroty()");
  
}

%>

<body>
<h1>선언부 (declaration element)</h1>

100,000,000 의 입금 = <%=calculate(100000000)%>

</body>

<%!
double interest =0.025; // 인스턴스 변수

private String calculate(long money){ //인스턴스 메서드
  

    
 
  return String.format("%.2f",money+(money * interest));
}
%>

</html>

<%--
선언분 
-클래스에 맴버를 추가할 떄 사용한다.
- jspIint(나) jspDestroy ()와 같은 메서드를 오버라이딩 할 떄또 사용할 수있다.
-선언하는 위치는 상관없다.
-문법 :
<%! 맴버 선언 %>
-자바 코드는 :
 class JSP클래스{
 맴버 선언 
  void _jspService (){
  
  }
 }

--%>
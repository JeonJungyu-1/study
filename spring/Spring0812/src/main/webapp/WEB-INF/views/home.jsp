<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<form action="/sendData" method="post">
	<label>이름</label>
	<input type="text" name="member_nm"> <br>
	<label>나이</label>
	<input type="text" name="member_age"> <br>
	<label>성별</label>
	<input type="radio" name="member_gender" value="m">남성
	<input type="radio" name="member_gender" value="f">여성 <br>
	<input type="submit" value="전송">
</form>

<a href="/test1">데이터 요청</a>

<!-- EL 표현식 -->
<label>서버로부터 전달받은 데이터 : ${s} , ${n} , ${f}</label>
<br>

<!-- 조건식이 true이면 태그사이의 코드를 실행하고
false이면 태그사이의 코드를 실행하지 않는다. -->
<c:if test="${n > 10}">
	<p> 참일 경우 </p>
</c:if>

<c:choose>
	<c:when test="">
	
	</c:when>
	<c:when test="">
	
	</c:when>
	<c:when test="">
	
	</c:when>
	<c:otherwise>
	
	</c:otherwise>
</c:choose>

<c:forEach begin="1" end="10" var="num">
	${num} <br>
</c:forEach>

<c:forEach items="${l}" var="str">
	${str} <br>
</c:forEach>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	[ SES BLOG ]  
</h1>

<c:if test="${not empty sessionScope.loginId }">
<h2>
	${sessionScope.loginNm }(${sessionScope.loginId })님 환영합니다 !!!
</h2>
</c:if>

<ul>
	<c:choose>
		<c:when test="${empty sessionScope.loginId }">
			<li>
				<a href="/member/joinForm">회원 가입</a>
			</li>
			<li>
				<a href="/member/loginForm">로그인</a>
			</li>
		</c:when>
		<c:otherwise>
			<li>
				<a href="/member/logout">로그아웃</a>
			</li>
		</c:otherwise>	
	</c:choose>
	<li>
		<a href="/member/listForm">블로그를 개설한 회원 목록 보기</a>
	</li>
</ul>


</body>
</html>

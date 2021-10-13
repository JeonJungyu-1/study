<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<!-- 로그인을 했을때만 보여주고 싶다. -->
	<c:if test="${not empty sessionScope.loginId }">
		<h1>
			${sessionScope.loginNm }님 환영합니다.		
		</h1>
	</c:if>
	
	<ul>
		<c:choose>
			<c:when test="${empty sessionScope.loginId }">
				<li>
					<a href="/member/loginForm">로그인</a>
				</li>
			</c:when>
			<c:otherwise>
				<li>
					<a href="/member/logout">로그아웃</a>
				</li>
				<li>
					<a href="/member/listForm">회원 목록</a>
				</li>
			</c:otherwise>
		</c:choose>
	</ul>
</body>
</html>

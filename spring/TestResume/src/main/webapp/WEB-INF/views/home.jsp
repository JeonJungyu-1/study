<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:if test="${not empty sessionScope.loginId }">
		<h1>
			${sessionScope.loginNm }님 환영합니다.
		</h1>
	</c:if>
	
	<ul>
		<c:choose>
			<c:when test="${empty sessionScope.loginId }">
				<li>
					<a href="/user/joinForm">회원 가입</a>
				</li>
				<li>
					<a href="/user/loginForm">로그인</a>
				</li>
			</c:when>
			<c:otherwise>
				<li>
					<a href="/user/logout">로그아웃</a>
				</li>
				<li>
					<a href="/resume/listForm?resume_location=on&resume_position=on&searchText=">이력서 목록</a>
				</li>
			</c:otherwise>
		</c:choose>
	</ul>
</body>
</html>

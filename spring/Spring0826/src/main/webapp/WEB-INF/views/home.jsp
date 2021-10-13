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
			${sessionScope.loginNm }님 안녕하세요.
		</h1>
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
				<li>
					<a href="/member/infoForm?member_id=${sessionScope.loginId }">회원 정보</a>
				</li>
				<li>
					<a href="/board/listForm">게시글 목록</a>
				</li>
			</c:otherwise>
		</c:choose>
		<li>
			<a href="/member/listForm">회원 목록</a>
		</li>
	</ul>
</body>
</html>

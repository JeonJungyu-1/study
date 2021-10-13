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

<a href="/test1">페이지 전환</a>
<a href="/test2">페이지 전환2</a>
<a href="/memberJoin">회원 가입 페이지</a>
<a href="/member/login">로그인 페이지</a>
</body>
</html>

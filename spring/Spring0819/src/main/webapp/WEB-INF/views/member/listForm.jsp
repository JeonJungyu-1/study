<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 목록 ]</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>성별</th>
			<th>가입일</th>
		</tr>
	
		<c:forEach items="${result}" var="d">
			<tr>
				<td>${d.member_no }</td>
				<td>
					<a href="/member/search?member_no=${d.member_no }">${d.member_nm }</a>
				</td>
				<td>
					<c:choose>
						<c:when test="${d.member_gender == 'm' }">남성</c:when>
						<c:when test="${d.member_gender == 'f' }">여성</c:when>
					</c:choose>
				</td>
				<td>${d.member_indate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
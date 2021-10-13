<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${result }" var="vo">
			<tr>
				<td>${vo.BOARD_NUM }</td>
				<td>${vo.BOARD_TITLE }</td>
				<td>${vo.NAME }</td>
				<td>${vo.BOARD_INDATE }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
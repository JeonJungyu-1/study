<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>[ SES Blog 목록 ]</h1>
	<table>
		<c:forEach items="${result }" var="d">
			<tr>
				<td>
					<img alt="profile" src="/resources/images/${d.member_photo }.png" height="70" width="70">
				</td>
				<td>
					<a href="/board/listForm?member_id=${d.member_id }">${d.member_name }(${d.member_id })님의 블로그 보러 가기</a>
				</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>
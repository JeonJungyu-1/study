<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
<script type="text/javascript">
function writeForm() {
	location.href = "/resume/writeForm";
}
function resumeSearch() {
	var searchForm = document.getElementById("searchForm");
	searchForm.submit();
}
</script>
</head>
<body>
	<c:choose>
		<c:when test="${empty resume }">
			<table border="1">
				<tr>
					<td>
						등록된 이력서가 없습니다.
					</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성일</td>
		</tr>
	
		<c:forEach items="${resume }" var="b" varStatus="s">
			<tr>
				<td>${s.index + 1 }</td>
				<td>
					<a href="/resume/detail?resume_no=${b.resume_no }">${b.resume_title }</a>
				</td>
				<td>${b.resume_indate }</td>
			</tr>
		</c:forEach>
	</table>
		</c:otherwise>
	</c:choose>
	
	<form action="/resume/listForm" id="searchForm">
					<input type="radio" name="resume_location" checked="checked">전체
					<input type="radio" name="resume_location" value="1">서울
					<input type="radio" name="resume_location" value="2">부산
					<input type="radio" name="resume_location" value="3">지역무관
					<br>
					<input type="radio" name="resume_position" checked="checked">전체
					<input type="radio" name="resume_position" value="1">프로그래머
					<input type="radio" name="resume_position" value="2">퍼블리셔
					<input type="radio" name="resume_position" value="3">디자이너
					<br>
		<span>제목</span>
		<input type="text" name="searchText" value="${searchText }"><br>
		<input type="button" value="검색" onclick="resumeSearch()">
	</form>
	
	<input type="button" value="이력서 등록하기" onclick="writeForm()">
	
	
</body>
</html>
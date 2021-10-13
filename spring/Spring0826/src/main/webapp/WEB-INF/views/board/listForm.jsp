<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 게시글 목록 ]</title>
<script type="text/javascript">
function writeForm() {
	location.href = "/board/writeForm";
	
}

function boardSearch(currentPage) {
	var searchForm = document.getElementById("searchForm");
	
	document.getElementById("currentPage").value = currentPage;
	
	searchForm.submit();
}

function listForm() {
	location.href = "/board/listForm";
}
function mainForm() {
	location.href = "/";
}
</script>
</head>
<body>
	<h1>[ 글 목록 ]</h1>
		
	<input type="button" value="글 쓰기" onclick="writeForm()">
	
	<table border="1">
		<tr>
			<td>글 번호</td>
			<td>글 제목</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
	
		<c:forEach items="${result }" var="b" varStatus="s">
			<tr>
				<td>${fn:length(result) - s.index }</td>
				<td>
					<a href="/board/detail?board_no=${b.board_no }">${b.board_title }</a>
				</td>
				<td>${b.member_id }</td>
				<td>${b.board_indate }</td>
			</tr>
		</c:forEach>
	</table>
	
	
	<a href = "javascript:boardSearch(${1 })">◁◁◁</a>  
	<a href = "javascript:boardSearch(${navi.currentPage - navi.pagePerGroup })">◁◁</a>  
	<a href = "javascript:boardSearch(${navi.currentPage - 1 })">◁</a>
	
	<c:forEach begin="${navi.startPageGroup }" end="${navi.endPageGroup }" var="n">
		<c:choose>
			<c:when test="${navi.currentPage == n }">
				<a href = "javascript:boardSearch(${n })" style="color: red; font-size: 120%;">${n }</a>
			</c:when>
			
			<c:otherwise>
				<a href = "javascript:boardSearch(${n })">${n }</a>
			</c:otherwise>
		</c:choose>
		
	</c:forEach>	   
	  
	<a href = "javascript:boardSearch(${navi.currentPage + 1 })">▷</a>  
	<a href = "javascript:boardSearch(${navi.currentPage + navi.pagePerGroup })">▷▷</a>
	<a href = "javascript:boardSearch(${navi.totalPageCount })">▷▷▷</a>
	
	
	
	<form action="/board/listForm" id="searchForm">
		<span>제목</span>
		<input type="text" name="searchText" value="${searchText }">
		<input type="hidden" name="currentPage" id="currentPage">
		<input type="button" value="검색" onclick="boardSearch(1)">
	</form>
	
	<input type="button" value="글 목록" onclick="listForm()">
	<input type="button" value="메인화면" onclick="mainForm()">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
<script type="text/javascript">
function memberSearch(currentPage) {
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
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>가입일</th>
		</tr>
		<tr>
			<c:forEach items="${result }" var="d">
				<tr>
					<td>${d.member_id }</td>
					<td>${d.member_nm }</td>
					<td>${d.member_indate }</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	
	<a href = "javascript:memberSearch(${1 })">◁◁◁</a>  
	<a href = "javascript:memberSearch(${navi.currentPage - navi.pagePerGroup })">◁◁</a>  
	<a href = "javascript:memberSearch(${navi.currentPage - 1 })">◁</a>
	
	<c:forEach begin="${navi.startPageGroup }" end="${navi.endPageGroup }" var="n">
		<c:choose>
			<c:when test="${navi.currentPage == n }">
				<a href = "javascript:memberSearch(${n })" style="color: red; font-size: 120%;">${n }</a>
			</c:when>
			
			<c:otherwise>
				<a href = "javascript:memberSearch(${n })">${n }</a>
			</c:otherwise>
		</c:choose>
		
	</c:forEach>	   
	  
	<a href = "javascript:memberSearch(${navi.currentPage + 1 })">▷</a>  
	<a href = "javascript:memberSearch(${navi.currentPage + navi.pagePerGroup })">▷▷</a>
	<a href = "javascript:memberSearch(${navi.totalPageCount })">▷▷▷</a>
	
	
	
	
	<form action="/member/listForm" id="searchForm">
		<span>이름</span>
		<input type="text" name="searchText" value="${searchText }">
		<input type="hidden" name="currentPage" id="currentPage">
		<input type="button" value="검색" onclick="memberSearch(1)">
	</form>
	
	<input type="button" value="글 목록" onclick="listForm()">
	<input type="button" value="메인화면" onclick="mainForm()">
</body>
</html>
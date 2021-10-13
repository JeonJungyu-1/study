<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function like(board_num) {
	location.href = "/board/like?board_num="+board_num;
}

function updateForm(board_num) {
	location.href = "/board/updateForm?board_num="+board_num;
}

function deleteForm(board_num) {
	var check = confirm("정말 삭제하시겠습니까?");
	
	if (check) {
		location.href = "/board/delete?board_num="+board_num;
	}
}

function listForm(member_id) {
	location.href = "/board/listForm?member_id="+member_id;
}

</script>
</head>
<body>
	<h1>[ ${result.member_id }님의 블로그 ]</h1>
	<table>
		<tr>
			<td>제목</td>
			<td>${result.board_title }</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${result.board_inputdate }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${result.board_content }</td>
		</tr>
		<tr>
			<th>
				추천수 ${result.board_likecnt }
				<input type="button" value="추천하기" onclick="like(${result.board_num})">
			</th>
		</tr>
		<c:if test="${result.member_id == sessionScope.loginId }">
			<tr>
				<td>
					<input type="button" value="수정" onclick="updateForm(${result.board_num})">
				</td>
				<td>
					<input type="button" value="삭제" onclick="deleteForm(${result.board_num })">
				</td>
			</tr>
		</c:if>
	</table>
	<input type="button" value="글 목록" onclick="listForm('${result.member_id }')">

</body>
</html>
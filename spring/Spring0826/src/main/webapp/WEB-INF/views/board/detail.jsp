<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 글 상세 정보 ]</title>
<script type="text/javascript">
function boardDelete(board_no) {
	var check = confirm("정말 삭제하시겠습니까?");
	
	if(check) {
		//삭제 기능 요청
		location.href = "/board/delete?board_no="+board_no; 
	}
	
}

function boardUpdateForm(board_no) {
	location.href = "/board/updateForm?board_no="+board_no;
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
			<td>글 번호</td>
			<td>${board.board_no }</td>
		</tr>
		<tr>
			<td>글 제목</td>
			<td>${board.board_title }</td>
		</tr>
		<tr>
			<td>글 내용</td>
			<td>${board.board_context }</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${board.member_id }</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${board.board_hits }</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${board.board_indate }</td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td>
				<a href="/board/download?board_no=${board.board_no }">${board.board_original }</a>
			</td>
		</tr>
		
		<c:if test="${board.member_id == sessionScope.loginId }">
			<tr>
				<td>
					<input type="button" value="수정" onclick="boardUpdateForm(${board.board_no })">
				</td>
				<td>
					<input type="button" value="삭제" onclick="boardDelete(${board.board_no })">
				</td>
			</tr>
		</c:if>
	</table>
		<input type="button" value="글 목록" onclick="listForm()">
		<input type="button" value="메인화면" onclick="mainForm()">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 수정 화면 ]</title>
<script type="text/javascript">
function formCheck() {
	var board_title = document.getElementById("board_title").value;
	var board_context = document.getElementById("board_context").value;
	
	if(board_title == "") {
		alert("제목을 입력해 주세요");
		return false;
	}
	
	if(board_context == "") {
		alert("내용을 입력해 주세요");
		return false;
	}
	
	return true;
}
</script>
</head>
<body>
	<h1> [ 글 수정 ] </h1>
	
	<form action="/board/update" method = "post" enctype="multipart/form-data" onsubmit="return formCheck;">
		<table border="1">
			<tr>
				<td>글 번호</td>
				<td>
					${board.board_no }
					<input type="hidden" name="board_no" value="${board.board_no }">
				</td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td>
					<input type="text" name="board_title" id="board_title" value="${board.board_title }">
				</td>			
			</tr>
			<tr>
				<td>글 내용</td>
				<td>
					<textarea rows="5" cols="50" name="board_context" id="board_context">${board.board_context }</textarea>
				</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${board.board_hits }</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>
					${board.member_id }
				</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td>${board.board_indate }</td>
			</tr>
			<tr>
				<td>첨부파일</td>
				<td>
					<c:choose>
						<c:when test="${empty board.board_original }">
							<input type="file" name="upload">
						</c:when>
						<c:otherwise>
							${board.board_original }
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정하기">
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>
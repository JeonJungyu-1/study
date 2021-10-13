<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 글 쓰기 ]</title>
<script type="text/javascript">
function formCheck() {
	var board_title = document.getElementById("board_title").value;
	var board_context = document.getElementById("board_context").value;
	
	if(board_title == "") {
		alert("제목을 입력해주세요");
		return false;
	}
	
	if(board_context == "") {
		alert("내용을 입력해주세요");
		return false;
	}
	return true;
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
	<h1>[ 글 작성 ]</h1>
	
	<form action="/board/write" method="post" enctype="multipart/form-data" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="board_title" id="board_title">
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<textarea rows="5" cols="50" name="board_context" id="board_context"></textarea>
				</td>
			</tr>
			<tr>
				<td>첨부파일</td>
				<td>
					<input type="file" name="upload">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="글작성">
				</td>
			</tr>
		</table>
	</form>
	
		<input type="button" value="글 목록" onclick="listForm()">
		<input type="button" value="메인화면" onclick="mainForm()">
</body>
</html>
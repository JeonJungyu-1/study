<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function formCheck() {
	var board_title = document.getElementById("board_title").value;
	var board_content = document.getElementById("board_content").value;
	
	if (board_title.trim().length <= 0) {
		alert("제목을 입력하세요.");
		return false;
	}
	
	if (board_content.trim().length <= 0) {
		alert("내용을 입력하세요.");
		return false;
	}
	
	return true;
}
</script>
</head>
<body>
	<form action="/board/update" method="post" onsubmit="return formCheck();">
		<input type="hidden" name="board_num" value=${result.board_num }>
		<table border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="board_title" id="board_title" value=${result.board_title }>
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>
					<textarea rows="20" cols="20" name="board_content" id="board_content">${result.board_content }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
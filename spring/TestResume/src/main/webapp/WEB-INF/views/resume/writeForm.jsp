<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 쓰기</title>
<script type="text/javascript">
function formCheck() {
	var resume_title = document.getElementById("resume_title").value;
	var resume_pr = document.getElementById("resume_pr").value;
	
	if(resume_title="") {
		alert("제목을 입력해 주세요.");
		return false;
	}
	if(resume_pr="") {
		alert("자기소개를 입력해 주세요.");
		return false;
	}
	return true;
}
</script>
</head>
<body>
	<form action="/resume/write" method="post" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="resume_title" id="resume_title">
				</td>
			</tr>
			<tr>
				<td>희망근무지</td>
				<td>
					<input type="radio" name="resume_location" value="1" checked="checked">서울
					<input type="radio" name="resume_location" value="2">부산
					<input type="radio" name="resume_location" value="3">지역무관
				</td>
			</tr>
			<tr>
				<td>희망직군</td>
				<td>
					<input type="radio" name="resume_position" value="1" checked="checked">프로그래머
					<input type="radio" name="resume_position" value="2">퍼블리셔
					<input type="radio" name="resume_position" value="3">디자이너
				</td>
			</tr>
			<tr>
				<td>자기소개</td>
				<td>
					<textarea rows="5" cols="50" name="resume_pr" id="resume_pr"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="글작성">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
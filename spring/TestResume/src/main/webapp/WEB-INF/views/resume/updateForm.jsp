<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
<script type="text/javascript">
function formCheck() {
	var resume_title = document.getElementById("resume_title").value;
	var resume_pr = document.getElementById("resume_pr").value;
	
	if(resume_title == "") {
		alert("제목을 입력해 주세요");
		return false;
	}
	
	if(resume_pr == "") {
		alert("자기소개를 입력해 주세요");
		return false;
	}
	
	return true;
}
</script>
</head>
<body>
<form action="/resume/update" method = "post" onsubmit="return formCheck();">
		<input type="hidden" name="resume_no" value="${resume.resume_no }">
		<table border="1">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="resume_title" id="resume_title" value="${resume.resume_title }">
				</td>			
			</tr>
			<tr>
				<td>희망근무지</td>
				<td>
					<c:choose>
						<c:when test="${resume.resume_location == 1 }">
							<input type="radio" name="resume_location" value="1" checked="checked">서울
							<input type="radio" name="resume_location" value="2">부산
							<input type="radio" name="resume_location" value="3">지역무관
						</c:when>
						<c:when test="${resume.resume_location == 2 }">
							<input type="radio" name="resume_location" value="1">서울
							<input type="radio" name="resume_location" value="2" checked="checked">부산
							<input type="radio" name="resume_location" value="3">지역무관
						</c:when>
						<c:when test="${resume.resume_location == 3 }">
							<input type="radio" name="resume_location" value="1">서울
							<input type="radio" name="resume_location" value="2">부산
							<input type="radio" name="resume_location" value="3" checked="checked">지역무관
						</c:when>
					</c:choose>
				</td>
			</tr>
			<tr>
				<td>희망직군</td>
				<td>
					<c:choose>
						<c:when test="${resume.resume_position == 1 }">
							<input type="radio" name="resume_position" value="1" checked="checked">프로그래머
							<input type="radio" name="resume_position" value="2">퍼블리셔
							<input type="radio" name="resume_position" value="3">디자이너
						</c:when>
						<c:when test="${resume.resume_position == 2 }">
							<input type="radio" name="resume_position" value="1">프로그래머
							<input type="radio" name="resume_position" value="2" checked="checked">퍼블리셔
							<input type="radio" name="resume_position" value="3">디자이너
						</c:when>
						<c:when test="${resume.resume_position == 3 }">
							<input type="radio" name="resume_position" value="1">프로그래머
							<input type="radio" name="resume_position" value="2">퍼블리셔
							<input type="radio" name="resume_position" value="3" checked="checked">디자이너
						</c:when>
					</c:choose>
				</td>
			</tr>
			<tr>
				<td>자기소개</td>
				<td>
					<textarea rows="5" cols="50" name="resume_pr" id="resume_pr">${resume.resume_pr }</textarea>
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
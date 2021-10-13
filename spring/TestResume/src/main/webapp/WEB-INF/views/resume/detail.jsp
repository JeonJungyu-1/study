<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 화면</title>
<script type="text/javascript">
function resumeDelete(resume_no) {
	var check = confirm("정말 삭제하시겠습니까?");
	console.log(resume_no);
	if(check) {
		location.href = "/resume/delete?resume_no="+resume_no; 
	}
	
}

function resumeUpdateForm(resume_no) {
	location.href = "/resume/updateForm?resume_no="+resume_no;
}
</script>
</head>
<body>
<table border="1">
		<tr>
			<td>제목</td>
			<td>${resume.resume_title }</td>
		</tr>
		<tr>
			<td>희망근무지</td>
			<td>
				<c:choose>
					<c:when test="${resume.resume_location == 1}">서울</c:when>
					<c:when test="${resume.resume_location == 2}">부산</c:when>
					<c:when test="${resume.resume_location == 3}">지역무관</c:when>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td>희망직군</td>
			<td>
				<c:choose>
					<c:when test="${resume.resume_position == 1}">프로그래머</c:when>
					<c:when test="${resume.resume_position == 2}">퍼블리셔</c:when>
					<c:when test="${resume.resume_position == 3}">디자이너</c:when>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td>자기소개</td>
			<td>
				<textarea rows="5" cols="50">${resume.resume_pr }</textarea>
			</td>
		</tr>
		
		<c:if test="${resume.user_id == sessionScope.loginId }">
			<tr>
				<td colspan="2">
					<input type="button" value="수정" onclick="resumeUpdateForm(${resume.resume_no })">
					<input type="button" value="삭제" onclick="resumeDelete(${resume.resume_no })">
				</td>
			</tr>
		</c:if>
	</table>
</body>
</html>
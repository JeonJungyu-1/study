<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function formCheck() {
	var member_id = document.getElementById("member_id").value;
	var member_password = document.getElementById("member_password").value;
	var member_name = document.getElementById("member_name").value;

	if(member_id.trim().length <= 0) {
		alert("아이디를 입력하세요.");
		return false;
	}
	else if(member_id.replace(" ", "").length != member_id.length) {
		alert("아이디는 띄어쓰기를 하지 마세요.");
		return false;
	}
	else if(member_id.length < 3 || member_id.length > 10) {
		alert("아이디는 3~10자로 입력하세요.")
		return false;
	}

	if(member_password.trim().length <= 0) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	else if(member_password.replace(" ", "").length != member_password.length) {
		alert("비밀번호는 띄어쓰기를 하지 마세요.");
		return false;
	}
	else if(member_password.length < 3 || member_password.length > 10) {
		alert("비밀번호는 3~10자로 입력하세요.")
		return false;
	}

	if(member_name.trim().length <= 0) {
		alert("이름을 입력하세요.");
		return false;
	}
	else if(member_name.replace(" ", "").length != member_name.length) {
		alert("이름은 띄어쓰기를 하지 마세요.");
		return false;
	}

	return true;
}

</script>
</head>
<body>
	<h1>[ SES Blog 회원 가입 ]</h1>

	<form action="/member/join" method=post onsubmit="return formCheck();">
		<table>
			<tr>
				<td>ID</td>
				<td>
					<input type="text" name="member_id" id="member_id">
				</td>
			<tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="member_password" id="member_password">
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="member_name" id="member_name">
				</td>
			</tr>
			<tr>
				<td>사진 선택</td>
				<td>
					<input type="radio" name="member_photo" value="1" checked="checked">
						<img alt="1번" src="/resources/images/1.png" height="70" width="70">
					<input type="radio" name="member_photo" value="2">
						<img alt="2번" src="/resources/images/2.png" height="70" width="70">
					<input type="radio" name="member_photo" value="3">
						<img alt="3번" src="/resources/images/3.png" height="70" width="70">
					<input type="radio" name="member_photo" value="4">
						<img alt="4번" src="/resources/images/4.png" height="70" width="70">
					
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
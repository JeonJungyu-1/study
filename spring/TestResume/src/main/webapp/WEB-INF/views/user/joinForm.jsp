<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
function formCheck() {
	var user_id = document.getElementById("user_id").value;
	var user_pw = document.getElementById("user_pw").value;
	var pw_check = document.getElementById("pw_check").value; 
	var user_nm = document.getElementById("user_nm").value;
	
	if(user_id == "") {
		alert("아이디를 입력해 주세요.");
		return false;
	}
	else if(user_id.length<3 || user_id.length>8) {
		alert("아이디는 3~8글자 사이로 입력해주세요.")
		return false;
	}

	if(user_pw == "") {
		alert("비밀번호를 입력해 주세요.");
		return false;
	}
	else if(user_pw.length<3 || user_pw.length>8) {
		alert("비밀번호는 3~8글자 사이로 입력해주세요.");
		return false;
	}
	
	if(pw_check == "") {
		alert("확인 비밀번호를 입력해 주세요.");
		return false;
	}
	if(user_pw != pw_check) {
		alert("동일한 비밀번호를 입력해 주세요.");
		return false;
	}
	
	if(user_nm == "") {
		alert("이름을 입력해 주세요.");
		return false;
	} 
	
	return true;
}
</script>
</head>
<body>
	<form action="/user/join" method="post" onsubmit="return formCheck();">
		<table>
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="user_id" id="user_id">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="user_pw" id="user_pw">
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td>
					<input type="password" id="pw_check">
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="user_nm" id="user_nm"> 
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
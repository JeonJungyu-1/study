<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
function formCheck() {
	var member_id = document.getElementById("member_id").value;
	var member_pw = document.getElementById("member_pw").value;
	var member_nm = document.getElementById("member_nm").value;
	var member_pwc = document.getElementById("member_pwc").value;
	
	if((member_id == "") || (member_id.trim().length <= 0)) {
		alert("아이디를 입력해주세요.");
		return false;
	}
	else if(member_id.replace(" ", "").length != member_id.length) {
		alert("아이디에 띄어쓰기를 하지 마세요.");
		return false;
	}
	
	if((member_pw == "") || (member_pw.trim().length <= 0)) {
		alert("비밀번호를 입력해주세요.");
		return false;
	}
	else if(member_pw.replace(" ", "").length != member_pw.length) {
		alert("비밀번호에 띄어쓰기를 하지 마세요.");
		return false;
	}
	
	if((member_nm == "") || (member_nm.trim().length <= 0)) {
		alert("이름을 입력해주세요.");
		return false;
	}
	else if(member_nm.replace(" ", "").length != member_nm.length) {
		alert("이름에 띄어쓰기를 하지 마세요.");
		return false;
	}
	
	if(member_pw != member_pwc) {
		alert("비밀번호를 다시 입력해주세요.")
		return false;
	}
	
	return true;
}
</script>
</head>
<body>
	<form action="/member/join" method=post enctype="multipart/form-data" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="member_id" id="member_id" >
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="member_pw" id="member_pw" >
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td>
					<input type="password" id="member_pwc" >
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="member_nm" id="member_nm" >
				</td>
			</tr>
			<tr>
				<td>프로필파일</td>
				<td>
					<input type="file" name="upload">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입하기">
				</td>
			</tr>
		</table>
	
	
	</form> 
</body>
</html>
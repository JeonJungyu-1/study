<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 로그인 ]</title>
<script type="text/javascript">
function formCheck() {
	var member_id = document.getElementById("member_id").value;
	var member_pw = document.getElementById("member_pw").value;
	
	if(member_id == "") {
		alert("아이디를 입력해주세요");
		return false;
	}
	
	if(member_pw == "") {
		alert("비밀번호를 입력해주세요");
		return false;
	}
	return true;
}
</script>
</head>
<body>
	<form action="/member/login" method="post" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="member_id" id="member_id">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="member_pw" id="member_pw">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
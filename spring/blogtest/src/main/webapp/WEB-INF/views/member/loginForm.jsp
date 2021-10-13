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

	if(member_id.trim().length <= 0) {
		alert("아이디를 입력하세요.");
		return false;
	}

	if(member_password.trim().length <= 0) {
		alert("비밀번호를 입력하세요.");
		return false;
	}

	return true;
}

</script>
</head>
<body>
	<h1>[ 로그인 ]</h1>
	
	<form action="/member/login" method="post" onsubmit="return formCheck();">
		<table>
			<tr>
				<td>ID</td>
				<td>
					<input type="text" name="member_id" id="member_id">
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="password" name="member_password" id="memeber_password">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Login">
				</td>
			</tr>	
		</table>
	</form>
</body>
</html>
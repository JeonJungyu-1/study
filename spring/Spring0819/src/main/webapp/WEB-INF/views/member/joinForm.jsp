<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 가입 폼 ]</title>
<script type="text/javascript">
	function formCheck() {
		var member_nm = document.getElementById("member_nm").value;
		
		if(member_nm == ""){
			alert("성명을 입력해 주세요");
			return false;
		}
		
		return true;
	}
</script>
</head>
<body>
	<form action="/member/join" method="post" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<td>성명</td>
				<td>
					<input type="text" name="member_nm" id="member_nm">
				</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input type="radio" name="member_gender" value="m" checked="checked"> 남성
					<input type="radio" name="member_gender" value="f"> 여성
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
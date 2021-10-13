<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 수정 ]</title>
<script type="text/javascript">
function formCheck(){
	var member_nm = document.getElementById("member_nm").value;
	
	if(member_nm == ""){
		alert("수정할 이름을 입력해 주세요.")
		return false;
	}
	
	return true;
}
</script>
</head>
<body>

	<form action="/member/update" method="post" onsubmit="return formCheck();">
		<table border="1">
			<tr>
				<th>회원 번호</th>
				<td>
					${result.member_no }
					<input type="hidden" name="member_no" value="${result.member_no }">
				</td>
			</tr>
			<tr>
				<th>회원 이름</th>
				<td>
					<input type="text" name="member_nm" id="member_nm" value="${result.member_nm }">
				</td>
			</tr>
			<tr>
				<th>회원 성별</th>
				<td>${result.member_gender }</td>
			</tr>
			<tr>
				<th>회원 가입일</th>
				<td>${result.member_indate }</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
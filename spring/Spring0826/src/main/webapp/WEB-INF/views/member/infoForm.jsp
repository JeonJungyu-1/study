<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<script type="text/javascript">
function deleteMember(member_id) {
	var check = confirm("정말로 삭제하시겠습니까?");
	var member_pw = document.getElementById("member_pw").value;
	
	if(check){
		location.href = "/member/delete?member_id="+member_id+"&&member_pw="+member_pw;
	}
}

</script>
</head>
<body>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>${result.member_id }</td>
		<tr>
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="password" id="member_pw">
			</td>
		<tr>
		<tr>
			<td>이름</td>
			<td>${result.member_nm }</td>
		</tr>
		<tr>
			<td>가입일</td>
			<td>${result.member_indate }</td>
		</tr>
		<tr>
			<td>
			</td>
			<td>
				<input type="button" value="삭제" onclick="deleteMember('${result.member_id }')">
			</td>
		</tr>
	</table>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 정보 ]</title>
<script type="text/javascript">
function deleteMember(member_no) {
	var check = confirm("정말로 삭제하시겠습니까?");
	
	if(check){
		//삭제 기능 - 회원번호(PK)가 필요하다.
		// <a href="/member/delete?member_no=member_no"> 와 동일한 효과가 있는 코드
		location.href = "/member/delete?member_no="+member_no;
	}
}

function updateMember(member_no) {
	var check = confirm("수정폼으로 이동하시겠습니까?");
	if(check) {
		//수정폼으로 이동
		location.href = "/member/updateForm?member_no="+member_no;
	}
}
</script>
</head>
<body>
	<table border="1">
		<tr>
			<th>회원 번호</th>
			<td>${result.member_no }</td>
		</tr>
		<tr>
			<th>회원 이름</th>
			<td>${result.member_nm }</td>
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
			<td>
				<input type="button" value="수정" onclick="updateMember(${result.member_no })">
			</td>
			<td>
				<input type="button" value="삭제" onclick="deleteMember(${result.member_no })">
			</td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 가입 폼 ]</title>
<script type="text/javascript">
	function formCheck(){
		var name = document.getElementById("name").value;
		var age = document.getElementById("age").value;
		
		if(name == ""){
			alert("이름을 입력해 주세요");
			return false;
		}
		
		if(age == "0"){
			alert("나이를 입력해 주세요");
			return false;
		}
		
		return true;
	}
</script>
</head>
<body>
	<form action="/join" method="post" onsubmit="return formCheck();">
		<label>이름</label>
		<input type="text" name="name" id="name">
		<label>나이</label>
		<input type="number" name="age" id="age">
		<input type="submit" value="가입">
	</form>
</body>
</html>
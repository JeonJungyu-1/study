<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 속성 상태 탐색 선택자1 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("#wrap p:hidden").css({
			"display":"block",
			"background":"#ff0"
		});
		
		var z1 = $("#zone1 :selected").val();
		console.log(z1);
		
		var z2 = $("#zone2 :checked").val();
		console.log(z2);

		var z3 = $("#zone3 :checked").val();
		console.log(z3);
		
		
	});
</script>
</head>
<body>
	<div id="wrap">
		<p>내용1</p>
		<p style="display:none;">내용2</p>
		<p>내용3</p>
	</div>
	<form action="#">
		<p id="zone1">
			<select name="course" id="course">
				<option value="opt1">옵션1</option>
				<option value="opt2" selected="selected">옵션2</option>
				<option value="opt3">옵션3</option>
			</select>
		</p>
		<p id="zone2">
			<input type="checkbox" name="hobby1" value="독서">독서
			<input type="checkbox" name="hobby1" value="자전거">자전거
			<input type="checkbox" name="hobby1" value="등산" checked="checked">등산
		</p>
		<p id="zone3">
			<input type="radio" name="gender" value="male">남성
			<input type="radio" name="gender" value="female" checked="checked">여성
		</p>
	</form>
</body>
</html>
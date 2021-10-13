<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 속성 탐색 선택자1 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("#wrap a[target]").css({"color":"#f00"});
		
		$("#wrap a[href^=https]").css({"color":"#0f0"});
		
		$("#wrap a[href$=net]").css({"color":"#00f"});
		
		$("#wrap a[href*=google]").css({"color":"#000"});
		
		$("#member_f :text").css({"background-color":"#ff0"});
		
		$("#member_f :password").css({"background-color":"#0ff"});
	});
</script>
</head>
<body>
	<div id="wrap">
		<p>
			<a href="https://easypub.co.kr" target="_blank">EasyPub</a>
		</p>
		<p>
			<a href="https://naver.com">Naver</a>
		</p>
		<p>
			<a href="https://google.co.kr">Google</a>
		</p>
		<p>
			<a href="https://daum.net">Daum</a>
		</p>
	</div>
	<form action="#" method="get" id="member_f">
		<p>
			<label for="user_id">아이디</label><input type="text" name="user_id" id="user_id">
		</p>
		<p>
			<label for="user_pw">비밀번호</label><input type="password" name="user_pw" id="user_pw">
		</p>
	</form>
</body>
</html>
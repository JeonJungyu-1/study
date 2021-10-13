<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 선택자1 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	/* $(function(){
		$("#food_2").css("background","blue");
	}); //ready function 줄인 것.

	$(document).ready(function(){
		$("#food_1").css("background","red");
	}); */
	
	$(function(){
		//$("*").css("border","1px solid blue");
		//$("#food_1").css("background-color","#ff0").css("border","2px solid #f00");
		//$(".menu").css("background-color","#f0f");
		//$(".kor").css("border","2px dashed #f00");
		//$(".eng").css("border","1px solid #f00");
		//$("h1").css("background-color","#0ff");
		//$("ul.kor").css("background-color","#0ff");
		
	});
</script>
</head>
<body>
	<h1>[ 선택자 ]</h1>
	<h1>선호하는 음식</h1>
	<section id="food_1">
		<h2>한식</h2>
		<ul class="menu kor">
			<li>김치</li>
			<li>불고기</li>
		</ul>
	</section>
	<section id="food_2">
		<h2 class="kor">양식</h2>
		<ul class="menu eng">
			<li>피자</li>
			<li>파스타</li>
		</ul>
	</section>
</body>
</html>
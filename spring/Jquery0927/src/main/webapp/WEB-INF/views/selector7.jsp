<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ find, filter 선택자 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("#inner_1").find(".txt1").css({
			"background-color":"#ff0"
		});
		
		$("#inner_1 p").filter(".txt2").css({
			"background-color":"#0ff"
		});
		
		//idx = 0 1 2 3
		$("#inner_2 p").filter(function(idx,obj){
			console.log(idx);
			return idx % 2 == 0;
		}).css({
			"background-color":"#0f0"
		});
	});
</script>
</head>
<body>
	<div id="outer_wrap">
		<h1>콘텐츠 탐색 선택자</h1>
		<section id="inner_1">
			<h2>find(), filter()</h2>
			<p class="txt1">내용1</p>
			<p class="txt2">내용2</p>
		</section>
		<section id="inner_2">
			<h2>filter(function)</h2>
			<p>index0</p>
			<p>index1</p>
			<p>index2</p>
			<p>index3</p>
		</section>
	</div>
</body>
</html>
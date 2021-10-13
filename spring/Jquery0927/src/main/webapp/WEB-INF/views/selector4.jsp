<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 위치 탐색 선택자1 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		/* $("#menu li:first").css({
			"background-color":"#ff0"
		});
		
		$("#menu li:last").css({
			"background-color":"#0ff"
		}); */
		
		/* $("#menu li:even").css({
			"background-color":"#ff0"
		});

		$("#menu li:odd").css({
			"background-color":"#0ff"
		}); */
		
		/* $("#menu li").eq(2).css({
			"background-color":"#ff0"
		});
		
		$("#menu li:eq(4)").css({
			"background-color":"#0ff"
		}); */
		
		$("#menu li:nth-child(2n-1)").css({
			"background-color":"#0f0"
		});
		
		
	});
</script>
</head>
<body>
	<h1>탐색 선택자</h1>
	<ul id="menu">
		<li>내용1</li>
		<li>내용2</li>
		<li>내용3</li>
		<li>내용4</li>
		<li>내용5</li>
	</ul>
</body>
</html>
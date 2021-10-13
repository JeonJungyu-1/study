<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 선택자2 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	//자바스크립트 자료형
	// 문자열, 숫자, 불린(논리형), 객체(배열 : [], null) : {}, undefinded, 함수(function)
	$(function(){
		//$("#list_1").parent().css("border","2px dashed #f00");
		/* $("#wrap h1").css({
			"background-color":"yellow",
			"border":"2px dashed #f00"
		}); */
		
		/* $("#wrap > h1").css("border", "2px dashed #f00");
		
		$("#wrap > section").children().css({
			"background-color":"yellow",
			"border":"2px solid #f00"
		}); */
		
		var style_1 = {
			"background-color":"#0ff",
			"border":"2px solid #f00"
		};
		
		var style_2 = {
			"background-color":"#ff0",
			"border":"2px dashed #f00"
		};
		
		/* $(".txt").prev().css(style_1);
		
		$(".txt + p").css(style_2);
		
		$(".txt").next().next().css(style_2); */
		
		/* $(".txt").prevAll().css(style_1);
		
		$(".txt").nextAll().css(style_2); */
		
		$(".txt").siblings().css(style_1);
	});
</script>
</head>
<body>
	<!-- <h1>인접 관계 선택자</h1>
	<ul id="wrap">
		<li>리스트1
			<ul>
				<li id="list_1">리스트1-1</li>
				<li>리스트1-2</li>
			</ul>
		</li>
		<li>리스트2</li>
		<li>리스트3</li>
	</ul> -->
	
	<!-- <div id="wrap">
		<h1>인접 관계 선택자</h1>
		<p>내용1</p>
		<section>
			<h1>하위 요소 선택자</h1>
			<p>내용2</p>
		</section>
	</div> -->
	
	<div id="wrap">
		<h1>인접 관계 선택자</h1>
		<p>내용1</p>
		<p class="txt">내용2</p>
		<p>내용3</p>
		<p>내용4</p>
	</div>
</body>
</html>
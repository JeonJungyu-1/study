<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 선택자3 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		/* $(".txt1").parents().css({
			"border":"2px dashed #00f"			
		});
		
		$(".txt2").parents("div").css({
			"border":"2px solid #f00"			
		}); */
		
		$(".txt1").closest("div").css({
			"border":"2px solid #f00"
		});
	});
</script>
</head>
<body>
	<!-- <h1 class="title">선택자</h1>
	<section>
		<div>
			<p class="txt1">내용</p>
		</div>
	</section>
	<section>
		<div>
			<p class="txt2">내용</p>
		</div>
	</section> -->
	
	<h1 class="title">선택자</h1>
	<div>
		<div>
			<p class="txt1">내용</p>
		</div>
	</div>
</body>
</html>
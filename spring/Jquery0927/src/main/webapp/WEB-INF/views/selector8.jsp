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
		/* var result_1 = $("#inner_1 p").eq(0).is(":visible");
		console.log(result_1);	//true
		
		var result_2 = $("#inner_1 p").eq(1).is(":visible");
		console.log(result_2);	//false */
		
		$.each($("#inner_1 p") , function(i,o){
			var result = $(this).eq(i).is(":visible");
			console.log(result);
			console.log($(this));
			console.log(i);
			console.log($(this).eq(0));
		});
		
		/* var result_3 = $("#chk1").is(":checked");
		console.log(result_3);		//true;

		var result_4 = $("#chk2").is(":checked");
		console.log(result_4);		//false; */
		
		$.each($("#inner_2 :checkbox"), function(i,o){
			var result = $(this).eq(i).is(":checked");
			console.log(result);
			console.log($(this));
			console.log($(this).eq(i));
		});
		
		$.each($(".chk") , function(i,o){
			var result_5 = $(this).is(":checked");
			console.log(result_5);
			console.log($(this));
			console.log($(this).eq(i));
		});
	});
</script>
</head>
<body>
	<div id="outer_wrap">
		<h1>is()</h1>
		<section id="inner_1">
			<h2>문단 태그 영역</h2>
			<p>내용1</p>
			<p style="display:none;">내용2</p>
		</section>
		
		<section id="inner_2">
			<h2>폼 태그 영역</h2>
			<p>
				<input type="checkbox" name="chk1" class="chk" id="chk1" checked="checked">
				<label for="chk1">체크1</label>
				<input type="checkbox" name="chk2" class="chk" id="chk2">
				<label for="chk2">체크2</label>
			</p>
		</section>
	</div>
</body>
</html>
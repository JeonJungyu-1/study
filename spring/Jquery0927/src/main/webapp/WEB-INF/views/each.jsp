<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ each문 ]</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		var obj = [{
			"area":"서울"
		},{
			"area":"부산"
		},{
			"area":"전주"
		}];
		
		//i=인덱스 번호 , o=반복되는 대상
		$(obj).each(function(i,o){
			//여기에 작성되는 코드가 반복 실행되는 코드
			//console.log(i + ":" , o.area);
			console.log(i + ":" , this.area);
		});
		
		console.log("=======The End1========");
		
		//i=인덱스 번호 , o=반복되는 대상
		$.each($("#menu2 li") , function(i,o){
			//여기에 작성되는 코드가 반복 실행되는 코드
			console.log(i + ":" , o);
			//$(o).css("border","1px solid #f00");
		});

		console.log("=======The End2========");
		
		$.each($("#menu2 li") , function(i){
			console.log(i + ":" , $(this));
			$(this).css("border","1px solid #f00");
		});
		
	});
</script>
</head>
<body>
	<h1>탐색 선택자</h1>
	<ul id="menu1">
		<li>내용1-1</li>
		<li>내용1-2</li>
		<li>내용1-3</li>
	</ul>
	<ul id="menu2">
		<li>내용2-1</li>
		<li>내용2-2</li>
		<li>내용2-3</li>
	</ul>
</body>
</html>
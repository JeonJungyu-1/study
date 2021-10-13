<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript">
	function formCheck() {
		/* onsubmit을 통해서 실행된 함수는
		반드시 true or false를 return 해야 한다. */
		
		var member_id = document.getElementById("member_id").value;
		var member_pw = document.getElementById("member_pw").value;
		
		if(member_id == "") {
			alert("아이디를 입력하세요.");
			return false;
		}
		
		if(member_pw == "") {
			alert("비밀번호를 입력하세요.");
			return false;
		}
		
		return true;
	}
	
	</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!-- 
	쿼리스트링 방식 
	데이터를 1개 전달 : 요청주소?전송할 데이터의 변수명=전송할 데이터의 값
	데이터를 1개이상 전달 : 요청주소?전송할 데이터의 변수명=전송할 데이터의 값&전송할 데이터의 변수명=전송할 데이터의 값

	a 태그를 사용해서 요청을 보내면 GET 방식(보내는 정보가 그대로 드러남)으로만 받을 수 있음.
	POST 방식은 숨겨서 보냄
-->

<a href="/test1?str=문자열데이터&num=10&flag=true">요청 보내기</a>

<a href="/test2?str=문자열데이터&num=10&flag=true">요청 보내기2</a>

<br>

<form action="/join" method="post" onsubmit="return formCheck();">
	<label>아이디</label>
	<input type="text" name="member_id" id="member_id">
	<label>비밀번호</label>
	<input type="password" name="member_pw" id="member_pw">
	<input type="submit" value="전송">
</form>

</body>
</html>

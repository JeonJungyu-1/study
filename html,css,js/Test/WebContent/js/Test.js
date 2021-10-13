function formCheck() {
	var userId = document.getElementById("userId").value;

	//id
	if(userId.trim().length <= 0) {
		alert("ID를 입력해주세요.");
		return false;
	}
	else if(userId.replace(" ","").length != userId.length) {
		alert("ID에 띄어쓰기를 하지 마세요.");
		return false;
	}
	else if(userId.trim().length < 3 || userId.trim().length > 10) {
		alert("ID는 3 ~ 10글자 사이로 입력하세요.");
		return false;
	}
	
	//password
	var userPw = document.getElementById("userPw").value;
	if(userPw.trim().length <= 0) {
		alert("비밀번호를 입력해주세요.");
		return false;
	}
	else if(userPw.replace(" ","").length != userPw.length) {
		alert("비밀번호에 띄어쓰기를 하지 마세요.");
		return false;
	}
	else if(userPw.trim().length < 4 || userPw.trim().length > 12) {
		alert("비밀번호는 4 ~ 12글자 사이로 입력하세요.");
		return false;
	}
	
	//password check
	var userPwC = document.getElementById("userPwC").value;
	if(userPw != userPwC) {
		alert("비밀번호 확인에 입력한 값이 비밀번호에 입력한 값과 일치하지 않습니다. 다시 입력해주세요.");
		return false;
	}
	
	//useragree
	var userAgree1 = document.getElementById("userAgree1").checked;
	var userAgree2 = document.getElementById("userAgree2").checked;
	if(userAgree1 == false || userAgree2 == false) {
		alert("이용 동의 칸의 필수 항목을 체크해주세요.");
		return false;
	}

	
	return true;
	
}
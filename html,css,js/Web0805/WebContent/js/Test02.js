function formCheck() {
	var userId = document.getElementById("userId").value;
	console.log(userId);
//	if(userId.replace(" ", "").length != userId.length) {
//		alert("공백을 입력하지마세요.")
//		return false;
//	}
	if (userId.trim().length <= 0) {
		alert("ID를 입력해주세요.");
		return false;
	}

	var userPw = document.getElementById("userPw").value;
//	console.log(userPw);
	if (userPw.trim().length <= 0) {
		alert("PASSWORD를 입력해주세요.");
		return false;
	}
	
	var userType = document.getElementById("userType").value;
	console.log(userType);
	if (userType == "none") {
		alert("사용자 유형을 선택해주세요.")
		
		return false;
	}
	
	return true;
}

function changeFunc() {
//	var userType = document.getElementById("userType").selectedIndex;
	var userType = document.getElementById("userType").value;
	console.log(userType);
}
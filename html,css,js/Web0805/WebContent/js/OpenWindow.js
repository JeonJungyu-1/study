function checkBtn() {
	var idCheck = document.getElementById("idCheck").value;
	if (idCheck == "admin") {
		alert("사용할 수 없는 ID입니다.");
	}
}

function useBtn() {
	var idCheck = document.getElementById("idCheck").value;
	
	window.opener.document.getElementById("userId").value = idCheck;
	
	window.close();
}
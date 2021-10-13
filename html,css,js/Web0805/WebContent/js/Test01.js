window.onload = function() {
	document.getElementById("clickBtn1").onclick = function() {
		alert("!");
	}
	
	document.getElementById("mouseEventBtn").onmouseenter = function() {
		this.style = "color: white; background-color: black;";
	}
	document.getElementById("mouseEventBtn").onmouseleave = function() {
		this.style = "color: black; background-color: white;";
	}
	
	document.getElementById("inputTxt2").onkeyup = function(e) {
		console.log(e);
		console.log("입력한 키: " + e.key);
		console.log("입력한 키코드: " + e.keyCode);
		
	}
	
	
}

function clickFunc() {
	alert("!!");
}

function keyupFunc() {
	var inputTxt = document.getElementById("inputTxt1").value;
//	console.log(inputTxt);
	document.getElementById("msg").innerHTML = "당신이 입력한 값은...<br>" + inputTxt;
}
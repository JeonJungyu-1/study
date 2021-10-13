window.onload = function() {
	console.log(document);

	console.log(document.head);
	console.log(document.body);
	
	var span = document.createElement("span");
	span.setAttribute("style", "color:red;");
	var txt = document.createTextNode("hello");
	span.appendChild(txt);
	document.body.appendChild(span);
	
	document.body.innerHTML += "<span style='color:blue;'>hi</span>";
//	document.body.innerText += "<span>hi</span>";
	
	
	console.log(document.getElementById("example"));
	var div = document.getElementById("example");
	div.style = "color:green";
//	document.getElementById("example").setAttribute("style", "color:green");
	document.getElementById("example").style = "color:green";
	
	document.getElementById("naverLink").href = "https://www.naver.com";
	
	setTimeout(function() {
		var img = document.getElementById("cat");
		img.src = "../images/dog.png";
		img.width = "300";
		img.height = "200";
	}, 3000);
	
	var odd = document.getElementsByClassName("odd");
	var even = document.getElementsByClassName("even");
	
	console.log(odd);
	console.log(even);
	
	for (var i = 0; i < odd.length; i++) {
		odd[i].style = "background-color: gray;";
	}
	for (var i = 0; i < even.length; i++) {
		even[i].style = "background-color: aqua;";
	}
	
	var tr = document.getElementsByTagName("tr");
	
	for (var i = 0; i < tr.length; i++) {
		switch(i % 2) {
			case 0: //0, 2, 4 => 홀수 행
				tr[i].style = "background-color:black; color:white;";
				tr[i].innerText = "hello";
				break;
			case 1: //1, 3 => 짝수 행
				tr[i].style = "background-color:white; color: black;";
				tr[i].innerText = "hi";
				break;
		}
	}
}

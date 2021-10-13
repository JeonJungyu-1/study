function openWindow() {
	var openWindow = window.open("OpenWindow.html", "_blank", "width=500, height=300");
	
	openWindow.onload = function() {
		var userId = document.getElementById("userId").value;
		openWindow.document.getElementById("idCheck").value = userId;	
	}
	
}
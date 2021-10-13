console.log(window);

window.alert("hello");
//console.log(window.innerWidth);
//console.log(window.outerHeight);


var openWindow = window.open("OpenWindow.html", "_blank", "width=400, height=300");

var width = screen.width / 2 -  openWindow.outerWidth / 2;
var height = screen.height / 2 - openWindow.outerHeight / 2;
openWindow.moveTo(width, height);


setTimeout(function() {
	openWindow.moveTo(400, 300);
	openWindow.resizeTo(200, 150);
	
	setInterval(function() {
		openWindow.moveBy(10, 10);
		openWindow.resizeBy(10, 10);
	}, 1000);
}, 3000);

setTimeout(function() {
	openWindow.close()
}, 6500);

console.log(screen);

console.log(location);
//location.href = "https://www.google.com";
//location.assign("https://www.google.com");
//location.replace("https://www.google.com");

console.log(navigator);
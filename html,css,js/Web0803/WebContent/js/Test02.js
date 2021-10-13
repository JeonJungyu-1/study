//built-in function
function timeoutFunc() {
	alert("TimeOut!");
}
//setTimeout(timeoutFunc, 1000);
//setTimeout(function() {
//	alert("TimeOver!")
//}, 3000);

/*var time = 10;
console.log("Countdown!");
var intervalObj = setInterval(function() {
	console.log(time--);
	
	if (time < 0)
		clearInterval(intervalObj);
}, 1000);*/

//parseInt("3.14");
//parseFloat(3);

var num1 = 10/0;
console.log(isFinite(num1));	//유한대인지 검사하는 함수(false)
console.log(isFinite(3.14));	//true

var num2 = 10 / "hello";
console.log(isNaN(num1));		//Nan인지 검사하는 함수(false)
console.log(isNaN(num2));		//true


//함수(function)
//함수 작성 방법(매개변수, 반환값을 작성하지 않은 경우)
function hello() {
	alert("Hello!");
	alert("World!");
}

//함수 호출 방법
//hello();

//일급 함수, 일급 객체, 일급 시민 문법(함수를 변수에 저장)
/*var helloFunc = hello;
console.log(helloFunc);
console.log(typeof helloFunc);
helloFunc();*/

//함수 작성 방법(매개변수, 반환값을 작성한 경우)
function calc(a, b) {
	var result = a + b;
	
	return result;
}

//함수 호출 방법
//var num1 = calc(2, 3);
//console.log(num1);
//
//var num2 = calc(10, 20);
//console.log(num2);

//일급 함수 문법
//var calcFunc = calc;
//console.log(calcFunc(11, 22));
//console.log(typeof calcFunc);

//같은 이름의 함수를 다시 작성한 경우(기존 함수를 덮어씌움)
function calc(a, b, c) {
	console.log("a: " + a);
	console.log("b: " + b);
	console.log("c: " + c);
	var result = a - b - c;
	
	return result;
}

//console.log(calc(11,22));
//console.log(calc(4, 3, 2));

//익명함수
var hiFunc = function() {
	alert("Hi");
	alert("SCIT!");
}
hiFunc();
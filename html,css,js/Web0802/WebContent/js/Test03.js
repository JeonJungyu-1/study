// 문자열=>숫자 자료형 변환
var str1 = "10";
var str2 = "3.14";

console.log(str1 + str2); //103.14

/*var strResult1 = Number(str1);
var strResult2 = Number(str2);*/
var strResult1 = parseInt(str1);
var strResult2 = parseFloat(str2);

console.log(strResult1 + strResult2); // 13.14

//논리 => 숫자 자료형 변환
var bool1 = true;
var bool2 = false;

var boolResult1 = Number(bool1);	//1
var boolResult2 = Number(bool2);	//0

console.log(boolResult1);
console.log(boolResult2);

// 숫자 => 문자열 자료형 변환;
var num1 = 10;
var num2 = 20;

console.log(num1 + num2); //30

var numResult1 = String(num1);
var numResult2 = String(num2);

console.log(numResult1 + numResult2); //1020

// 논리 => 문자열 자료형 변환
var boolResult3 = String(bool1);
var boolResult4 = String(bool2);

console.log(boolResult3); //"true"
console.log(boolResult4); //"false"

// 숫자 => 논리 자료형 변환
var numResult3 = Boolean(num1);
var numResult4 = Boolean(0);

console.log(numResult3); //true
console.log(numResult4); //false

// 문자열 => 논리 자료형 변환
var strResult3 = Boolean(str1);
var strResult4 = Boolean("");

console.log(strResult3); //true
console.log(strResult4); //false



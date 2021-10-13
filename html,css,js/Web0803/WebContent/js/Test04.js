//built-in object

//Number
var num = new Number();
console.log(num);
console.log("최소값: " + Number.MIN_VALUE);
console.log("최대값: " + Number.MAX_VALUE);
console.log("NaN: " + Number.NaN);
console.log("양의 무한대: " + Number.POSITIVE_INFINITY);
console.log("음의 무한대: " + Number.NEGATIVE_INFINITY);

//Math
console.log(Math.random()); //0.0 이상, 1.0 미만의 임의의 실수형 난수 생성

//Date
var today = new Date();
console.log(today);
console.log("년도: " + today.getFullYear());
console.log("월: " + today.getMonth()); //0~11
console.log("일: " + today.getDate());
console.log("요일: " + today.getDay()); //0~6
console.log("시: " + today.getHours());
console.log("분: " + today.getMinutes());
console.log("초: " + today.getSeconds());

var day1 = new Date(2022, 1, 30);
console.log(day1);
day1.setHours(13);
day1.setMinutes(29);
day1.setSeconds(34);
console.log(day1);

//String
var str = "Hello, World! Hi, SCIT!";
console.log("charAt(): " + str.charAt(12));
console.log("indexOf(): " + str.indexOf("World"));
str = str.replace("Hello", "GoodBye");
console.log("replace(): " + str);
console.log("substring(): " + str.substring(4, 7));	//4번부터 7번 전까지 잘라냄
console.log("substr(): " + str.substr(4, 3));		//4번부터 3개 잘라냄
var strArr = str.split(",");
console.log("split(): ")
console.log(strArr);
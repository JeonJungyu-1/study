//제어문
//조건문
/*var age = Number(prompt("나이를 입력하세요:"));
if (age > 18) {
	alert(age + "세는 성인입니다.");
}
else if (age > 13) {
	alert(age + "세는 청소년입니다.");
}
else {
	alert(age + "세는 미성년자입니다.");
}*/

/*var year = Number(prompt("년도를 입력하세요:"));

switch (year % 4) {
	case 0:
		alert(year + "년은 윤년입니다.");
		break;
	default:
		alert(year + "년은 평년입니다.")
}*/


//반복문
/*while (true) {
	var inputData = prompt("입력하세요(0을 입력하면 종료)");
	
	if (inputData == 0)
		break;
	alert("입력한 데이터: " + inputDate);
}*/
/*for (var i = 2; i < 10; i++) {
	for (var j = 1; j < 10; j++) {
		console.log(i + " * " + j + " = " + (i * j));
	}
	console.log("");
}*/

//기타 제어문: break, continue
/*for (var i = 0; i < 10; i++) {
	if (i % 3 == 0)
		continue;
	
	if (i > 5)
		break;
	
	console.log(i);
}*/

//배열(Array)
/* java에서의 배열
int[] arr = {10, 20, 30};
String[] arr2 = new String[4];
arr2[0] = "Hello";
arr2[1] = "World";*/
var arr = [10, 20, 30, "Hello", "Hi", true, false, undefined];
console.log(arr);
console.log(typeof arr);

for (var i = 0; i < arr.length; i++) {
	console.log(arr[i]);
}
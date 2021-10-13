// 산술연산자: + - * / %
console.log(10 / 20);
console.log(10 % 3);
console.log("---------");

// 복합 대입 연산자: += -= *= /= %=
var a = 10;
console.log("a: " + a);
a += 20;
console.log("a: " + a);
a /= 4;
console.log("a: " + a);
console.log("---------");

// 증감 연산자: ++ --
a++;
console.log("a: " + a);
a--;
console.log("a: " + a);
console.log("---------");

// 비교 연산자: > < >= <= == !=
console.log(10 > 20);		//false
console.log(100 <= 100);	//true
console.log(20 != 10);		//true
console.log("---------");

// 관계 연산자: && || !
console.log(true && true);		// true
console.log(true && false);		// false
console.log(false || true);		// true
console.log(false || false);	//false
console.log(!true);				//false
console.log(!false);			//true
console.log("---------");

// 동등 연산자 : ==
console.log(10 == "10"); 	//true
console.log(false == "");	//true
console.log(false == 0);	//true
console.log("---------");
// 동일 연산자 : === / 자료형까지 비교
console.log(10 === "10");	//false 
console.log(false === "");	//false
console.log(0 === false);	//false

console.log(10 === 10);		//true
console.log("10" !== "20");	//true


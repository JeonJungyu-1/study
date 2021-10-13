//객체(Object)
var person = {
	name: "홍길동",
	age: 25,
	gender: "남자"
}

person.age += 1;
person.marriage = false;
person.introduce = function() {
	console.log("안녕하세요!");
}

console.log(person);
console.log(typeof person);

/*var arr = [10, 20, 30, "hello", true];
console.log(arr);
console.log(typeof arr);*/

console.log("이름: " + person.name);
console.log("나이: " + person.age);
console.log("성별: " + person.gender);

person.introduce();

delete person.marriage;
console.log(person);
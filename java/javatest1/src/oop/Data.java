package oop; //패키지 선언문은 제일 위에 있어야함.

//abc.co.kr라는 회사에서 game이라는 프로젝트 시작
//도메인 뒤집기 kr.co.abc.game.controller.Data로 분류해서 사용(class 이름 겹치지 않도록 하기위해서임)
//class : 좁은 의미로 말하면 새로운 자료형을 만들어 내는것


//클래스의 정의
public class Data {
	//속성 = 멤버변수, 인스턴스 변수
	//접근지정자 : public(어디서나 접근가능) > protected(같은 패키지소속이거나 다른패키지중에 상속받으면 접근가능) > (default)(같은 패키지 소속이면 접근 가능) > private(외부에서 접근 불가능)
	private String name;  //private 붙이면 외부에서 못건드림
	private String phone;
	private int age;
	private String email;
	
	//기능 = 메소드
	//접근지정자 return타입 메소드이름(전달인자 또는 인수)
	public void setAge(int age) {
		if (age < 0) return;
		this.age = age;
	} //이런 경우에는 헷갈리니까 무조건 this.age 해줘야 함
	
	public int getAge() {
		return age;
//		return this.age; //이렇게 써도 됨. this가 가리키는 객체의 주소를 갖고 있음.
	}
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("이름:" + name + " 전화번호:" + phone + " 나이:" + age + " email:" + email);
	} //this.name 이렇게 써도됨.
}

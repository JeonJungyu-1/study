package oop;

public class DataTest {

	public static void main(String[] args) {
		//모든 클래스의 변수는 레퍼런스 변수
		Data a = new Data(); //name,phone,age,email의 값을 저장할 공간과 getname(),print()의 기능을 가진 객체 생성
		Data b = new Data();
		
		//private으로 변수 보호하는 이유는 age에 음수 들어오는 등의 잘못된 데이터가 들어오는 경우 등을 막으려고임./읽기만 하고 값변경은 안할 수 있음
//		a.name = "홍길동";
//		a.phone = "010-2222-3333";
//		a.age = 20;
//		a.email = "aaa@aaa.com";
		
		a.setAge(20);
		System.out.println(a.getAge());
		
		a.print();
		
		b.print();
	}

}

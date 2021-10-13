package oop;
//A를 상속받아 B클래스를 정의
public class B extends A {
	private int y;
	
	public B() {
		System.out.println("B클래스의 생성자");
	}
	
	public B(int x, int y) {
		//private 변수는 상속관계라도 내것처럼 쓸 수 없음.
		super(x); //생략하면 super();가 자동생성됨
		//setX(x);
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("B에서 새로만든 print()");
	}
	
	@Override  //오버라이딩 규칙 틀렸을때 에러내줌
	public String toString() {
		//return "x = " + getX() + " " + this.getX() + " " + super.getX() + ", y = " + y;
		return super.toString() + ", y = " + this.y;
	}
}

package oop;

public class A {
	private int x;
	
	public A() {
		System.out.println("A클래스의 생성자");
	}
	
	public A(int x) {
		this.x = x;
		System.out.println("A클래스의 두번째 생성자");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("A클래스의 print() 메소드");
	}
	
	@Override
	public String toString() {
		return "x = " + x;
	}
}

package oop;

public class A {
	private int x;
	
	public A() {
		System.out.println("AŬ������ ������");
	}
	
	public A(int x) {
		this.x = x;
		System.out.println("AŬ������ �ι�° ������");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("AŬ������ print() �޼ҵ�");
	}
	
	@Override
	public String toString() {
		return "x = " + x;
	}
}

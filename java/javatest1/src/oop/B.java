package oop;
//A�� ��ӹ޾� BŬ������ ����
public class B extends A {
	private int y;
	
	public B() {
		System.out.println("BŬ������ ������");
	}
	
	public B(int x, int y) {
		//private ������ ��Ӱ���� ����ó�� �� �� ����.
		super(x); //�����ϸ� super();�� �ڵ�������
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
		System.out.println("B���� ���θ��� print()");
	}
	
	@Override  //�������̵� ��Ģ Ʋ������ ��������
	public String toString() {
		//return "x = " + getX() + " " + this.getX() + " " + super.getX() + ", y = " + y;
		return super.toString() + ", y = " + this.y;
	}
}


public class Prac11Class {
	 private int num;
	 private double oil;

	public Prac11Class() {
		num = 0;
		oil = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getOil() {
		return oil;
	}

	public void setOil(double oil) {
		this.oil = oil;
	}
	
	public void setCar(int num, double oil) {
		this.num = num;
		this.oil = oil;
		System.out.println("���� ��ȣ�� " + this.num + "����, ���� ���� " + this.oil + "�� �ٲپ����ϴ�.");
	}
	
	public String toString() {
		String str = "���� ��ȣ " + this.num + " ���� �� " + this.oil + "�� �ڵ����Դϴ�.";
		return str;
	}
	 
}

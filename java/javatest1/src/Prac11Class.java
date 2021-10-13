
public class Prac11Class {
	 private int num;
	 private double oil;

	public Prac11Class() {
		num = 0;
		oil = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
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
		System.out.println("차량 번호를 " + this.num + "으로, 연료 양을 " + this.oil + "로 바꾸었습니다.");
	}
	
	public String toString() {
		String str = "차량 번호 " + this.num + " 연료 양 " + this.oil + "인 자동차입니다.";
		return str;
	}
	 
}

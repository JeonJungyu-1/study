
package oop;

public class Calc {
	private int numberA;
	private int numberB;
	
	public void print() {
		System.out.println("a=" + numberA + ", b=" + numberB);
	}

	public int getNumberA() {
		return numberA;
	}

	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}

	public int getNumberB() {
		return numberB;
	}

	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}
	
	//여러개의 값을 return하려면 배열사용하거나 변수만 들어있는 클래스로 객체 만들어 사용하면 됨
	
	//멤버변수의 합계를 구하는 메소드
	public int total() {
		int t = numberA + numberB;
		return t;
	}
	
	//멤버변수의 평균을 구하는 메소드
	public double average() {
		double average = (numberA + numberB)/2.0;
		return average;
	}
//		//선생님 코드
//		public double average() {
//			double a = this.total() / 2.0;
//			return a;
//		}
	
	//memberA~memberB까지의 정수합계를 구하는 메소드
	public int sum() {
		int sum = 0;
		if (numberB > numberA) {
			for (int i = 0; i < (numberB-numberA+1); i++) {
				sum += (numberA + i);
			}
		}
		else if (numberB < numberA) {
			for (int i = 0; i < (numberA-numberB+1); i++) {
				sum += (numberB + i);
			}
		}
		else if (numberB == numberA) {
			sum = numberA;
		}
		
		return sum;
	}
//		//선생님 코드
//		public int sum() {
//			int s = 0;
//			for (int i = numberA; i <= numberB; i++) {
//				s += i;
//			}
//			return s;
//		}
	
	//memberA를 memberB번 곱하는 메소드
	public double multi() {
		double multi = 1;
		for (int i = 0; i < numberB; i++) {
			multi = multi * numberA;
		}
		return multi;
	}
//		//선생님 코드
//		public int multi() {
//			int s = 1;
//			for (int i = 0; i < numberB; i++) {
//				s *= numberA;
//			}
//			return Math.pow(numberA, numberB);
//		}
	
	//모든 멤버변수의 값을 증가시키는 메소드 
	// 위에 있는 sum() 메소드와는 다름 
	// 이렇게 메소드의 이름은 같은데 전달인자(인수)의 수가 차이나는것을 오버로딩이라고 함.
	//전달인자(인수)의 수가 같아도 int와 double 같이 타입이 다르면 가능함.
	public void sum(int n) {
		numberA = numberA + n;
		numberB = numberB + n;
		return;
	}
	
	//전달받은 인수 합계를 구하는 메소드
	public int sum(int a, int b, int c, int d, int e) {
		int s = a + b + c + d + e;
		return s;
	}

}

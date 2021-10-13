
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
	
	//�������� ���� return�Ϸ��� �迭����ϰų� ������ ����ִ� Ŭ������ ��ü ����� ����ϸ� ��
	
	//��������� �հ踦 ���ϴ� �޼ҵ�
	public int total() {
		int t = numberA + numberB;
		return t;
	}
	
	//��������� ����� ���ϴ� �޼ҵ�
	public double average() {
		double average = (numberA + numberB)/2.0;
		return average;
	}
//		//������ �ڵ�
//		public double average() {
//			double a = this.total() / 2.0;
//			return a;
//		}
	
	//memberA~memberB������ �����հ踦 ���ϴ� �޼ҵ�
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
//		//������ �ڵ�
//		public int sum() {
//			int s = 0;
//			for (int i = numberA; i <= numberB; i++) {
//				s += i;
//			}
//			return s;
//		}
	
	//memberA�� memberB�� ���ϴ� �޼ҵ�
	public double multi() {
		double multi = 1;
		for (int i = 0; i < numberB; i++) {
			multi = multi * numberA;
		}
		return multi;
	}
//		//������ �ڵ�
//		public int multi() {
//			int s = 1;
//			for (int i = 0; i < numberB; i++) {
//				s *= numberA;
//			}
//			return Math.pow(numberA, numberB);
//		}
	
	//��� ��������� ���� ������Ű�� �޼ҵ� 
	// ���� �ִ� sum() �޼ҵ�ʹ� �ٸ� 
	// �̷��� �޼ҵ��� �̸��� ������ ��������(�μ�)�� ���� ���̳��°��� �����ε��̶�� ��.
	//��������(�μ�)�� ���� ���Ƶ� int�� double ���� Ÿ���� �ٸ��� ������.
	public void sum(int n) {
		numberA = numberA + n;
		numberB = numberB + n;
		return;
	}
	
	//���޹��� �μ� �հ踦 ���ϴ� �޼ҵ�
	public int sum(int a, int b, int c, int d, int e) {
		int s = a + b + c + d + e;
		return s;
	}

}

package oop;

public class CalcTest {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.print();
		
		c.setNumberA(5);
		System.out.println(c.getNumberA());
		c.setNumberB(10);
		
		int i = c.total();	//������� �հ�
		System.out.println(i);
		double d = c.average();	//��������� ���
		System.out.println(d);
		i = c.sum();	//memberA~memberB������ �����հ�
		System.out.println(i);
		d = c.multi();	//memberA�� memberB�� ���ϱ�
		System.out.println(d); //out�� system�� �����ִ� printstream Ŭ������ ��������
		
		c.sum(10); //��� ��������� ���� ����
		c.print();
		
		i = c.sum(3,5,2,7,9); //���޹��� �μ� �հ�
		System.out.println(i);
	}

}

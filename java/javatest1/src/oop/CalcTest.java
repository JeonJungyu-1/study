package oop;

public class CalcTest {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.print();
		
		c.setNumberA(5);
		System.out.println(c.getNumberA());
		c.setNumberB(10);
		
		int i = c.total();	//멤버변수 합계
		System.out.println(i);
		double d = c.average();	//멤버변수의 평균
		System.out.println(d);
		i = c.sum();	//memberA~memberB까지의 정수합계
		System.out.println(i);
		d = c.multi();	//memberA를 memberB번 곱하기
		System.out.println(d); //out은 system이 갖고있는 printstream 클래스의 변수명임
		
		c.sum(10); //모든 멤버변수의 값을 증가
		c.print();
		
		i = c.sum(3,5,2,7,9); //전달받은 인수 합계
		System.out.println(i);
	}

}

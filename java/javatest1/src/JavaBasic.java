//Java의 변수와 자료형 연습
public class JavaBasic {

	public static void main(String[] args) {
		//Java의 변수이름 작성  변수명과 메소드 명은 소문자로 시작하고 클래스명은 대문자로 시작하기
		int a1;
//		int number123;
//		int number_123;
//		int number$123;
//		int firstNumber;
//		//int 123number;  //숫자로 시작하면 안됨
//		//int double;     //Java 키워드 안됨
//		//int number-123; //특수문자 안됨
//		int sftujseirjgwoierjg; //좋지 않은 변수명
		
		//Java의 기본자료형
		byte a;
		short b;
		int c;
		long d;
		char e;
		float f;
		double g;
		boolean h;
		
		//a = 200;		//byte형의 최대 범위인 127을 넘는 값으로 초기화
		//b = 40000;	//short형의 최대 범위를 넘는 값으로 초기화
		d = 10000000000l; //long형 상수(뒤에 L붙임) /숫자는 기본적으로 int로 처리하려고 함/변수에 숫자를 저장하기 전에 메모리에 저장하는데 그 형태가 무조건 int형임
		
		e = 'A';
		System.out.println(e);
		e = 100;
		System.out.println(e);
		e = '\n';
		System.out.println(e);
		e = 'A' + 3;
		System.out.println(e);
		System.out.println((int)e);
		
		System.out.println(1 + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1); //한쪽만 문자열이어도 +가 있으면 이어붙이기
		
		System.out.println("1" + 2 + 3); //아래코드랑 차이 구분하기
		System.out.println(2 + 3 + "1");
		
		f = 1.5f;  //double형이 기본이어서 double형을 float형 변수에 넣을 수 없음  그래서 뒤에 f 붙임.
		g = 1.5;
		g = 1.234e3; //1.234 곱하기 10의 3승
		
		h = true;		//true, false 중의 하나
		//h = a * 2 > 200;
		
		//int형 나누기
		c = 10/3;
		System.out.println(c);
		//double형 나누기
		g = 10.0 / 3.0;
		System.out.println(g);
		
		System.out.println((int)'가');
		
	}
}

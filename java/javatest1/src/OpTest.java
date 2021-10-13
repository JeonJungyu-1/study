
public class OpTest {

	public static void main(String[] args) {
		//정수의 산술연산
		int a, b, c;
		double x, y, z;
		
		a = 10;
		b = 3;
		
		c = a + b;  //++a*b  a++*b 차이 비교 p82참고하기
		System.out.println(c);
		c = a % b;
		System.out.println(c);
		c = a - b * 2 + 1;
		System.out.println(c);
		c = (int)(a / 3 + b / 2.0);   //double형 변수에 int형을 넣을 수는 있는데 int형 변수에 double형을 넣을수는 없음  
		System.out.println(c);
		c = a / 3 + b / (int)2.0;
		System.out.println(c);
		x = a / 3 + b / 2.0;
		System.out.println(x);
		x = a / (3 + b) / 2.0;
		System.out.println(x);
		
		c = a + b + 1 + 3 + 5;
		c = a = b = 1;
		
		a = 0;
		b = 0;
		
		++a; 		// a = a + 1; 단항연산자
		System.out.println(a);
		a++;
		System.out.println(a);
		
		c = ++a;		//전위형 증가연산자
		System.out.println("a=" + a + ", c=" + c);
		c = a++;		//후위형 증가연산자 / ++이 없다고 생각하고 계산후에 1이 증가함/ ++a*2 a++*2 다른것
		System.out.println("a=" + a + ", c=" + c);
		
		//c = ++a * a++;   //좋지 않은 수식 사용임 / 언어마다 계산방식이 다를 수 있음
		
		--a;
		System.out.println(a);
		
		c = c + b; //2개가 같은 식임
		c += b;
		
		a += 1;    //3개가 같은 식임 
		a = a + 1;
		a++;
		
	}

}

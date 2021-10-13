//연산자 연습
public class OpTest3 {

	public static void main(String[] args) {
		int a, b, c;
		
		a = 10;
		c = a << 1;
		System.out.println(c);
		
		a = 10;
		b = 7;
		c = a & b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
		
		//삼항연산자. 조건연산자.
		a = 10;
		b = 2;
		c = a > b? a : b;   // 조건? true가 나오면 이 값: false가 나오면 이 값
		System.out.println(c);
		
		System.out.println(a > 0? "큰수" : "크지않음");
		
		byte d, e, f;
		d = 1;
		e = 2;
		f = (byte)(d + e);
		System.out.println(f);
	}

}


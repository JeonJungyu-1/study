//while, do~while문
public class WhileTest1 {

	public static void main(String[] args) {
		int s, n;
		
		//for문 사용
		s = 0;
		for (n = 1; n < 11; n++) {
			s = s + n;
		}
		System.out.println("합계:" + s);
		
		
		//while문 사용
		s = 0;
		n = 1;
		while (n < 11) {
			s = s + n;
			n++; 
		}
		System.out.println("합계:" + s);
		
		//do~while문 사용 / 한번은 실행함
		s = 0;
		n = 1;
		do {
			s = s + n;
			n++;
		} while (n < 11);
		System.out.println("합계:" + s);
	}

}

//합계 구하기
public class ForTest2 {

	public static void main(String[] args) {
		// 1~10까지의 합계
		int s = 0;
		for(int i = 1; i <= 10; i++) { 
			s = s + i;
		}
		System.out.println(s);
		
		// 1~100까지의 합계
		s = 0;
		for(int i = 1; i <= 100; i++) { 
			s = s + i;
		}
		System.out.println(s);
		
		//1~100중 짝수의 합계
		s = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
			s = s + i;
			}
		}
			//선생님 코드
			s = 0;
			for(int i = 2; i <= 100; i+=2) { 
				s = s + i;
			}
		System.out.println(s);
		
		//1~100중 3의 배수의 합계
		s = 0;
		for(int i = 1; i <= 100; i++) { 
			if (i % 3 == 0) {
			s = s + i;
			}
		}
		System.out.println(s);
		
		//1부터 정수들의 합계. 합계가 4000을 넘어가는 순간의 정수와 합계출력
		s = 0;
		int i;
		for(i = 1; s <= 4000; i++) {
			s = s + i;
		}
		System.out.println("정수 : " + i + ", 합계 : " + s);
			//선생님 코드
			for (i = 1; ; i++ ) {
				s = s + i;
				if(s > 4000) {
					break;
				}
			}
		
	}

}

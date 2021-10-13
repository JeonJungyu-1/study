//반복문 - for문 연습
public class ForTest1 {

	public static void main(String[] args) {

//		//1   i는 루프제어변수라고 함.
//		for (int i = 0 ; i < 5 ; i++) {
//			System.out.println("문장출력");
//		}

		// 0 1 2 3 4
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 2 3 4 5
		for (int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 0 2 4 6 8
		for (int i = 0; i < 9; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 3 5 7 9
		for (int i = 1; i < 10; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 10 20 30 40 50 60 70 80 90 100
		for (int i = 10; i < 101; i=i+10) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 5 4 3 2 1 
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 10 100 1000 10000
		for (int i = 1; i < 10001; i=i*10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 2 4 5 7 8 10 11 13 14
		for (int i = 1; i < 15; i++) {
			System.out.print(i + " ");
			if (i % 3==2) {
				i++;
			}
		}
		System.out.println();
			//선생님 코드
			for (int i = 1; i < 15; i++) {
				if(i % 3 != 0) {
				System.out.print(i + " ");
				}
			}
			System.out.println();
		
		// 1~100중에 4의 배수이면서 5의 배수가 아닌값 (4, 8, 12, 16, 24..)
		for (int i = 4; i < 101; i=i+4) {
			if(i % 5 != 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
			//선생님 코드
			for (int i = 0; i <= 100; i++) {
				if(i % 4 == 0 && i % 5 != 0) {
				System.out.print(i + " ");
				}
			}
			System.out.println();
		
		// 1~100중에 7또는 9의 배수인 값 (7, 9, 14, 18...)
		for (int i = 1; i < 101; i++) {
			if(i % 7 == 0 || i % 9 == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
	
		//100의 약수 찾기 (2, 4, 5...)
		for (int i = 2; i < 101; i++) {
			if(100 % i == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//for문을 제어하는 문장들
		for (int i = 1;i <= 100; i++) {
			if (i % 10 == 0) {
				//continue;					//이번 반복만 건너뜀 / 바로 i++로 이동
				//break;					//반복 종료 / 그 반복문을 종료하고 밑으로 나감
				//return;					//메소드 종료
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("프로그램의 끝");
	}

}

/*
 * 사용자가 반복 입력하는 정수들의 합계. 0을 입력하면 입력종료하고 결과 출력.
정수입력:1
정수입력:2
정수입력:3
정수입력:4
정수입력:0
---------
합계: 10
 */
import java.util.Scanner;
public class WhileTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c = 0;
		
		//for문
		for (a = 0; a < a + 1; a++) {
			System.out.print("정수입력:");
			b = input.nextInt();
			if(b != 0) {
				c += b;
			}
			else {
				break;
			}

		}
		//while문
		a = 0;
		c = 0;
		while (a < a + 1) {
			System.out.print("정수입력:");
			b = input.nextInt();
			if(b != 0) {
				c += b;
				a++;				
			}
			else {
				break;
			}

		}
		System.out.println("합계:" + c);
		//do~while문
		a = 0;
		c = 0;
		do {
			System.out.print("정수입력:");
			b = input.nextInt();
			if(b != 0) {
				c += b;
				a++;				
			}
			else {
				break;
			}

		} while (a < a + 1);
		System.out.println("합계:" + c);

		//선생님 코드 1
		int s, n;
		s = 0;
		do {
			System.out.print("정수입력:");
			n = input.nextInt();
			s += n;
		} while (n != 0);
		System.out.println("합계:" + s);
		
		//선생님 코드 2 /보편적으로 쓰임
		s = 0;
		while (true) {
			System.out.print("정수입력:");
			n = input.nextInt();
			if (n == 0) {
				break; 
			}
			s += n;
		}
		System.out.println("합계:" + s);
		
	}

}

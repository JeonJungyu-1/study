import java.util.Scanner;

//6과 연습문제
public class PracL6 {

	public static void main(String[] args) {
		//1번 문제
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		//2번 문제
		Scanner input = new Scanner(System.in);
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)");
		int sum = 0;
		while(true) {
			int score = input.nextInt();
			sum += score;
			if (score == 0) {
				break;
			}	
		}
		
		System.out.println("시험 점수의 합계는 " + sum + "점 입니다.");
		
		//3번 문제
		int i, j;
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.print((i*j) + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
		//4번 문제
		for(i = 1; i < 6; i++) {
			for(j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5번 문제
		System.out.println("2 이상의 정수를 입력하십시오.");
		int num = input.nextInt();
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + "은 소수가 아닙니다.");
				return;
			}
		}
		System.out.println(num + "은 소수입니다.");
	}

}

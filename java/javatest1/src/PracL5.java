//5과 연습문제
import java.util.Scanner;
public class PracL5 {

	public static void main(String[] args) {
		int i, j;
		double k;
		Scanner input = new Scanner(System.in);
		
		//2번 문제
		System.out.println("정수를 입력하십시오.");
		i=input.nextInt();
		if(i % 2 == 0) {
			System.out.println(i + "은 짝수입니다.");
		}
		else {
			System.out.println(i + "은 홀수입니다.");
		}
		
		//3번 문제
		System.out.println("2개의 정수를 입력하십시오.");
		i=input.nextInt();
		j=input.nextInt();
		if(i > j) {
			System.out.println(j + "보다 " + i + "가 큽니다.");
		}
		else if(i < j) {
			System.out.println(i + "보다 " + j + "가 큽니다.");
		}
		else if(i == j) {
			System.out.println("두 숫자는 같습니다.");
		}
		
		//4번 문제
		System.out.println("0 에서 10까지의 수를 입력하십시오.");
		i = input.nextInt();
		if(i >= 0 && i <= 10) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("오답입니다.");
		}
		
		//5번 문제
		System.out.println("정수를 입력하십시오.");
		i = input.nextInt();
		switch(i) {
			case 1 : 
				System.out.println("노력합시다.");
				break;
			case 2 : 
				System.out.println("조금 더 노력합시다.");
				break;
			case 3 : 
				System.out.println("더 높은 점수를 목표로 합시다.");
				break;
			case 4 : 
				System.out.println("매우 잘했습니다.");
				break;
			case 5 : 
				System.out.println("매우 우수합니다.");
				break;
		}
	}

}

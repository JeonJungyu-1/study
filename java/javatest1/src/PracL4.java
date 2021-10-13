//4과 연습문제
import java.util.Scanner;
public class PracL4 {

	public static void main(String[] args) {
		int i,j, a, b, c;
		double k;
		Scanner input = new Scanner(System.in);
		//2번 문제
		System.out.println("0 - 4 = " + (0 - 4));
		System.out.println("3.14 * 2 = " + (3.14 * 2));
		System.out.println("5 / 3 = " + (5 / 3.0));
		System.out.println("30 % 7 = " + (30 % 7));
		System.out.println("(7+32)/5 = " + ((7+32) / 5.0));
		
		//3번 문제
		System.out.println("정사각형의 한 변의 길이를 입력하십시오.");
		i = input.nextInt();
		System.out.println("정사각형의 넓이는 " + i + "입니다");
		
		//4번 문제
		System.out.println("삼각형의 밑변과 높이를 입력하삽시오");
		i = input.nextInt();
		j = input.nextInt();
		System.out.println("삼각형의 넓이는 " + ((i*j)/2.0) + "입니다.");
		
		//5번 문제
		System.out.println("과목 1 ~ 5의 점수를 정수로 입력하십시오.");
		i = input.nextInt();
		j = input.nextInt();
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		System.out.println("5과목의 합계는 " + (i+j+a+b+c) + "점입니다.");
		System.out.println("5과목의 평균은 " + ((i+j+a+b+c)/5.0) + "점입니다");
	}

}

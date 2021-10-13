//3과 연습문제
import java.util.Scanner;
public class PracL3 {

	public static void main(String[] args) {
		int i = 0;
		double j, k;
		Scanner input = new Scanner(System.in);
		//3번 문제
		System.out.println("당신은 몇 살 입니까?");
		i = input.nextInt();
		System.out.println("당신은 " + i + "살입니다.");
		
		//4번 문제
		System.out.println("원주율의 값은 얼마입니까?");
		j = input.nextDouble();
		System.out.println("원주율의 값은 " + j + "입니다.");
		
		//5번 문제
		System.out.println("키와 몸무게를 입력하십시오");
		j = input.nextDouble();
		k = input.nextDouble();
		System.out.println("키는 " + j + "센티미터입니다.");
		System.out.println("몸무게는 " + k + "킬로그램입니다.");
	}

}
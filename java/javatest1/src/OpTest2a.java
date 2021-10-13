//3과목의 총점과 평균 구하기/직접 입력해서 구하기
import java.util.Scanner;
public class OpTest2a {

	public static void main(String[] args) {
		int k, e, m;
		int sum;
		double avg;
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		k = input.nextInt();
		System.out.print("영어점수 : ");
		e = input.nextInt();
		System.out.print("수학점수 : ");
		m = input.nextInt();
		
		sum = k + e + m;
		avg = sum / 3.0;
		System.out.println("총점은 " + sum + ", 평균은 " + avg + "입니다.");

	}

}

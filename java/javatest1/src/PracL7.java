import java.util.Scanner;

//7장 연습문제
public class PracL7 {

	public static void main(String[] args) {
		//4번 문제
		Scanner input = new Scanner(System.in);
		System.out.println("5 명의 시험 점수를 입력하십시오.");
		int sum = 0;
		int score[] = new int[5];
		for(int i = 0; i < 5; i++) {
			score[i] = input.nextInt();
			sum += score[i];
		}
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번째 사람의 점수는 " + score[i] + "입니다.");
		}
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int a = score[i];
					score[i] = score[j];
					score[j] = a;
				}
			}
		}
		System.out.println("가장 높은 점수는 " + score[score.length-1] + "점입니다.");
	}

}

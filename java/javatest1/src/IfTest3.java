import java.util.Scanner;
public class IfTest3 {

	public static void main(String[] args) {
		//0~100 점수를 입력받는다.
		//90~100점은 "수"라고 출력한다.
		//80~90미만은 "우"
		//70~80미만은 "미"
		//60~70미만은 "양"
		//60미만은 "가"
		int score;
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수(0~100):");
		score = input.nextInt();
		if ( score >= 90 ) {
			System.out.println("수");
		}
		else if( score >= 80 ) {
			System.out.println("우");
		}
		else if( score >= 70 ) {
			System.out.println("미");
		}
		else if( score >= 60 ) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
		
		//선생님 코드
		int test ;
		System.out.print("점수:");
		test = input.nextInt();
		if (test > 100)
			System.out.println("오류");
		else if (test >= 90)
			System.out.println("수");
		else if (test >= 80)
			System.out.println("우");
		else if (test >= 70)
			System.out.println("미");
		else if (test >= 60)
			System.out.println("양");
		else if (test > 0)
			System.out.println("가");
		else 
			System.out.println("오류");
		
	}

}

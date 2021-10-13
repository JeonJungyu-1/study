//for문 - 합계 구하기
import java.util.Scanner;
public class ForTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, m, n, start, end, s;
		
		//1부터 입력받은 수까지의 합계
		System.out.print("정수입력:");
		n=input.nextInt();
		
		s = 0;
		for (i = 1 ; i <= n ; i++) {
			s = s + i;
		}
		System.out.println("1~" + n + "까지의 합계:" + s);
		
		//입력받은 두 정수 사이의 합계
		System.out.print("정수 1 입력:");
		m=input.nextInt();
		System.out.print("정수 2 입력:");
		n=input.nextInt();
		s=0;
		if(m > n) {
		for (i = 1 ; i < (m-n) ; i++) {
			s = s + n + i;
		}
		}
		else if (m < n) {
			for (i = 1 ; i < (n-m) ; i++) {
				s = s + m + i;
			}
		}
		else if (m == n) {
			System.out.println("정수 값이 같습니다.");
		}
		System.out.println(s);
			//선생님 코드
			System.out.print("정수입력:");
			start=input.nextInt();
			System.out.print("정수입력:");
			end=input.nextInt();
			s = 0;
			if (start < end) {
				for (i = start ; i <= end ; i++) {
					s = s + i;
				}
			}
			else {
				for (i = end ; i <= start ; i++) {
					s = s + i;
				}
			}
			//선생님 코드2
			if (start > end) {
				int temp;
				temp = start;
				start = end;
				end = temp;
			}
			for (i = start ; i <= end ; i++) {
				s = s + i;
			}
			
		//정수 5개를 입력받아 합계
		//3 + 10 + 1 + 5 + 2 ----> 21
		s=0;
		for (i=0;i<5;i++) {
			System.out.print("정수입력:");
			n=input.nextInt();
			s=s+n;
			System.out.println(s);
		}
		System.out.println("합계 : " + s);
			//선생님 코드
			for (i = 0; i < 5; i++) {
				System.out.println("계산할 정수 입력 " + i + " : ");
				n = input.nextInt();
				s += n;
			}
	}

}

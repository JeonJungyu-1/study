/*
배열의 크기 : 5
정수입력0: 1
정수입력1: 1
정수입력2: 1
정수입력3: 1
정수입력4: 1
-----------------
1 + 1 + 1 + 1 + 1 = 5
 */
import java.util.Scanner;
public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ar[];
		int m, n, sum = 0;
		
		System.out.print("배열의 크기 : ");
		n = input.nextInt();
		ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			System.out.print("정수입력 " + i + " : ");
			m = input.nextInt();
			ar[i] = m;
			sum += m;
		}
		System.out.println("----------------");
		for (int i = 0; i < ar.length; i++) {
			if (i == ar.length - 1) {
				System.out.println(ar[ar.length-1] + " = " + sum);
			}
			else {
				System.out.print(ar[i] + " + ");	
			}
		}

		
		//선생님 코드
		//배열의 크기를 입력받아서 배열 생성
		int s = 0;
		System.out.print("배열의 크기:");
//		n = input.nextInt();
//		ar = new int[n];
		
		//배열 크기만큼 반복하면서 정수입력받아 배열에 저장
		for (int i = 0; i < ar.length; i++) {
			System.out.print("정수입력" + i + ":");
			ar[i] = input.nextInt();
		}
		//배열 원소들의 숫자들을 모두 합계
		for (int i = 0; i < ar.length; i++) {
			s = s + ar[i];
		}
		//지정한 형식으로 출력
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + (i < ar.length-1? "+":"="));
		}
		System.out.println(s);
	}

}

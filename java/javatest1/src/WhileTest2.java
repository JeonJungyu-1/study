import java.util.Scanner;
public class WhileTest2 {

	public static void main(String[] args) {
		//정수 5개를 입력받아 합계
		//3 + 10 + 1 + 5 + 2 ---> 21
		Scanner input = new Scanner(System.in);
		int a, b, c = 0;
		
		//for문
		for(a = 0; a < 5; a++) {
			System.out.print("정수입력:");
			b = input.nextInt();
			c += b;
		}
		System.out.println("합계:" + c);
		
		//while문
		a = 0;
		c = 0;
		while(a < 5) {
			System.out.print("정수입력:");
			b = input.nextInt();
			c += b;
			a++;
		}
		System.out.println("합계:" + c);
		
		//do~while문
		a = 0;
		c = 0;
		do {
			System.out.print("정수입력:");
			b = input.nextInt();
			c += b;
			a++;
		} while(a < 5);
		System.out.println("합계:" + c);
	}

}

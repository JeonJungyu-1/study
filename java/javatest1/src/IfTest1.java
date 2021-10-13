//if문, 관계연산자, 논리연산자
import java.util.Scanner;
public class IfTest1 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수입력:");
		n = input.nextInt();
		
		//1
		if (n > 0) {
			System.out.println(n + "은 양수입니다.");
		}
		
		//2
		if (n == 0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println("0이 아닙니다.");
		}
		
		//3
		if (n == 1) {
			System.out.println("1입니다.");
		}
		else if (n == 2) {
			System.out.println("2입니다.");
		}
		else if (n == 3) {
			System.out.println("3입니다.");
		}
		else {
			System.out.println("그 밖의 수입니다.");
		}
		
		
		return; 
	}

}

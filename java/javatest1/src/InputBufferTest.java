import java.util.Scanner;

public class InputBufferTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, n2, n3;
		String s, s2 ,s3;
		
		//1
//		System.out.print("정수입력:");
//		n = input.nextInt();
//		System.out.print("문자열입력:");
//		s = input.next();
//		System.out.print("문자열입력2:");
//		s2 = input.next();
//		System.out.println(s + ", " + s2 + ", " + n);
		
		//2
//		System.out.print("정수입력:");
//		n = input.nextInt();
//		System.out.print("문자열입력:");
//		input.nextLine();
//		s = input.nextLine();
//		System.out.print("문자열입력2:");
//		s2 = input.nextLine();
//		System.out.println(s + ", " + s2 + ", " + n);
		
		//이름, 나이, 주소 입력받아 출력한다.
		System.out.print("이름 : ");
		s = input.next();
		System.out.print("나이 : ");
		n = input.nextInt();
		System.out.print("주소 : ");
		input.nextLine();
		s2 = input.nextLine();
		System.out.println("이름 : " + s + ", 나이 : " + n + ", 주소 : " + s2);
		
	}

}

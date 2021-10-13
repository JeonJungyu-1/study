import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		//2
		Scanner input = new Scanner(System.in);
//		String str;
//		int num;
//		System.out.println("문자열을 입력하십시오.");
//		str = input.next();
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(str + "를 거꾸로 읽으면 " + sb.reverse() + "입니다.");
//		
//		//3
//		System.out.println("문자열을 입력하십시오.");
//		str = input.next();
//		System.out.println("a가 들어갈 위치를 정수로 입력하십시오.");
//		num = input.nextInt();
//		sb.insert(num, 'a');
//		System.out.println(sb + "가 되었습니다.");
		
		//4
		System.out.println("정수를 2개 입력하십시오.");
		int n1, n2;
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println(n1 + "과 " + n2 + "중 작은 쪽은 " + Math.min(n1, n2) + "입니다.");
	}

}

import java.util.Scanner;

public class InputBufferTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, n2, n3;
		String s, s2 ,s3;
		
		//1
//		System.out.print("�����Է�:");
//		n = input.nextInt();
//		System.out.print("���ڿ��Է�:");
//		s = input.next();
//		System.out.print("���ڿ��Է�2:");
//		s2 = input.next();
//		System.out.println(s + ", " + s2 + ", " + n);
		
		//2
//		System.out.print("�����Է�:");
//		n = input.nextInt();
//		System.out.print("���ڿ��Է�:");
//		input.nextLine();
//		s = input.nextLine();
//		System.out.print("���ڿ��Է�2:");
//		s2 = input.nextLine();
//		System.out.println(s + ", " + s2 + ", " + n);
		
		//�̸�, ����, �ּ� �Է¹޾� ����Ѵ�.
		System.out.print("�̸� : ");
		s = input.next();
		System.out.print("���� : ");
		n = input.nextInt();
		System.out.print("�ּ� : ");
		input.nextLine();
		s2 = input.nextLine();
		System.out.println("�̸� : " + s + ", ���� : " + n + ", �ּ� : " + s2);
		
	}

}

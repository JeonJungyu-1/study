import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		//2
		Scanner input = new Scanner(System.in);
//		String str;
//		int num;
//		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
//		str = input.next();
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(str + "�� �Ųٷ� ������ " + sb.reverse() + "�Դϴ�.");
//		
//		//3
//		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
//		str = input.next();
//		System.out.println("a�� �� ��ġ�� ������ �Է��Ͻʽÿ�.");
//		num = input.nextInt();
//		sb.insert(num, 'a');
//		System.out.println(sb + "�� �Ǿ����ϴ�.");
		
		//4
		System.out.println("������ 2�� �Է��Ͻʽÿ�.");
		int n1, n2;
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println(n1 + "�� " + n2 + "�� ���� ���� " + Math.min(n1, n2) + "�Դϴ�.");
	}

}

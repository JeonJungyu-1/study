//3������ ������ ��� ���ϱ�/���� �Է��ؼ� ���ϱ�
import java.util.Scanner;
public class OpTest2a {

	public static void main(String[] args) {
		int k, e, m;
		int sum;
		double avg;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� : ");
		k = input.nextInt();
		System.out.print("�������� : ");
		e = input.nextInt();
		System.out.print("�������� : ");
		m = input.nextInt();
		
		sum = k + e + m;
		avg = sum / 3.0;
		System.out.println("������ " + sum + ", ����� " + avg + "�Դϴ�.");

	}

}

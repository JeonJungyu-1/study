//for�� - �հ� ���ϱ�
import java.util.Scanner;
public class ForTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, m, n, start, end, s;
		
		//1���� �Է¹��� �������� �հ�
		System.out.print("�����Է�:");
		n=input.nextInt();
		
		s = 0;
		for (i = 1 ; i <= n ; i++) {
			s = s + i;
		}
		System.out.println("1~" + n + "������ �հ�:" + s);
		
		//�Է¹��� �� ���� ������ �հ�
		System.out.print("���� 1 �Է�:");
		m=input.nextInt();
		System.out.print("���� 2 �Է�:");
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
			System.out.println("���� ���� �����ϴ�.");
		}
		System.out.println(s);
			//������ �ڵ�
			System.out.print("�����Է�:");
			start=input.nextInt();
			System.out.print("�����Է�:");
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
			//������ �ڵ�2
			if (start > end) {
				int temp;
				temp = start;
				start = end;
				end = temp;
			}
			for (i = start ; i <= end ; i++) {
				s = s + i;
			}
			
		//���� 5���� �Է¹޾� �հ�
		//3 + 10 + 1 + 5 + 2 ----> 21
		s=0;
		for (i=0;i<5;i++) {
			System.out.print("�����Է�:");
			n=input.nextInt();
			s=s+n;
			System.out.println(s);
		}
		System.out.println("�հ� : " + s);
			//������ �ڵ�
			for (i = 0; i < 5; i++) {
				System.out.println("����� ���� �Է� " + i + " : ");
				n = input.nextInt();
				s += n;
			}
	}

}

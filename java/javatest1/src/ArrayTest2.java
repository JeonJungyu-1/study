/*
�迭�� ũ�� : 5
�����Է�0: 1
�����Է�1: 1
�����Է�2: 1
�����Է�3: 1
�����Է�4: 1
-----------------
1 + 1 + 1 + 1 + 1 = 5
 */
import java.util.Scanner;
public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ar[];
		int m, n, sum = 0;
		
		System.out.print("�迭�� ũ�� : ");
		n = input.nextInt();
		ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			System.out.print("�����Է� " + i + " : ");
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

		
		//������ �ڵ�
		//�迭�� ũ�⸦ �Է¹޾Ƽ� �迭 ����
		int s = 0;
		System.out.print("�迭�� ũ��:");
//		n = input.nextInt();
//		ar = new int[n];
		
		//�迭 ũ�⸸ŭ �ݺ��ϸ鼭 �����Է¹޾� �迭�� ����
		for (int i = 0; i < ar.length; i++) {
			System.out.print("�����Է�" + i + ":");
			ar[i] = input.nextInt();
		}
		//�迭 ���ҵ��� ���ڵ��� ��� �հ�
		for (int i = 0; i < ar.length; i++) {
			s = s + ar[i];
		}
		//������ �������� ���
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + (i < ar.length-1? "+":"="));
		}
		System.out.println(s);
	}

}

/*
 * ����ڰ� �ݺ� �Է��ϴ� �������� �հ�. 0�� �Է��ϸ� �Է������ϰ� ��� ���.
�����Է�:1
�����Է�:2
�����Է�:3
�����Է�:4
�����Է�:0
---------
�հ�: 10
 */
import java.util.Scanner;
public class WhileTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c = 0;
		
		//for��
		for (a = 0; a < a + 1; a++) {
			System.out.print("�����Է�:");
			b = input.nextInt();
			if(b != 0) {
				c += b;
			}
			else {
				break;
			}

		}
		//while��
		a = 0;
		c = 0;
		while (a < a + 1) {
			System.out.print("�����Է�:");
			b = input.nextInt();
			if(b != 0) {
				c += b;
				a++;				
			}
			else {
				break;
			}

		}
		System.out.println("�հ�:" + c);
		//do~while��
		a = 0;
		c = 0;
		do {
			System.out.print("�����Է�:");
			b = input.nextInt();
			if(b != 0) {
				c += b;
				a++;				
			}
			else {
				break;
			}

		} while (a < a + 1);
		System.out.println("�հ�:" + c);

		//������ �ڵ� 1
		int s, n;
		s = 0;
		do {
			System.out.print("�����Է�:");
			n = input.nextInt();
			s += n;
		} while (n != 0);
		System.out.println("�հ�:" + s);
		
		//������ �ڵ� 2 /���������� ����
		s = 0;
		while (true) {
			System.out.print("�����Է�:");
			n = input.nextInt();
			if (n == 0) {
				break; 
			}
			s += n;
		}
		System.out.println("�հ�:" + s);
		
	}

}

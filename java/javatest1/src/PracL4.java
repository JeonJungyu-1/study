//4�� ��������
import java.util.Scanner;
public class PracL4 {

	public static void main(String[] args) {
		int i,j, a, b, c;
		double k;
		Scanner input = new Scanner(System.in);
		//2�� ����
		System.out.println("0 - 4 = " + (0 - 4));
		System.out.println("3.14 * 2 = " + (3.14 * 2));
		System.out.println("5 / 3 = " + (5 / 3.0));
		System.out.println("30 % 7 = " + (30 % 7));
		System.out.println("(7+32)/5 = " + ((7+32) / 5.0));
		
		//3�� ����
		System.out.println("���簢���� �� ���� ���̸� �Է��Ͻʽÿ�.");
		i = input.nextInt();
		System.out.println("���簢���� ���̴� " + i + "�Դϴ�");
		
		//4�� ����
		System.out.println("�ﰢ���� �غ��� ���̸� �Է��ϻ�ÿ�");
		i = input.nextInt();
		j = input.nextInt();
		System.out.println("�ﰢ���� ���̴� " + ((i*j)/2.0) + "�Դϴ�.");
		
		//5�� ����
		System.out.println("���� 1 ~ 5�� ������ ������ �Է��Ͻʽÿ�.");
		i = input.nextInt();
		j = input.nextInt();
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		System.out.println("5������ �հ�� " + (i+j+a+b+c) + "���Դϴ�.");
		System.out.println("5������ ����� " + ((i+j+a+b+c)/5.0) + "���Դϴ�");
	}

}

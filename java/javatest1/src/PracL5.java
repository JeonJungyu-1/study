//5�� ��������
import java.util.Scanner;
public class PracL5 {

	public static void main(String[] args) {
		int i, j;
		double k;
		Scanner input = new Scanner(System.in);
		
		//2�� ����
		System.out.println("������ �Է��Ͻʽÿ�.");
		i=input.nextInt();
		if(i % 2 == 0) {
			System.out.println(i + "�� ¦���Դϴ�.");
		}
		else {
			System.out.println(i + "�� Ȧ���Դϴ�.");
		}
		
		//3�� ����
		System.out.println("2���� ������ �Է��Ͻʽÿ�.");
		i=input.nextInt();
		j=input.nextInt();
		if(i > j) {
			System.out.println(j + "���� " + i + "�� Ů�ϴ�.");
		}
		else if(i < j) {
			System.out.println(i + "���� " + j + "�� Ů�ϴ�.");
		}
		else if(i == j) {
			System.out.println("�� ���ڴ� �����ϴ�.");
		}
		
		//4�� ����
		System.out.println("0 ���� 10������ ���� �Է��Ͻʽÿ�.");
		i = input.nextInt();
		if(i >= 0 && i <= 10) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		
		//5�� ����
		System.out.println("������ �Է��Ͻʽÿ�.");
		i = input.nextInt();
		switch(i) {
			case 1 : 
				System.out.println("����սô�.");
				break;
			case 2 : 
				System.out.println("���� �� ����սô�.");
				break;
			case 3 : 
				System.out.println("�� ���� ������ ��ǥ�� �սô�.");
				break;
			case 4 : 
				System.out.println("�ſ� ���߽��ϴ�.");
				break;
			case 5 : 
				System.out.println("�ſ� ����մϴ�.");
				break;
		}
	}

}

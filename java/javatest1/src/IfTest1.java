//if��, ���迬����, ��������
import java.util.Scanner;
public class IfTest1 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����Է�:");
		n = input.nextInt();
		
		//1
		if (n > 0) {
			System.out.println(n + "�� ����Դϴ�.");
		}
		
		//2
		if (n == 0) {
			System.out.println("0�Դϴ�.");
		}
		else {
			System.out.println("0�� �ƴմϴ�.");
		}
		
		//3
		if (n == 1) {
			System.out.println("1�Դϴ�.");
		}
		else if (n == 2) {
			System.out.println("2�Դϴ�.");
		}
		else if (n == 3) {
			System.out.println("3�Դϴ�.");
		}
		else {
			System.out.println("�� ���� ���Դϴ�.");
		}
		
		
		return; 
	}

}

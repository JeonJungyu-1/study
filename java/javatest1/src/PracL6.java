import java.util.Scanner;

//6�� ��������
public class PracL6 {

	public static void main(String[] args) {
		//1�� ����
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		//2�� ����
		Scanner input = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻʽÿ�. (0���� ����)");
		int sum = 0;
		while(true) {
			int score = input.nextInt();
			sum += score;
			if (score == 0) {
				break;
			}	
		}
		
		System.out.println("���� ������ �հ�� " + sum + "�� �Դϴ�.");
		
		//3�� ����
		int i, j;
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.print((i*j) + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
		//4�� ����
		for(i = 1; i < 6; i++) {
			for(j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5�� ����
		System.out.println("2 �̻��� ������ �Է��Ͻʽÿ�.");
		int num = input.nextInt();
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
				return;
			}
		}
		System.out.println(num + "�� �Ҽ��Դϴ�.");
	}

}

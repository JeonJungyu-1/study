import java.util.Scanner;
public class WhileTest2 {

	public static void main(String[] args) {
		//���� 5���� �Է¹޾� �հ�
		//3 + 10 + 1 + 5 + 2 ---> 21
		Scanner input = new Scanner(System.in);
		int a, b, c = 0;
		
		//for��
		for(a = 0; a < 5; a++) {
			System.out.print("�����Է�:");
			b = input.nextInt();
			c += b;
		}
		System.out.println("�հ�:" + c);
		
		//while��
		a = 0;
		c = 0;
		while(a < 5) {
			System.out.print("�����Է�:");
			b = input.nextInt();
			c += b;
			a++;
		}
		System.out.println("�հ�:" + c);
		
		//do~while��
		a = 0;
		c = 0;
		do {
			System.out.print("�����Է�:");
			b = input.nextInt();
			c += b;
			a++;
		} while(a < 5);
		System.out.println("�հ�:" + c);
	}

}

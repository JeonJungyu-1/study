//����
/*
�����Է�: 10
�����Է�: 5
������ ���� (+, -, *, /): /

10 / 5 = 2

** �����ڰ� �� 4���� ���� �ϳ��� �ƴϸ� ���� �޽��� ���
** 0���� ���� �� ����
*
* - ���ڿ� �񱳴� a=="+"�� ����. ���ڿ� �񱳴� a.equals("+") a�� ���� ������
* - ���α׷� ���� : return
 */
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		int num1=0, num2=0, res=0;
		
		//Scanner����
		Scanner input = new Scanner(System.in);
		//���� 2���� �Է�
//		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
//		num1 = input.nextInt();
//		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
//		num2 = input.nextInt();
//		//���
//		res = num1 + num2;
//		//������
//		System.out.println("��� : " + res);
//		
//		//������ �ڵ�
//		System.out.print("�����Է�:");
//		num1 = input.nextInt();
//		System.out.print("�����Է�:");
//		num2 = input.nextInt();
//		res = num1 + num2;
//		System.out.println(res);
		
		String ma;
		
		System.out.print("�����Է� : ");
		num1 = input.nextInt();
		System.out.print("�����Է� : ");
		num2 = input.nextInt();
		System.out.print("������ ���� (+,-,*,/): ");
		ma = input.next();
		
		//���
		switch(ma) {
			case "+" :
				res = num1 + num2;
				break;
			case "-" :
				res = num1 - num2;
				break;
			case "*" :
				res = num1 * num2;
				break;
			case "/" :
				if(num2==0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					return;
				}
				res = num1 / num2;
				break;
			default :
			System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
			return;
		}
		
		//��� ���
		System.out.println(num1 + " " + ma + " " + num2 + " = " + res);
		
		//������ �ڵ�
		
		
		
		
	}
	
	
	

}

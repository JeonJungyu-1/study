import java.util.Scanner;
public class IfTest5 {

	public static void main(String[] args) {
		//�¾ �ظ� �Է¹޴´�
		//�츦 ����մϴ�.
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�¾ ��:");
		year = input.nextInt();
		
		//if�� ���
//		if (year % 12 == 4) {
//			System.out.println("���");
//		}
//		else if (year % 12 == 5) {
//			System.out.println("�Ҷ�");
//		}
//		else if (year % 12 == 6) {
//			System.out.println("����");
//		}
//		else if (year % 12 == 7) {
//			System.out.println("�䳢��");
//		}
//		else if (year % 12 == 8) {
//			System.out.println("���");
//		}
//		else if (year % 12 == 9) {
//			System.out.println("���");
//		}
//		else if (year % 12 == 10) {
//			System.out.println("����");
//		}
//		else if (year % 12 == 11) {
//			System.out.println("���");
//		}
//		else if (year % 12 == 0) {
//			System.out.println("�����̶�");
//		}
//		else if (year % 12 == 1) {
//			System.out.println("�߶�");
//		}
//		else if (year % 12 == 2) {
//			System.out.println("����");
//		}
//		else if (year % 12 == 3) {
//			System.out.println("������");
//		}
		
		//switch�� ��� /��� ��� ���� �ϳ� ��Ÿ�� ���� if������ ����.
		switch (year % 12) {
			case 0: 
				System.out.println("�����̶�");
				break;
			case 1:
				System.out.println("�߶�");
				break;
			case 2:
				System.out.println("��");
				break;
			default:
				System.out.println("�� ���� ��");
		}
		
		//���ڿ��� ����� switch��
		String s = "C";
		
		switch (s) {
			case "A": System.out.println("A�� �Է��߽��ϴ�."); break;
			case "B": System.out.println("B�� �Է��߽��ϴ�."); break;
			default: System.out.println("��Ÿ ����"); break; //���������� break ��������
		}
		

	}

}

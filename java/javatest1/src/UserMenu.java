/*
 [ ���α׷� ���� ]
 1. �Է�
 2. ���
 3. ����
 4. �˻�
 0. ����
 ����> 1
 
 �Է¸޴� �����߽��ϴ�.
 
  [ ���α׷� ���� ]
 1. �Է�
 2. ���
 3. ����
 4. �˻�
 0. ����
 ����> 5
 
���� ��ȣ�Դϴ�.

 [ ���α׷� ���� ]
 1. �Է�
 2. ���
 3. ����
 4. �˻�
 0. ����
 ����> 0
 ���α׷��� �����մϴ�.
 */
import java.util.Scanner;
public class UserMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while (true) {
			System.out.println("[ ���α׷� ���� ]");
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.println("0. ����");
			System.out.print("����> ");
			a = input.nextInt();
			
			if (a == 1) {
				System.out.println("�Է¸޴� �����߽��ϴ�.");
			}
			else if (a == 2) {
				System.out.println("��¸޴� �����߽��ϴ�.");
			}
			else if (a == 3) {
				System.out.println("�����޴� �����߽��ϴ�.");
			}
			else if (a == 4) {
				System.out.println("�˻��޴� �����߽��ϴ�.");
			}
			else if (a == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("���� ��ȣ�Դϴ�.");
			}
			System.out.println();
		}
		
		//������ �ڵ�
		//���� ����
		int menu;
		while (true) {
			//�޴� ���
			System.out.println("[ ���α׷� ���� ]");
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.println("0. ����");
			System.out.println("����> ");
			//��ȣ �Է¹���
			menu = input.nextInt();
			//�Է¹��� ��ȣ�� ���� ����
			switch (menu) {
			case 1:
				System.out.println("�Է� �޴� ����");
				break;
			
			case 2:
				System.out.println("��� �޴� ����");
				break;
		
			case 3:
				System.out.println("���� �޴� ����");
				break;
	
			case 4:
				System.out.println("�˻� �޴� ����");
				break;
			
			case 0: 	//0�� �Է��ߴٸ� ����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			
			default:
				System.out.println("���� ��ȣ�Դϴ�. �ٽ� �����ϼ���.");

			}
		}
		
		//���� 2���� ����� ������ if���� ���� �����ϴµ� �ð��� ���ɸ�/ if���� ������ ������ if���� ����ǰ� else if�κ��� �ǳʶ�
//			if () {
//				
//			}
//			else if () {
//				
//			}
//			
//			if () {
//				
//			}
//			if () {
//				
//			}
//			
			
		

	}

}

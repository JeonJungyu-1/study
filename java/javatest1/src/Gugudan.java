//������
public class Gugudan {

	public static void main(String[] args) {
		//������ 1����
//		for (int i = 1; i < 10; i++) {
//			System.out.println(3 + " * " + i + " = " + (3 * i));
//		}
		
		//continue�� ����ȸ���� �ѱ�� ����ȸ���� �Ѿ, break�� ���� for���� ����, return�� ���α׷��� ����.
//		out:
//		for (int a = 1; a <= 9; a++) {
//			for (int b = 1; b <= 9; b++) {
//				if (b == 3) {
//					//break out; //��ø�� ��� ���� �� ����.
//					continue out;
//				}
//				System.out.println(a + " * " + b + " = " + (a * b));
//			}
//			System.out.println();
//		}
//		System.out.println("������ ��");
		
		//1
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
			System.out.println();
		}
		
		//2 ������ ���
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.print(b + "*" + a + "=" + (a * b) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//3 3�ܾ� ���
		for (int a = 1; a <= 7; a += 3) {
			for (int i = a; i <= a + 2; i++) {
				System.out.print(i + "��" + "\t\t");	
			}
			System.out.println();
			for (int b = 1; b <= 9; b++) {
				for (int c = a; c <= a + 2; c++) {
					System.out.print(c + " * " + b + " = " + (c * b) + "\t");	
				}
				System.out.println();
			}
			System.out.println();
		}
			//������ �ڵ�
			for (int a = 1; a < 9; a += 3) {
				for (int b = 1; b <= 9; b++) {
					for (int c = a; c < a + 3; c++) {
						System.out.print(c + "*" + b + "=" + (c * b) + "\t");
					}
					System.out.println();
				}
				System.out.println();
			}

	}
}

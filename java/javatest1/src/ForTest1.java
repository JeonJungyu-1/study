//�ݺ��� - for�� ����
public class ForTest1 {

	public static void main(String[] args) {

//		//1   i�� ������������ ��.
//		for (int i = 0 ; i < 5 ; i++) {
//			System.out.println("�������");
//		}

		// 0 1 2 3 4
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 2 3 4 5
		for (int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 0 2 4 6 8
		for (int i = 0; i < 9; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 3 5 7 9
		for (int i = 1; i < 10; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 10 20 30 40 50 60 70 80 90 100
		for (int i = 10; i < 101; i=i+10) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 5 4 3 2 1 
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 10 100 1000 10000
		for (int i = 1; i < 10001; i=i*10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 2 4 5 7 8 10 11 13 14
		for (int i = 1; i < 15; i++) {
			System.out.print(i + " ");
			if (i % 3==2) {
				i++;
			}
		}
		System.out.println();
			//������ �ڵ�
			for (int i = 1; i < 15; i++) {
				if(i % 3 != 0) {
				System.out.print(i + " ");
				}
			}
			System.out.println();
		
		// 1~100�߿� 4�� ����̸鼭 5�� ����� �ƴѰ� (4, 8, 12, 16, 24..)
		for (int i = 4; i < 101; i=i+4) {
			if(i % 5 != 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
			//������ �ڵ�
			for (int i = 0; i <= 100; i++) {
				if(i % 4 == 0 && i % 5 != 0) {
				System.out.print(i + " ");
				}
			}
			System.out.println();
		
		// 1~100�߿� 7�Ǵ� 9�� ����� �� (7, 9, 14, 18...)
		for (int i = 1; i < 101; i++) {
			if(i % 7 == 0 || i % 9 == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
	
		//100�� ��� ã�� (2, 4, 5...)
		for (int i = 2; i < 101; i++) {
			if(100 % i == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//for���� �����ϴ� �����
		for (int i = 1;i <= 100; i++) {
			if (i % 10 == 0) {
				//continue;					//�̹� �ݺ��� �ǳʶ� / �ٷ� i++�� �̵�
				//break;					//�ݺ� ���� / �� �ݺ����� �����ϰ� ������ ����
				//return;					//�޼ҵ� ����
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("���α׷��� ��");
	}

}

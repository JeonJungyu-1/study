//�հ� ���ϱ�
public class ForTest2 {

	public static void main(String[] args) {
		// 1~10������ �հ�
		int s = 0;
		for(int i = 1; i <= 10; i++) { 
			s = s + i;
		}
		System.out.println(s);
		
		// 1~100������ �հ�
		s = 0;
		for(int i = 1; i <= 100; i++) { 
			s = s + i;
		}
		System.out.println(s);
		
		//1~100�� ¦���� �հ�
		s = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
			s = s + i;
			}
		}
			//������ �ڵ�
			s = 0;
			for(int i = 2; i <= 100; i+=2) { 
				s = s + i;
			}
		System.out.println(s);
		
		//1~100�� 3�� ����� �հ�
		s = 0;
		for(int i = 1; i <= 100; i++) { 
			if (i % 3 == 0) {
			s = s + i;
			}
		}
		System.out.println(s);
		
		//1���� �������� �հ�. �հ谡 4000�� �Ѿ�� ������ ������ �հ����
		s = 0;
		int i;
		for(i = 1; s <= 4000; i++) {
			s = s + i;
		}
		System.out.println("���� : " + i + ", �հ� : " + s);
			//������ �ڵ�
			for (i = 1; ; i++ ) {
				s = s + i;
				if(s > 4000) {
					break;
				}
			}
		
	}

}

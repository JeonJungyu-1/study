//while, do~while��
public class WhileTest1 {

	public static void main(String[] args) {
		int s, n;
		
		//for�� ���
		s = 0;
		for (n = 1; n < 11; n++) {
			s = s + n;
		}
		System.out.println("�հ�:" + s);
		
		
		//while�� ���
		s = 0;
		n = 1;
		while (n < 11) {
			s = s + n;
			n++; 
		}
		System.out.println("�հ�:" + s);
		
		//do~while�� ��� / �ѹ��� ������
		s = 0;
		n = 1;
		do {
			s = s + n;
			n++;
		} while (n < 11);
		System.out.println("�հ�:" + s);
	}

}

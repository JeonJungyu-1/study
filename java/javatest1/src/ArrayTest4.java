
public class ArrayTest4 {

	public static void main(String[] args) {
		
//		//�� ��°��� ����
//		char ch = 'A';
//		System.out.println('A');
//		System.out.println(ch);
//		//int�� ���� ����ȯ�ؼ� �����ڵ� �� Ȯ��
//		System.out.println((int)ch + 2);
		
		char ch[] = {'G', 'E', 'X', 'B', 'A'};
		//������ �迭�� ��쿡�� ��ü������ �������
		System.out.println(ch);	//GEXBA
		System.out.println((int)ch[0]);
		System.out.println((int)'g');
		//��� ���ڸ� �ҹ��ڷ� ����
		for (int i = 0; i < ch.length; i++) {
			ch[i] += 32;
		}
		System.out.println(ch);	//gexba
		
		//������ �ڵ�
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)(ch[i] + 32);
		}
		
		
		
		byte a = 0;
		int b = 0;
		//byte, short, char�� ���ÿ� �׻� int�� �ٲ�/int�� long���� ������ long������ �ٲ�
		//a = a + 1;
		//����� ������ ������� �ణ �ٸ�/���ǽİ� �Ʒ��� 2���� ������
		a++;
		a += 1;
	}

}

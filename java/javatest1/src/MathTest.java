
public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(9));//������
		System.out.println(Math.pow(2, 10));//ù��° ���ڸ� �ι�° ���ڸ�ŭ ���ϱ�(2^10)
		
		System.out.println(Math.ceil(3.1));//�Ҽ��� �Ʒ� �ø�
		System.out.println(Math.floor(3.1));//�Ҽ��� �Ʒ� ����
		System.out.println(Math.round(3.1));//�Ҽ��� �Ʒ� �ݿø�
		
		System.out.println(Math.max(1, 2));//ū ��
		System.out.println(Math.min(1, 2));//���� ��
		
		//0�̻� 1�̸�
		System.out.println(Math.random());
		//0 ~ 9
		System.out.println((int)(Math.random() * 10));
		//1 ~ 10
		System.out.println((int)(Math.random() * 10) + 1);
		
		
		//0 ~ 100
		int score[] = new int[100];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 101);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

		System.out.println(Math.random());
	}

}

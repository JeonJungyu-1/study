
public class RandomTest {

	public static void main(String[] args) {
		int num[] = new int[6];
		int n;
		//6���� 1~45������ ���� ����
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			//�ߺ� Ȯ��
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		
		//������ �ڵ�
		//6���� 1~45������ ���� ����
		out:
		for(int i = 0; i < num.length; i++) {
			n = (int)(Math.random() * 45 + 1);
			//�ߺ� Ȯ��
			for(int j = 0; j < i; j++) {
				if (num[j] == n) {
					i--;
					continue out;
				}
			}
			num[i] = n;
		}
		
		//��� ���
		System.out.print("[ ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println(" ]");
	}

}

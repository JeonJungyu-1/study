//�迭�� ����� ���� �߿��� �ִ밪 ���ϱ�
public class ArrayTest3 {

	public static void main(String[] args) {
		int ar[] = { 3,5,8,23,5,20,2,1,10,2 };
		int max = 0;
		
		
		max = ar[0];
		for (int i = 0; i < ar.length-1; i++ ) {
			if (max < ar[i+1]) {
				max = ar[i+1];
			}
		}
		System.out.println("�ִ밪:" + max);
		
		//������ �ڵ�
		//ù��° ��Ҹ� �ִ밪���� �ϴ� ����
		max = ar[0];
		//������ ���ڵ�� ��� �ѹ��� ���Ͽ� �� ū���� ������ max�� ����
		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
	}

}

//�迭 ����
public class ArrayTest1 {

	public static void main(String[] args) {
		int x;
		int a[];
		a = new int[5];  //�迭�� ����� �ڵ����� 0���� ä����.
		//int a[] = new int[5];
		
		x = 99;
		//a = 99;
		a[0] = 99;
		//a -> ��������, ���۷��� ����.
		//a[0] 0�κ� -> ÷��, �ε���
		a[1] = 88;
		a[2] = 77;
		a[3] = 66;
		a[4] = 55;
		//a[5] = 44; �迭 ���� ���
		
		System.out.println(x);
		System.out.println(a); //java������ ���������� �ּ�(���� ������)�� �������� ����/�޸𸮿� �ִ� ��ü���� �����ϱ� ���� ��ȣ ������ ���� ��

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");	
		}
		System.out.println();
		
		double b[] = new double[3]; //b ��ü�� ũ��� a�� ������. �迭 ��ĭ�� ũ�Ⱑ double�� �Ǵ°���.
		b[0] = 1.5;
		b[1] = 3.0;
		b[2] = 4.1;
		
		double c[] = {1.5, 3.0, 4.1}; //ó�� ������ �� �ѹ��� ��밡����.
		
		char d[] = {'A', 'N', 'E', 'Q'};
		
		String e[] = {"aaa", "bbb", "ccc"};
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");	
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");	
		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");	
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");	
		}
		System.out.println();
		
		//Type mismatch: cannot convert from double to int
		
		
		int score[] = { 100, 90, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + (sum / score.length));
		
	}

}

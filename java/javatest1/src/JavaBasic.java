//Java�� ������ �ڷ��� ����
public class JavaBasic {

	public static void main(String[] args) {
		//Java�� �����̸� �ۼ�  ������� �޼ҵ� ���� �ҹ��ڷ� �����ϰ� Ŭ�������� �빮�ڷ� �����ϱ�
		int a1;
//		int number123;
//		int number_123;
//		int number$123;
//		int firstNumber;
//		//int 123number;  //���ڷ� �����ϸ� �ȵ�
//		//int double;     //Java Ű���� �ȵ�
//		//int number-123; //Ư������ �ȵ�
//		int sftujseirjgwoierjg; //���� ���� ������
		
		//Java�� �⺻�ڷ���
		byte a;
		short b;
		int c;
		long d;
		char e;
		float f;
		double g;
		boolean h;
		
		//a = 200;		//byte���� �ִ� ������ 127�� �Ѵ� ������ �ʱ�ȭ
		//b = 40000;	//short���� �ִ� ������ �Ѵ� ������ �ʱ�ȭ
		d = 10000000000l; //long�� ���(�ڿ� L����) /���ڴ� �⺻������ int�� ó���Ϸ��� ��/������ ���ڸ� �����ϱ� ���� �޸𸮿� �����ϴµ� �� ���°� ������ int����
		
		e = 'A';
		System.out.println(e);
		e = 100;
		System.out.println(e);
		e = '\n';
		System.out.println(e);
		e = 'A' + 3;
		System.out.println(e);
		System.out.println((int)e);
		
		System.out.println(1 + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1); //���ʸ� ���ڿ��̾ +�� ������ �̾���̱�
		
		System.out.println("1" + 2 + 3); //�Ʒ��ڵ�� ���� �����ϱ�
		System.out.println(2 + 3 + "1");
		
		f = 1.5f;  //double���� �⺻�̾ double���� float�� ������ ���� �� ����  �׷��� �ڿ� f ����.
		g = 1.5;
		g = 1.234e3; //1.234 ���ϱ� 10�� 3��
		
		h = true;		//true, false ���� �ϳ�
		//h = a * 2 > 200;
		
		//int�� ������
		c = 10/3;
		System.out.println(c);
		//double�� ������
		g = 10.0 / 3.0;
		System.out.println(g);
		
		System.out.println((int)'��');
		
	}
}

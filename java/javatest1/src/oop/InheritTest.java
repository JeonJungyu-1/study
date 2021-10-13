package oop;

public class InheritTest {

	public static void main(String[] args) {
		A ob1 = new A();
		A ob2 = new A(100);
		System.out.print(ob1.getX() + ", ");
		ob1.print();
		System.out.print(ob2.getX() + ", ");
		ob2.print();

		
		B ob3 = new B();
		System.out.println(ob3.getY());
		ob3.print();
		ob3.setX(10);
		System.out.println(ob3.getX());
		
		B ob4 = new B(1,2);
		System.out.println(ob4.getX());
		System.out.println(ob4.getY());
		ob4.print();
		
//		C ob5 = new C();
//		ob5.setTitle("â ����");
//		ob5.setBounds(300, 200, 400, 300);
//		ob5.setVisible(true);
		
		A ob = new B(); //������ / ������ Ÿ���� ������ ������/ B���� �����߰��� �κ��� ����ȯ ���̴� ������
						//�̷������δ� ������� �ʰ� �ǾƷ��� �κп� �ִ°�ó�� �����.
		ob.print();
		((B)ob).getY();
		
		Student s = new Student("ȫ�浿", 100, 90, 80);
		System.out.println(s.toString());
		Student s2 = new Student("ȫ�浿", 100, 90, 80);
		System.out.println(s2.toString());
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		
		
		System.out.println(ob2);	// x = 100
		System.out.println(ob4);	// x = 1, y = 2
		
		A x = new A();
		B y = new B();
		test(x);
		test(y);
		
	}
	//AŸ���� ������ B��ü�� ����Ŵ
	public static void test(A ob) {
		ob.print();
	}
	public static void test(B ob) {
		ob.print();
	}

}

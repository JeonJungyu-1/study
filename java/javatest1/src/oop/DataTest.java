package oop;

public class DataTest {

	public static void main(String[] args) {
		//��� Ŭ������ ������ ���۷��� ����
		Data a = new Data(); //name,phone,age,email�� ���� ������ ������ getname(),print()�� ����� ���� ��ü ����
		Data b = new Data();
		
		//private���� ���� ��ȣ�ϴ� ������ age�� ���� ������ ���� �߸��� �����Ͱ� ������ ��� ���� ����������./�б⸸ �ϰ� �������� ���� �� ����
//		a.name = "ȫ�浿";
//		a.phone = "010-2222-3333";
//		a.age = 20;
//		a.email = "aaa@aaa.com";
		
		a.setAge(20);
		System.out.println(a.getAge());
		
		a.print();
		
		b.print();
	}

}

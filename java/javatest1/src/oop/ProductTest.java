package oop;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Product p1 = new Product();
		Product p2 = new Product("A01", "���콺", 1000);
		Product p3 = new Product("A02", "Ű����", 2000);
		
		p1.setCode("B01");
		p1.setName("��Ʈ��");
		p1.setPrice(10000);
		System.out.println(p1); //�ڵ�:B01 ��ǰ��:��Ʈ�� ����:10000
		System.out.println(p2);
		System.out.println(p3);

		//����ڷκ��� �ڵ�, ��ǰ��, ���� �Է¹޾� Product ��ü ����
		
		//1
//		Product p4;
//		System.out.print("�ڵ� �Է�:");
//		String code = input.next();
//		System.out.print("��ǰ�� �Է�:");
//		String name = input.next(); li
//		System.out.print("���� �Է�:");
//		int price = input.nextInt();
//		p4 = new Product(code, name, price);
//		System.out.println(p4);
		
		//2
		Product p4 = new Product();
		System.out.print("�ڵ� �Է�:");
		p4.setCode(input.next());
		System.out.print("��ǰ�� �Է�:");
		p4.setName(input.next());
		System.out.print("���� �Է�:");
		p4.setPrice(input.nextInt());
		System.out.println(p4);
		
		System.out.println(p2 == p4);
		System.out.println(p2.equals(p4));
		
		System.out.println(Math.PI);		//static ����(Ŭ���� ����)/��� ��ü ����
		System.out.println(Math.random());	//static �޼ҵ�(Ŭ���� �޼ҵ�)/��ü�� ������� ���
	}

}

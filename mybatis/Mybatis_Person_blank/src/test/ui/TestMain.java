package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		Person pe;
		
		//�Է�
//		pe = new Person("��ö��", 30);
//		dao.insertPerson(pe);
	
		
		//����ڿ��� ������ ��ȣ�� �Է¹޾� �ش� ��ȣ�� ȸ���� ����
		Scanner scan = new Scanner(System.in);
//		System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
//		int n = scan.nextInt();
//		int cnt = dao.deletePerson(n);
//		
//		if (cnt == 0) {
//			System.out.println("�ش� ��ȣ�� ȸ���� �����ϴ�.");
//		}
//		else {
//			System.out.println("�����Ǿ����ϴ�.");
//		}
	
		
		//��ȣ, �̸�, ���̸� �����ؼ� �ش��ȣ ȸ���� �̸��� ���̸� ����
//		Person p = new Person(5, "�ּ���", 22);
//		int cnt = dao.updatePerson(p);
//		
//		if (cnt == 0) {
//			System.out.println("�ش� ��ȣ�� ȸ���� �����ϴ�.");
//		}
//		else {
//			System.out.println("�����Ǿ����ϴ�.");
//		}
		
		
		//��ü ���
//		ArrayList<Person> list = dao.selectAll();
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		System.out.println("��ȣ\t�̸�\t����");
//		System.out.println("=========================");
//		for(int i = 0; i < list.size(); i++) {
//			Person p = list.get(i);
//			System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
//		}
		
		
		//1�� ���
//		int num = 0;
//		System.out.println("����� ��ȣ�� �Է��ϼ���");
//		num = scan.nextInt();
//		Person p = dao.selectOne(5);
//		
//		if (p != null) {
//			System.out.println("��ȣ\t�̸�\t����");
//			System.out.println("=========================");
//			System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
//		}
//		else {
//			System.out.println("�ش�Ǵ� ��ȣ�� �����ϴ�.");
//		}
		
		//�̸����� �˻� (��Ȯ�� ��ġ�ϴ� �̸�)
//		ArrayList<Person> list = dao.selectName("��");
//		if (list == null || list.size() == 0) {
//			System.out.println(list);
//			System.out.println("���� �̸��� ȸ���� �����ϴ�.");
//		}
//		else {
//			System.out.println("��ȣ\t�̸�\t����");
//			System.out.println("=========================");
//			for(int i = 0; i < list.size(); i++) {
//				Person p = list.get(i);
//				System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
//			}
//			System.out.println("��" + list.size() + "��");
//		}
		
		//�̸� �κ� �˻�
		ArrayList<Person> list = dao.selectName2("ȫ");
		
		if (list == null || list.size() == 0) {
			System.out.println("���� �̸��� ȸ���� �����ϴ�.");
		}
		else {
			System.out.println("��ȣ\t�̸�\t����");
			System.out.println("=========================");
			for(int i = 0; i < list.size(); i++) {
				Person p = list.get(i);
				System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
			}
			System.out.println("��" + list.size() + "��");
		}
	}
}

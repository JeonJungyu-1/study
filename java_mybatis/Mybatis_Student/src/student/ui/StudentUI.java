package student.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import student.dao.StudentDAO;
import student.vo.StudentVO;

//����� ȭ��
public class StudentUI {
	private StudentDAO dao = new StudentDAO();
	private Scanner keyin = new Scanner(System.in);
	
	public StudentUI() {
		while (true) {
			menuPrint();				//�޴� ���
			int m = keyin.nextInt();	//��ȣ �Է¹���
			switch(m) {					//�� ��ȣ�� ���� ó��, 0�� ���� ����
			case 1: input();	break;
			case 2: list();		break;
			case 3: delete();	break;
			case 4: update();	break;
			case 5: search();	break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			}
		}
	}
	
	void menuPrint() {
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1.	�Է�");
		System.out.println("2.	���");
		System.out.println("3.	����");
		System.out.println("4.	����");
		System.out.println("5.	�˻�");
		System.out.println("0.	����");
		System.out.print("����>	");
	}
	
	//�Է�
	public void input() {
		String id, name;
		int kor, eng, mat, cnt;
		System.out.println("[ �Է� ]");
		System.out.print("�й� : ");
		id = keyin.next();
		System.out.print("�̸� : ");
		name = keyin.next();
		System.out.print("�������� : ");
		kor = keyin.nextInt();
		System.out.print("�������� : ");
		eng = keyin.nextInt();
		System.out.print("�������� : ");
		mat = keyin.nextInt();
		
		StudentVO vo = new StudentVO(id, name, kor, eng, mat);
		cnt = dao.insert(vo);
		
		if( cnt == 0) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("����Ǿ����ϴ�");
		}
	}
	
	//��ü���
	public void list() {
		listMenu();				
		int m = keyin.nextInt();	
		switch(m) {				
		case 1: listBasic();	break;
		case 2: listScore();		break;
		case 3: listName();	break;
		case 4: listId(); break;
		case 0: System.out.println("����� �����մϴ�."); return;
		}
	}
	
	//��� �޴�
	public void listMenu() {
		System.out.println("[ ��� ]");
		System.out.println("1.	��ü ���");
		System.out.println("2.	������ ���������� ���");
		System.out.println("3.	�̸������� ���");
		System.out.println("4. 	�й������� ���");
		System.out.println("0.	��� ����");
		System.out.print("����>	");
	}
	//��ü ���
	public void listBasic() {
		ArrayList<StudentVO> list = dao.selectAll();
		
		System.out.println("[ �л� ���� ]");
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	//���������� ���
	public void listScore() {
		System.out.print("������ ����Ͻðڽ��ϱ�? : ");
		int j = keyin.nextInt();
		ArrayList<StudentVO> list = dao.listScore(j);
		
		System.out.println("[ �л� ���� ]");
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	
		
	//�̸������� ���
	public void listName() {
		ArrayList<StudentVO> list = dao.listName();
		
		System.out.println("[ �л� ���� ]");
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	//�й������� ���
	public void listId() {
		ArrayList<StudentVO> list = dao.listId();
		
		System.out.println("[ �л� ���� ]");
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	
	
	//����
	public void delete() {
		String id;
		int cnt = 0;
		//�й����� ����
		System.out.println("[ ���� ]");
		System.out.print("������ �л��� �й� : ");
		id = keyin.next();
		cnt = dao.delete(id);
		if( cnt == 0) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("�����Ǿ����ϴ�");
		}
	}
	
	//����
	public void update() {
		String id, name;
		int kor, eng, mat, cnt = 0;
		//�й����� ����
		System.out.println("[ ���� ]");
		System.out.print("������ �л��� �й� : ");
		keyin.nextLine();
		id = keyin.next();
		
		//�ش� �й��� �ִ��� ���� �˻�
		StudentVO v = dao.searchId(id);
		if (v == null) {
			System.out.println("�ش� �й��� �л��� �����ϴ�.");
			return;
		}
		
		System.out.print("�̸� : ");
		name = keyin.next();
		System.out.print("�������� : ");
		kor = keyin.nextInt();
		System.out.print("�������� : ");
		eng = keyin.nextInt();
		System.out.print("�������� : ");
		mat = keyin.nextInt();
		StudentVO vo = new StudentVO(id, name, kor, eng, mat);
		cnt = dao.update(vo);
		if (cnt == 0) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("�����Ǿ����ϴ�");
		}
		
	}
	
	//�˻�
	public void search() {
		searchMenu();				
		int m = keyin.nextInt();	
		switch(m) {				
		case 1: searchName();	break;
		case 2: searchId();		break;
		case 3: searchScore();	break;
		case 4: searchScore2(); break;
		case 5: searchScore3(); break;
		case 0: System.out.println("�˻��� �����մϴ�."); return;
		}
	}
	
	//�˻� �޴�
	public void searchMenu() {
		System.out.println("[ �˻� ]");
		System.out.println("1.	�̸����� �˻�");
		System.out.println("2.	�й����� �˻�");
		System.out.println("3.	����� �Է��� �������� ���� ��� �˻�");
		System.out.println("4. 	����� 2���� �� ���̿� �ִ� ��� �˻�");
		System.out.println("5. 	����� 2���� �� ���̿� �ִ� ��� �˻�(�ణ �ٸ� ������� �ڵ�)");
		System.out.println("0.	�˻� ����");
		System.out.print("����>	");
	}
	
	//�̸����� �˻�
	public void searchName() {
		String name;
		System.out.println("[ �̸����� �˻� ]");
		System.out.print("�˻��� �̸� : ");
		keyin.nextLine();
		name = keyin.next();
		ArrayList<StudentVO> list = dao.searchName(name);

		if (list == null || list.size() == 0) {
			System.out.println("�ش� �̸��� �л��� �����ϴ�.");
			return;
		}
		
		
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	//�й����� �˻�
	public void searchId() {
		String id;
		System.out.println("[ �й����� �˻� ]");
		System.out.print("�˻��� �й� : ");
		keyin.nextLine();
		id = keyin.next();
		StudentVO vo = dao.searchId(id);

		if (vo == null) {
			System.out.println("�ش� �й��� �л��� �����ϴ�.");
			return;
		}
		
		System.out.println("��ȣ\t�̸�\t����\t����\t����");
		System.out.println("======================================");
		System.out.println(vo.getId() + "\t" + vo.getName() + "\t" + vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMat());
		
	}
	
	//�Է��� �������� ���� ����� ���� ��� �˻�
	public void searchScore() {
		double avg;
		System.out.println("[ ��������� �˻� ]");
		System.out.print("������� : ");
		keyin.nextLine();
		avg = keyin.nextDouble();
		ArrayList<StudentVO> list = dao.searchScore(avg);

		System.out.println("��ȣ\t�̸�\t�������");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAvg());
		}
	}
	
	//��������� 2�� �� ���̿� �ִ� ��� �˻�
	public void searchScore2() {
		double avg1, avg2;
		System.out.println("[ 2���� ��������� �˻� ]");
		System.out.print("�ּ� ���� : ");
		keyin.nextLine();
		avg1 = keyin.nextDouble();
		System.out.print("�ִ� ���� : ");
		keyin.nextLine();
		avg2 = keyin.nextDouble();
		
		HashMap<String, Double> avg = new HashMap<>();
		avg.put("avg1", avg1);
		avg.put("avg2", avg2);
		
		
		ArrayList<StudentVO> list = dao.searchScore2(avg);

		System.out.println("��ȣ\t�̸�\t�������");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAvg());
		}
	}
	
	//��������� 2�� �� ���̿� �ִ� ��� �˻�//������ ��� �ణ �ٸ�
		public void searchScore3() {
			int min, max;
			System.out.println("[ 2���� ��������� �˻� ]");
			System.out.print("�ּ� ���� : ");
			keyin.nextLine();
			min = keyin.nextInt();
			System.out.print("�ִ� ���� : ");
			keyin.nextLine();
			max = keyin.nextInt();
			
			HashMap<String, Integer> avg = new HashMap<>();
			avg.put("min", min);
			avg.put("max", max);
			
			
			ArrayList<StudentVO> list = dao.searchScore3(min, max);

			System.out.println("��ȣ\t�̸�\t�������");
			System.out.println("======================================");
			for(int i = 0; i < list.size(); i++) {
				StudentVO s = list.get(i);
				System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAvg());
			}
		}
	
	
	

}

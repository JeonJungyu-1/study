package student.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import student.manager.MinusException;
import student.manager.OverException;
import student.manager.StudentManager;
import student.vo.StudentVO;


public class StudentUI {
	Scanner keyin = new Scanner(System.in);
	StudentManager manager = new StudentManager();

	public StudentUI() {
		while (true) {
			printMenu();
			int a = 0;
			try {
				a = keyin.nextInt();
			} catch(InputMismatchException e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			switch (a) {
			case 1: insert(); break;
			case 2: delete(); break;
			case 3: update(); break;
			case 4: search(); break;
			case 5: all(); break;
			case 0: return;
			default : System.out.println("�ٽ� �Է��ϼ���.");
			
			}
			
		}
	}
		
		void printMenu() {
			System.out.println("[ �л� �������� ���α׷� ]");
			System.out.println("1.	���ο� �л� ���");
			System.out.println("2.	����");
			System.out.println("3.	����");
			System.out.println("4.	�˻�");
			System.out.println("5.	��ü����");
			System.out.println("0.	����");
			System.out.print("����>	");
		}
		
		
		void insert() {
			System.out.println("[���ο� �л� ���]");
			String name;
			int num, kor, eng, mat;
			
			while (true) {
				System.out.print("�й� �Է�:");
				try {
					num = keyin.nextInt();
					break;
				} catch (InputMismatchException e) {
					keyin.nextLine();
					System.out.println("�ٽ� �Է��ϼ���.");
				}
			}
			
			System.out.print("�̸� �Է�:");
			keyin.nextLine();
			name = keyin.nextLine();
			while (true) {
				System.out.print("���� ���� �Է�:");
				try {
					kor = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				} catch (InputMismatchException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			
			
			while (true) {
				System.out.print("���� ���� �Է�:");
				try {
					eng = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				} catch (InputMismatchException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			
			while (true) {
				System.out.print("���� ���� �Է�:");
				try {
					mat = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				} catch (InputMismatchException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			
			StudentVO vo = new StudentVO(num, name, kor, eng, mat);
			
			if (!manager.add(vo)) {
				System.out.println("�̹� ��ϵ� �й��Դϴ�.");
			}
		}
		
		void delete() {
			System.out.println("[ �л����� ���� ]");
			int num;
			while (true) {
				System.out.print("������ �л������� �й�:");
				try {
					num = keyin.nextInt();
					break;
				} catch (InputMismatchException e) {
					keyin.nextLine();
					System.out.println("�ٽ� �Է��ϼ���.");
				}
			}
			
			if (manager.remove(num)) {
				System.out.println("�����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�ش�Ǵ� �й��� �����ϴ�.");
			}
		}
		void update() {
			System.out.println("[ �л����� ���� ]");
			String name;
			int num, kor, eng, mat;
			
			while (true) {
				System.out.print("������ �й� �Է�:");
				try {
					num = keyin.nextInt();
					break;
				} catch (InputMismatchException e) {
					keyin.nextLine();
					System.out.println("�ٽ� �Է��ϼ���.");
				}
			}
			
			System.out.print("�̸� �Է�:");
			keyin.nextLine();
			name = keyin.nextLine();
			while (true) {
				System.out.print("���� ���� �Է�:");
				try {
					kor = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				} catch (InputMismatchException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			
			
			while (true) {
				System.out.print("���� ���� �Է�:");
				try {
					eng = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				} catch (InputMismatchException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			
			while (true) {
				System.out.print("���� ���� �Է�:");
				try {
					mat = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				} catch (InputMismatchException e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
			}
			StudentVO vo = new StudentVO(num, name, kor, eng, mat);
			if (manager.update(vo)) {
				System.out.println("�����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�ش� �й��� �л��� �����ϴ�.");
			}
			
		}
		void search() {
			a:
			while (true) {
				int m = 0;

				System.out.println("[ �˻� ]");
				System.out.println("1.	�Է��� ����������� ���� �л� ���");
				System.out.println("2.	1���� �л� �̸�");
				System.out.println("0.	�������� ���ư���");
				System.out.print("����>	");
				try {
					m = keyin.nextInt();
				} catch(InputMismatchException e) {
					keyin.nextLine();
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}
				switch (m) {
				case 1: avg(); break a;
				case 2: fp(); break a;
				case 0: break a;
				default: System.out.println("�ٽ� �Է��ϼ���."); continue a;
				}
			}
			
			
		}
		
		void avg() {
			System.out.print("�˻��� ������� : ");
			int avg = keyin.nextInt();
			ArrayList<StudentVO> list = manager.search(avg);
			//���Ϲ��� ����Ʈ ���
			StudentVO vo = null;
			if (list.size() != 0) {
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","�й�","�̸�","����","����","����","���");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("�˻������ �����ϴ�.");
			}
		}
		
		void fp() {
			ArrayList<StudentVO> list = manager.getSortList();
			if (list.size() != 0) {
				StudentVO vo = list.get(0);
				System.out.println("\t1��");
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","�й�","�̸�","����","����","����","���");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("�˻������ �����ϴ�.");
			}
			
		}
		
		void all() {
			a:
				while (true) {
					int m = 0;

					System.out.println("[ ��ü���� ]");
					System.out.println("1.	��ϼ� ����");
					System.out.println("2.	������ ����");
					System.out.println("0.	�������� ���ư���");
					System.out.print("����>	");
					try {
						m = keyin.nextInt();
					} catch(InputMismatchException e) {
						keyin.nextLine();
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}
					switch (m) {
					case 1: allRegi(); break a;
					case 2: allGrade(); break a;
					case 3: break a;
					default: System.out.println("�ٽ� �Է��ϼ���."); continue a;
					}
				}
		}
			
		void allRegi() {	
			ArrayList<StudentVO> list = manager.getList();
			
			StudentVO vo = null;
			if (list.size() != 0) {
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","�й�","�̸�","����","����","����","���");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("�˻������ �����ϴ�.");
			}
			
		}
		
		void allGrade() {
			ArrayList<StudentVO> list = manager.getSortList();
			
			StudentVO vo = null;
			if (list.size() != 0) {
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","�й�","�̸�","����","����","����","���");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("�˻������ �����ϴ�.");
			}
			
		}
		
		

}

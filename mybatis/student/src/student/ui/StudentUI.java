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
				System.out.println("다시 입력하세요.");
				continue;
			}
			switch (a) {
			case 1: insert(); break;
			case 2: delete(); break;
			case 3: update(); break;
			case 4: search(); break;
			case 5: all(); break;
			case 0: return;
			default : System.out.println("다시 입력하세요.");
			
			}
			
		}
	}
		
		void printMenu() {
			System.out.println("[ 학생 성적관리 프로그램 ]");
			System.out.println("1.	새로운 학생 등록");
			System.out.println("2.	삭제");
			System.out.println("3.	수정");
			System.out.println("4.	검색");
			System.out.println("5.	전체보기");
			System.out.println("0.	종료");
			System.out.print("선택>	");
		}
		
		
		void insert() {
			System.out.println("[새로운 학생 등록]");
			String name;
			int num, kor, eng, mat;
			
			while (true) {
				System.out.print("학번 입력:");
				try {
					num = keyin.nextInt();
					break;
				} catch (InputMismatchException e) {
					keyin.nextLine();
					System.out.println("다시 입력하세요.");
				}
			}
			
			System.out.print("이름 입력:");
			keyin.nextLine();
			name = keyin.nextLine();
			while (true) {
				System.out.print("국어 점수 입력:");
				try {
					kor = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("다시 입력하세요");
				} catch (InputMismatchException e) {
					System.out.println("다시 입력하세요");
				}
			}
			
			
			while (true) {
				System.out.print("영어 점수 입력:");
				try {
					eng = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("다시 입력하세요");
				} catch (InputMismatchException e) {
					System.out.println("다시 입력하세요");
				}
			}
			
			while (true) {
				System.out.print("수학 점수 입력:");
				try {
					mat = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("다시 입력하세요");
				} catch (InputMismatchException e) {
					System.out.println("다시 입력하세요");
				}
			}
			
			StudentVO vo = new StudentVO(num, name, kor, eng, mat);
			
			if (!manager.add(vo)) {
				System.out.println("이미 등록된 학번입니다.");
			}
		}
		
		void delete() {
			System.out.println("[ 학생정보 삭제 ]");
			int num;
			while (true) {
				System.out.print("삭제할 학생정보의 학번:");
				try {
					num = keyin.nextInt();
					break;
				} catch (InputMismatchException e) {
					keyin.nextLine();
					System.out.println("다시 입력하세요.");
				}
			}
			
			if (manager.remove(num)) {
				System.out.println("삭제되었습니다.");
			}
			else {
				System.out.println("해당되는 학번이 없습니다.");
			}
		}
		void update() {
			System.out.println("[ 학생정보 수정 ]");
			String name;
			int num, kor, eng, mat;
			
			while (true) {
				System.out.print("수정할 학번 입력:");
				try {
					num = keyin.nextInt();
					break;
				} catch (InputMismatchException e) {
					keyin.nextLine();
					System.out.println("다시 입력하세요.");
				}
			}
			
			System.out.print("이름 입력:");
			keyin.nextLine();
			name = keyin.nextLine();
			while (true) {
				System.out.print("국어 점수 입력:");
				try {
					kor = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("다시 입력하세요");
				} catch (InputMismatchException e) {
					System.out.println("다시 입력하세요");
				}
			}
			
			
			while (true) {
				System.out.print("영어 점수 입력:");
				try {
					eng = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("다시 입력하세요");
				} catch (InputMismatchException e) {
					System.out.println("다시 입력하세요");
				}
			}
			
			while (true) {
				System.out.print("수학 점수 입력:");
				try {
					mat = StudentManager.inputScore();
					break;
				} catch (MinusException | OverException e) {
					System.out.println("다시 입력하세요");
				} catch (InputMismatchException e) {
					System.out.println("다시 입력하세요");
				}
			}
			StudentVO vo = new StudentVO(num, name, kor, eng, mat);
			if (manager.update(vo)) {
				System.out.println("수정되었습니다.");
			}
			else {
				System.out.println("해당 학번의 학생이 없습니다.");
			}
			
		}
		void search() {
			a:
			while (true) {
				int m = 0;

				System.out.println("[ 검색 ]");
				System.out.println("1.	입력한 평균점수보다 높은 학생 명단");
				System.out.println("2.	1등인 학생 이름");
				System.out.println("0.	메인으로 돌아가기");
				System.out.print("선택>	");
				try {
					m = keyin.nextInt();
				} catch(InputMismatchException e) {
					keyin.nextLine();
					System.out.println("다시 입력하세요.");
					continue;
				}
				switch (m) {
				case 1: avg(); break a;
				case 2: fp(); break a;
				case 0: break a;
				default: System.out.println("다시 입력하세요."); continue a;
				}
			}
			
			
		}
		
		void avg() {
			System.out.print("검색할 평균점수 : ");
			int avg = keyin.nextInt();
			ArrayList<StudentVO> list = manager.search(avg);
			//리턴받은 리스트 출력
			StudentVO vo = null;
			if (list.size() != 0) {
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","학번","이름","국어","영어","수학","평균");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("검색결과가 없습니다.");
			}
		}
		
		void fp() {
			ArrayList<StudentVO> list = manager.getSortList();
			if (list.size() != 0) {
				StudentVO vo = list.get(0);
				System.out.println("\t1등");
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","학번","이름","국어","영어","수학","평균");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("검색결과가 없습니다.");
			}
			
		}
		
		void all() {
			a:
				while (true) {
					int m = 0;

					System.out.println("[ 전체보기 ]");
					System.out.println("1.	등록순 보기");
					System.out.println("2.	성적순 보기");
					System.out.println("0.	메인으로 돌아가기");
					System.out.print("선택>	");
					try {
						m = keyin.nextInt();
					} catch(InputMismatchException e) {
						keyin.nextLine();
						System.out.println("다시 입력하세요.");
						continue;
					}
					switch (m) {
					case 1: allRegi(); break a;
					case 2: allGrade(); break a;
					case 3: break a;
					default: System.out.println("다시 입력하세요."); continue a;
					}
				}
		}
			
		void allRegi() {	
			ArrayList<StudentVO> list = manager.getList();
			
			StudentVO vo = null;
			if (list.size() != 0) {
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","학번","이름","국어","영어","수학","평균");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("검색결과가 없습니다.");
			}
			
		}
		
		void allGrade() {
			ArrayList<StudentVO> list = manager.getSortList();
			
			StudentVO vo = null;
			if (list.size() != 0) {
				System.out.printf("%-10s \t %-7s \t %-4s \t %-4s \t %-4s \t %-4s\n","학번","이름","국어","영어","수학","평균");
				for (int i = 0; i < list.size(); i++ ) {
					vo = list.get(i);
					System.out.printf("%-10d \t %-5s \t %-4d \t %-4d \t %-4d \t %-4.2f\n",
							vo.getNum(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),((vo.getKor() + vo.getEng() + vo.getMat())/3.0));
				}
			}
			else {
				System.out.println("검색결과가 없습니다.");
			}
			
		}
		
		

}

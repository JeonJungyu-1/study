package student.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import student.dao.StudentDAO;
import student.vo.StudentVO;

//사용자 화면
public class StudentUI {
	private StudentDAO dao = new StudentDAO();
	private Scanner keyin = new Scanner(System.in);
	
	public StudentUI() {
		while (true) {
			menuPrint();				//메뉴 출력
			int m = keyin.nextInt();	//번호 입력받음
			switch(m) {					//고른 번호에 따라 처리, 0번 고르면 종료
			case 1: input();	break;
			case 2: list();		break;
			case 3: delete();	break;
			case 4: update();	break;
			case 5: search();	break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			}
		}
	}
	
	void menuPrint() {
		System.out.println("[ 학생 성적 관리 ]");
		System.out.println("1.	입력");
		System.out.println("2.	출력");
		System.out.println("3.	삭제");
		System.out.println("4.	수정");
		System.out.println("5.	검색");
		System.out.println("0.	종료");
		System.out.print("선택>	");
	}
	
	//입력
	public void input() {
		String id, name;
		int kor, eng, mat, cnt;
		System.out.println("[ 입력 ]");
		System.out.print("학번 : ");
		id = keyin.next();
		System.out.print("이름 : ");
		name = keyin.next();
		System.out.print("국어점수 : ");
		kor = keyin.nextInt();
		System.out.print("영어점수 : ");
		eng = keyin.nextInt();
		System.out.print("수학점수 : ");
		mat = keyin.nextInt();
		
		StudentVO vo = new StudentVO(id, name, kor, eng, mat);
		cnt = dao.insert(vo);
		
		if( cnt == 0) {
			System.out.println("저장 실패");
		}
		else {
			System.out.println("저장되었습니다");
		}
	}
	
	//전체출력
	public void list() {
		listMenu();				
		int m = keyin.nextInt();	
		switch(m) {				
		case 1: listBasic();	break;
		case 2: listScore();		break;
		case 3: listName();	break;
		case 4: listId(); break;
		case 0: System.out.println("출력을 종료합니다."); return;
		}
	}
	
	//출력 메뉴
	public void listMenu() {
		System.out.println("[ 출력 ]");
		System.out.println("1.	전체 출력");
		System.out.println("2.	성적이 높은순으로 출력");
		System.out.println("3.	이름순으로 출력");
		System.out.println("4. 	학번순으로 출력");
		System.out.println("0.	출력 종료");
		System.out.print("선택>	");
	}
	//전체 출력
	public void listBasic() {
		ArrayList<StudentVO> list = dao.selectAll();
		
		System.out.println("[ 학생 정보 ]");
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	//성적순으로 출력
	public void listScore() {
		System.out.print("몇등까지 출력하시겠습니까? : ");
		int j = keyin.nextInt();
		ArrayList<StudentVO> list = dao.listScore(j);
		
		System.out.println("[ 학생 정보 ]");
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	
		
	//이름순으로 출력
	public void listName() {
		ArrayList<StudentVO> list = dao.listName();
		
		System.out.println("[ 학생 정보 ]");
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	//학번순으로 출력
	public void listId() {
		ArrayList<StudentVO> list = dao.listId();
		
		System.out.println("[ 학생 정보 ]");
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	
	
	//삭제
	public void delete() {
		String id;
		int cnt = 0;
		//학번으로 삭제
		System.out.println("[ 삭제 ]");
		System.out.print("삭제할 학생의 학번 : ");
		id = keyin.next();
		cnt = dao.delete(id);
		if( cnt == 0) {
			System.out.println("삭제 실패");
		}
		else {
			System.out.println("삭제되었습니다");
		}
	}
	
	//수정
	public void update() {
		String id, name;
		int kor, eng, mat, cnt = 0;
		//학번으로 수정
		System.out.println("[ 수정 ]");
		System.out.print("수정할 학생의 학번 : ");
		keyin.nextLine();
		id = keyin.next();
		
		//해당 학번이 있는지 먼저 검사
		StudentVO v = dao.searchId(id);
		if (v == null) {
			System.out.println("해당 학번의 학생이 없습니다.");
			return;
		}
		
		System.out.print("이름 : ");
		name = keyin.next();
		System.out.print("국어점수 : ");
		kor = keyin.nextInt();
		System.out.print("영어점수 : ");
		eng = keyin.nextInt();
		System.out.print("수학점수 : ");
		mat = keyin.nextInt();
		StudentVO vo = new StudentVO(id, name, kor, eng, mat);
		cnt = dao.update(vo);
		if (cnt == 0) {
			System.out.println("수정 실패");
		}
		else {
			System.out.println("수정되었습니다");
		}
		
	}
	
	//검색
	public void search() {
		searchMenu();				
		int m = keyin.nextInt();	
		switch(m) {				
		case 1: searchName();	break;
		case 2: searchId();		break;
		case 3: searchScore();	break;
		case 4: searchScore2(); break;
		case 5: searchScore3(); break;
		case 0: System.out.println("검색을 종료합니다."); return;
		}
	}
	
	//검색 메뉴
	public void searchMenu() {
		System.out.println("[ 검색 ]");
		System.out.println("1.	이름으로 검색");
		System.out.println("2.	학번으로 검색");
		System.out.println("3.	평균이 입력한 점수보다 높은 사람 검색");
		System.out.println("4. 	평균이 2개의 값 사이에 있는 사람 검색");
		System.out.println("5. 	평균이 2개의 값 사이에 있는 사람 검색(약간 다른 방식으로 코딩)");
		System.out.println("0.	검색 종료");
		System.out.print("선택>	");
	}
	
	//이름으로 검색
	public void searchName() {
		String name;
		System.out.println("[ 이름으로 검색 ]");
		System.out.print("검색할 이름 : ");
		keyin.nextLine();
		name = keyin.next();
		ArrayList<StudentVO> list = dao.searchName(name);

		if (list == null || list.size() == 0) {
			System.out.println("해당 이름의 학생이 없습니다.");
			return;
		}
		
		
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getKor() + "\t" + s.getEng() + "\t" + s.getMat());
		}
	}
	
	//학번으로 검색
	public void searchId() {
		String id;
		System.out.println("[ 학번으로 검색 ]");
		System.out.print("검색할 학번 : ");
		keyin.nextLine();
		id = keyin.next();
		StudentVO vo = dao.searchId(id);

		if (vo == null) {
			System.out.println("해당 학번의 학생이 없습니다.");
			return;
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학");
		System.out.println("======================================");
		System.out.println(vo.getId() + "\t" + vo.getName() + "\t" + vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMat());
		
	}
	
	//입력한 점수보다 높은 평균을 가진 사람 검색
	public void searchScore() {
		double avg;
		System.out.println("[ 평균점수로 검색 ]");
		System.out.print("평균점수 : ");
		keyin.nextLine();
		avg = keyin.nextDouble();
		ArrayList<StudentVO> list = dao.searchScore(avg);

		System.out.println("번호\t이름\t평균점수");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAvg());
		}
	}
	
	//평균점수가 2개 값 사이에 있는 사람 검색
	public void searchScore2() {
		double avg1, avg2;
		System.out.println("[ 2개의 평균점수로 검색 ]");
		System.out.print("최소 점수 : ");
		keyin.nextLine();
		avg1 = keyin.nextDouble();
		System.out.print("최대 점수 : ");
		keyin.nextLine();
		avg2 = keyin.nextDouble();
		
		HashMap<String, Double> avg = new HashMap<>();
		avg.put("avg1", avg1);
		avg.put("avg2", avg2);
		
		
		ArrayList<StudentVO> list = dao.searchScore2(avg);

		System.out.println("번호\t이름\t평균점수");
		System.out.println("======================================");
		for(int i = 0; i < list.size(); i++) {
			StudentVO s = list.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAvg());
		}
	}
	
	//평균점수가 2개 값 사이에 있는 사람 검색//선생님 방식 약간 다름
		public void searchScore3() {
			int min, max;
			System.out.println("[ 2개의 평균점수로 검색 ]");
			System.out.print("최소 점수 : ");
			keyin.nextLine();
			min = keyin.nextInt();
			System.out.print("최대 점수 : ");
			keyin.nextLine();
			max = keyin.nextInt();
			
			HashMap<String, Integer> avg = new HashMap<>();
			avg.put("min", min);
			avg.put("max", max);
			
			
			ArrayList<StudentVO> list = dao.searchScore3(min, max);

			System.out.println("번호\t이름\t평균점수");
			System.out.println("======================================");
			for(int i = 0; i < list.size(); i++) {
				StudentVO s = list.get(i);
				System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAvg());
			}
		}
	
	
	

}

package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		Person pe;
		
		//입력
//		pe = new Person("김철수", 30);
//		dao.insertPerson(pe);
	
		
		//사용자에게 삭제할 번호를 입력받아 해당 번호의 회원을 삭제
		Scanner scan = new Scanner(System.in);
//		System.out.print("삭제할 번호를 입력하세요 : ");
//		int n = scan.nextInt();
//		int cnt = dao.deletePerson(n);
//		
//		if (cnt == 0) {
//			System.out.println("해당 번호의 회원이 없습니다.");
//		}
//		else {
//			System.out.println("삭제되었습니다.");
//		}
	
		
		//번호, 이름, 나이를 전달해서 해당번호 회원의 이름과 나이를 수정
//		Person p = new Person(5, "최수정", 22);
//		int cnt = dao.updatePerson(p);
//		
//		if (cnt == 0) {
//			System.out.println("해당 번호의 회원이 없습니다.");
//		}
//		else {
//			System.out.println("수정되었습니다.");
//		}
		
		
		//전체 출력
//		ArrayList<Person> list = dao.selectAll();
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		System.out.println("번호\t이름\t나이");
//		System.out.println("=========================");
//		for(int i = 0; i < list.size(); i++) {
//			Person p = list.get(i);
//			System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
//		}
		
		
		//1명만 출력
//		int num = 0;
//		System.out.println("출력할 번호를 입력하세요");
//		num = scan.nextInt();
//		Person p = dao.selectOne(5);
//		
//		if (p != null) {
//			System.out.println("번호\t이름\t나이");
//			System.out.println("=========================");
//			System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
//		}
//		else {
//			System.out.println("해당되는 번호가 없습니다.");
//		}
		
		//이름으로 검색 (정확히 일치하는 이름)
//		ArrayList<Person> list = dao.selectName("김");
//		if (list == null || list.size() == 0) {
//			System.out.println(list);
//			System.out.println("같은 이름의 회원이 없습니다.");
//		}
//		else {
//			System.out.println("번호\t이름\t나이");
//			System.out.println("=========================");
//			for(int i = 0; i < list.size(); i++) {
//				Person p = list.get(i);
//				System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
//			}
//			System.out.println("총" + list.size() + "명");
//		}
		
		//이름 부분 검색
		ArrayList<Person> list = dao.selectName2("홍");
		
		if (list == null || list.size() == 0) {
			System.out.println("같은 이름의 회원이 없습니다.");
		}
		else {
			System.out.println("번호\t이름\t나이");
			System.out.println("=========================");
			for(int i = 0; i < list.size(); i++) {
				Person p = list.get(i);
				System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getAge());
			}
			System.out.println("총" + list.size() + "명");
		}
	}
}

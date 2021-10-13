package board.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import board.dao.BoardDAO;
import board.vo.BoardVO;
import board.vo.MemberVO;
import board.vo.ReplyVO;

public class BoardUI {
	
	private BoardDAO dao = new BoardDAO();
	private Scanner keyin = new Scanner(System.in);
	private String loginId = null; //null 안해도 자동 초기화
	
	public BoardUI() {
		while (true) {
			menuPrint();				//메뉴 출력
			int m = keyin.nextInt();	//번호 입력받음
			switch(m) {					//고른 번호에 따라 처리, 0번 고르면 종료
			case 1: join();		break;
			case 2: login();	break;
			case 3: write();	break;
			case 4: list();		break;
			case 5: read(); 	break;
			case 6: search(); 	break;
			case 7: logout(); 	break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			}
		}
	}
	
	void memberMenu() {
		System.out.println("[ 회원가입 메뉴 ]");
		System.out.println("1.	회원가입");
		System.out.println("2.	회원탈퇴");
		System.out.println("0.	종료");
		System.out.print("선택>	");
	}
	
	//메인 메뉴
	void menuPrint() {
		System.out.println("[ 게시판 ]");
		
		if (loginId == null) {
			System.out.println("1.	회원가입");
			System.out.println("2.	로그인");
		}
		else {
			System.out.println("3.	글쓰기");
			System.out.println("4.	글목록");
			System.out.println("5. 	글읽기");
			System.out.println("6. 	검색");
			System.out.println("7. 	로그아웃");
		}
		
		
		System.out.println("0.	종료");
		System.out.print("선택>	");
	}
	
	//회원가입
	public void join() {
		System.out.println("[ 회원 가입 ]");
		String id, password, name;
		

		int cnt = 0;
		System.out.print("아이디 : ");
		id = keyin.next();
		MemberVO v = dao.getId(id);
		if (v != null) {
			System.out.println("이미 사용중인 아이디입니다.");
			return;
		}
		System.out.print("비밀번호 : ");
		password = keyin.next();
		System.out.print("이름 : ");
		name = keyin.next();
		
		MemberVO vo = new MemberVO(id, password, name);
		cnt = dao.join(vo);
		
		if( cnt == 0) {
			System.out.println("가입 실패");
		}
		else {
			System.out.println("가입 완료 되었습니다");
		}
	}
	
	//로그인
	public void login() {
		String id, password, name;
		
		System.out.println("[ 로그인 ]");
		
		//내방식
		System.out.print("아이디 : ");
		id = keyin.next();
		MemberVO v = dao.getId(id);
		//아이디로 회원정보 검색
		if (v == null) {
			System.out.println("해당 아이디의 회원이 없습니다.");
			return;
		}
		System.out.print("비밀번호 : ");
		password = keyin.next();
		//아이디와 비번이 맞는지 확인
		v = dao.getPassword(id, password);
		if (v == null) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		else {
			loginId = id;
		}
		//맞으면 멤버변수 loginId에 아이디 저장
		//틀리면 리턴
		
		//선생님 코드
//		System.out.print("아이디 : ");
//		id = keyin.next();
//		System.out.print("비밀번호 : ");
//		password = keyin.next();
//		MemberVO vo = dao.getId(id);
		
		//if문 조건은 순서 바뀌면 안됨//순서바꾸면 vo가 null일때 vo.getPassword에서 nullpointexception 나옴
//		if (vo != null && vo.getPassword().equals(password)) {
//			loginId = id;
//			System.out.println("로그인되었습니다.");
//		}
//		else {
//			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
//		}
	}
	
	//글쓰기
	public void write() {
		//로그인 안하고 들어왔으면 리턴
		if (loginId == null) {
			System.out.println("로그인 해주세요.");
			return;
		}
		
		//제목과 내용 입력받음
		String title;
		String content;
		int cnt = 0;
		System.out.println("[ 글쓰기 ]");
		System.out.print("제목 : ");
		keyin.nextLine();
		title = keyin.nextLine();
		System.out.print("내용 : ");
		content = keyin.nextLine();
		//BoardVO 객체 생성해서 ID, 제목, 내용 저장
		BoardVO bvo = new BoardVO(loginId, title, content);
		//BoardDAO로 전달해서 board테이블에 저장
		cnt = dao.write(bvo);
		if( cnt == 0) {
			System.out.println("글쓰기 실패");
		}
		else {
			System.out.println("글이 저장되었습니다");
		}
	}
	//글목록
	public void list() {
		if (loginId == null) {
			System.out.println("로그인 해주세요.");
			return;
		}
		System.out.println("[ 글 목록 ]");
		//모든 글을 역순으로 번호/아이디/제목//작성일 출력
		ArrayList<BoardVO> list = dao.list();
		System.out.printf("%-5s \t %-7s \t %-18s \t\t %-5s \t %-4s \n","번호","아이디","제목","조회수","작성일");
		for (int i = 0; i < list.size(); i++) {
			BoardVO bvo = list.get(i);
			System.out.printf("%-5d \t %-7s \t %-18s \t %-5d \t %-4s\n"
					,bvo.getNum(),bvo.getId(),bvo.getTitle(),bvo.getHits(),bvo.getInputdate());
		}
		
		
	}
	//글읽기
	public void read() {
		if (loginId == null) {
			System.out.println("로그인 해주세요.");
			return;
		}
		System.out.println("[ 글 읽기 ]");
		list();
		//읽을 글번호를 하나 입력받아 그 글의 상세 정보를 모두 출력
		//글 읽어서 가져오기 전 (BoardDAO에서 처리) 조회수 1 증가하는 update 문 실행
		System.out.print("글 번호 : ");
		int num = keyin.nextInt();
		BoardVO vo = dao.read(num);
		
		if (vo == null) {
			System.out.println("입력한 번호의 글이 없습니다.");
			return;
		}
		
		System.out.println("아이디\t: " + vo.getId());
		System.out.println("제목\t: " + vo.getTitle());
		System.out.println("내용\t: " + vo.getContent());
		System.out.println("조회수\t: " + vo.getHits());
		System.out.println("작성일\t: " + vo.getInputdate());
		System.out.println();
		
		System.out.printf("%-8s \t %-12s \t %s \n","댓글번호","아이디","댓글내용");
		ArrayList<ReplyVO> rlist = dao.replyRead(vo.getNum());
		for (int i = 0; i < rlist.size(); i++) {
			ReplyVO rvo = rlist.get(i);
			System.out.printf("%-8s \t %-12s \t %s \n",rvo.getRenum(),rvo.getId(),rvo.getText());
		}

		//수정, 삭제, 리플달기
		
		while (true) {
			int cnt = 0;
			if (loginId.equals(vo.getId())) {
			System.out.print("삭제:1  수정:2");
			}
			System.out.print(" 리플달기:3 그외:메인으로> ");
			int n = keyin.nextInt();
			if (loginId.equals(vo.getId()) && n == 1) {
				cnt = dao.delete(vo.getNum(), loginId);
				if (cnt == 0) {
					System.out.println("삭제 실패");
				}
				else {
					System.out.println("삭제되었습니다.");
				}
				return;
			}
			else if (loginId.equals(vo.getId()) && n == 2) {
				//제목과 내용을 새로 입력받아서 글 번호, ID와 함께 전달
				System.out.print("수정할 제목 : ");
				keyin.nextLine();
				String title = keyin.nextLine();
				System.out.print("수정할 내용 : ");
				String content = keyin.nextLine();
				BoardVO v = new BoardVO(vo.getNum(), loginId, title, content);
				cnt = dao.update(v);
				if (cnt == 0) {
					System.out.println("수정 실패");
				}
				else {
					System.out.println("수정되었습니다.");
				}
				return;
			}
			else if (n == 3) {
				if (loginId.equals(vo.getId())) {
					System.out.print("리플삭제:1  리플수정:2");
					}
					System.out.print(" 리플:3 그외:메인으로> ");
			}
			
			else {
				System.out.println("글읽기 종료");
				break;
			}
		}
			
		
		
	}
//	//글 수정
//	public void update(int num) {
//		BoardVO vo = dao.update(vo.getNum(), loingId);
//		
//		if (vo == null) {
//			System.out.println("수정 실패");
//		}
//		else {
//			System.out.println("수정되었습니다.");
//		}
//		
//	}
//	
//	//글 삭제
//	public void delete(int num) {
//		BoardVO vo = dao.delete(num);
//		
//		if (vo == null) {
//			System.out.println("삭제 실패");
//		}
//		else {
//			System.out.println("삭제되었습니다.");
//		}
//
//	}
	

	
	//검색/비워두기//여기는 동적sql 새로운거 사용//
	public void search() {
		if (loginId == null) {
			System.out.println("로그인 해주세요.");
			return;
		}
		
		System.out.println("[ 검색 ]");
		int type = 0;
		String word = null;
		
		while (true) {
			System.out.print("검색대상 (1:제목 2:내용 3:작성자):");
			try {
				type = keyin.nextInt();
				if (type < 1 || type > 3) continue;
			}
			catch (InputMismatchException e) {
				keyin.nextLine();
				continue;
			}
			break;
		}
		
		System.out.print("검색어:");
		keyin.nextLine();
		word = keyin.nextLine();
		
		ArrayList<BoardVO> list = dao.search(type, word);
		System.out.printf("%-5s \t %-7s \t %-18s \t\t %-5s \t %-4s \n","번호","아이디","제목","조회수","작성일");
		for (int i = 0; i < list.size(); i++) {
			BoardVO bvo = list.get(i);
			System.out.printf("%-5d \t %-7s \t %-18s \t %-5d \t %-4s\n"
					,bvo.getNum(),bvo.getId(),bvo.getTitle(),bvo.getHits(),bvo.getInputdate());
		}
	}
	//로그아웃
	public void logout() {
		loginId = null;
		System.out.println("로그아웃 되었습니다");
	}
	
	
	
	
}

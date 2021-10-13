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
	private String loginId = null; //null ���ص� �ڵ� �ʱ�ȭ
	
	public BoardUI() {
		while (true) {
			menuPrint();				//�޴� ���
			int m = keyin.nextInt();	//��ȣ �Է¹���
			switch(m) {					//�� ��ȣ�� ���� ó��, 0�� ���� ����
			case 1: join();		break;
			case 2: login();	break;
			case 3: write();	break;
			case 4: list();		break;
			case 5: read(); 	break;
			case 6: search(); 	break;
			case 7: logout(); 	break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			}
		}
	}
	
	void memberMenu() {
		System.out.println("[ ȸ������ �޴� ]");
		System.out.println("1.	ȸ������");
		System.out.println("2.	ȸ��Ż��");
		System.out.println("0.	����");
		System.out.print("����>	");
	}
	
	//���� �޴�
	void menuPrint() {
		System.out.println("[ �Խ��� ]");
		
		if (loginId == null) {
			System.out.println("1.	ȸ������");
			System.out.println("2.	�α���");
		}
		else {
			System.out.println("3.	�۾���");
			System.out.println("4.	�۸��");
			System.out.println("5. 	���б�");
			System.out.println("6. 	�˻�");
			System.out.println("7. 	�α׾ƿ�");
		}
		
		
		System.out.println("0.	����");
		System.out.print("����>	");
	}
	
	//ȸ������
	public void join() {
		System.out.println("[ ȸ�� ���� ]");
		String id, password, name;
		

		int cnt = 0;
		System.out.print("���̵� : ");
		id = keyin.next();
		MemberVO v = dao.getId(id);
		if (v != null) {
			System.out.println("�̹� ������� ���̵��Դϴ�.");
			return;
		}
		System.out.print("��й�ȣ : ");
		password = keyin.next();
		System.out.print("�̸� : ");
		name = keyin.next();
		
		MemberVO vo = new MemberVO(id, password, name);
		cnt = dao.join(vo);
		
		if( cnt == 0) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� �Ϸ� �Ǿ����ϴ�");
		}
	}
	
	//�α���
	public void login() {
		String id, password, name;
		
		System.out.println("[ �α��� ]");
		
		//�����
		System.out.print("���̵� : ");
		id = keyin.next();
		MemberVO v = dao.getId(id);
		//���̵�� ȸ������ �˻�
		if (v == null) {
			System.out.println("�ش� ���̵��� ȸ���� �����ϴ�.");
			return;
		}
		System.out.print("��й�ȣ : ");
		password = keyin.next();
		//���̵�� ����� �´��� Ȯ��
		v = dao.getPassword(id, password);
		if (v == null) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return;
		}
		else {
			loginId = id;
		}
		//������ ������� loginId�� ���̵� ����
		//Ʋ���� ����
		
		//������ �ڵ�
//		System.out.print("���̵� : ");
//		id = keyin.next();
//		System.out.print("��й�ȣ : ");
//		password = keyin.next();
//		MemberVO vo = dao.getId(id);
		
		//if�� ������ ���� �ٲ�� �ȵ�//�����ٲٸ� vo�� null�϶� vo.getPassword���� nullpointexception ����
//		if (vo != null && vo.getPassword().equals(password)) {
//			loginId = id;
//			System.out.println("�α��εǾ����ϴ�.");
//		}
//		else {
//			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//		}
	}
	
	//�۾���
	public void write() {
		//�α��� ���ϰ� �������� ����
		if (loginId == null) {
			System.out.println("�α��� ���ּ���.");
			return;
		}
		
		//����� ���� �Է¹���
		String title;
		String content;
		int cnt = 0;
		System.out.println("[ �۾��� ]");
		System.out.print("���� : ");
		keyin.nextLine();
		title = keyin.nextLine();
		System.out.print("���� : ");
		content = keyin.nextLine();
		//BoardVO ��ü �����ؼ� ID, ����, ���� ����
		BoardVO bvo = new BoardVO(loginId, title, content);
		//BoardDAO�� �����ؼ� board���̺� ����
		cnt = dao.write(bvo);
		if( cnt == 0) {
			System.out.println("�۾��� ����");
		}
		else {
			System.out.println("���� ����Ǿ����ϴ�");
		}
	}
	//�۸��
	public void list() {
		if (loginId == null) {
			System.out.println("�α��� ���ּ���.");
			return;
		}
		System.out.println("[ �� ��� ]");
		//��� ���� �������� ��ȣ/���̵�/����//�ۼ��� ���
		ArrayList<BoardVO> list = dao.list();
		System.out.printf("%-5s \t %-7s \t %-18s \t\t %-5s \t %-4s \n","��ȣ","���̵�","����","��ȸ��","�ۼ���");
		for (int i = 0; i < list.size(); i++) {
			BoardVO bvo = list.get(i);
			System.out.printf("%-5d \t %-7s \t %-18s \t %-5d \t %-4s\n"
					,bvo.getNum(),bvo.getId(),bvo.getTitle(),bvo.getHits(),bvo.getInputdate());
		}
		
		
	}
	//���б�
	public void read() {
		if (loginId == null) {
			System.out.println("�α��� ���ּ���.");
			return;
		}
		System.out.println("[ �� �б� ]");
		list();
		//���� �۹�ȣ�� �ϳ� �Է¹޾� �� ���� �� ������ ��� ���
		//�� �о �������� �� (BoardDAO���� ó��) ��ȸ�� 1 �����ϴ� update �� ����
		System.out.print("�� ��ȣ : ");
		int num = keyin.nextInt();
		BoardVO vo = dao.read(num);
		
		if (vo == null) {
			System.out.println("�Է��� ��ȣ�� ���� �����ϴ�.");
			return;
		}
		
		System.out.println("���̵�\t: " + vo.getId());
		System.out.println("����\t: " + vo.getTitle());
		System.out.println("����\t: " + vo.getContent());
		System.out.println("��ȸ��\t: " + vo.getHits());
		System.out.println("�ۼ���\t: " + vo.getInputdate());
		System.out.println();
		
		System.out.printf("%-8s \t %-12s \t %s \n","��۹�ȣ","���̵�","��۳���");
		ArrayList<ReplyVO> rlist = dao.replyRead(vo.getNum());
		for (int i = 0; i < rlist.size(); i++) {
			ReplyVO rvo = rlist.get(i);
			System.out.printf("%-8s \t %-12s \t %s \n",rvo.getRenum(),rvo.getId(),rvo.getText());
		}

		//����, ����, ���ôޱ�
		
		while (true) {
			int cnt = 0;
			if (loginId.equals(vo.getId())) {
			System.out.print("����:1  ����:2");
			}
			System.out.print(" ���ôޱ�:3 �׿�:��������> ");
			int n = keyin.nextInt();
			if (loginId.equals(vo.getId()) && n == 1) {
				cnt = dao.delete(vo.getNum(), loginId);
				if (cnt == 0) {
					System.out.println("���� ����");
				}
				else {
					System.out.println("�����Ǿ����ϴ�.");
				}
				return;
			}
			else if (loginId.equals(vo.getId()) && n == 2) {
				//����� ������ ���� �Է¹޾Ƽ� �� ��ȣ, ID�� �Բ� ����
				System.out.print("������ ���� : ");
				keyin.nextLine();
				String title = keyin.nextLine();
				System.out.print("������ ���� : ");
				String content = keyin.nextLine();
				BoardVO v = new BoardVO(vo.getNum(), loginId, title, content);
				cnt = dao.update(v);
				if (cnt == 0) {
					System.out.println("���� ����");
				}
				else {
					System.out.println("�����Ǿ����ϴ�.");
				}
				return;
			}
			else if (n == 3) {
				if (loginId.equals(vo.getId())) {
					System.out.print("���û���:1  ���ü���:2");
					}
					System.out.print(" ����:3 �׿�:��������> ");
			}
			
			else {
				System.out.println("���б� ����");
				break;
			}
		}
			
		
		
	}
//	//�� ����
//	public void update(int num) {
//		BoardVO vo = dao.update(vo.getNum(), loingId);
//		
//		if (vo == null) {
//			System.out.println("���� ����");
//		}
//		else {
//			System.out.println("�����Ǿ����ϴ�.");
//		}
//		
//	}
//	
//	//�� ����
//	public void delete(int num) {
//		BoardVO vo = dao.delete(num);
//		
//		if (vo == null) {
//			System.out.println("���� ����");
//		}
//		else {
//			System.out.println("�����Ǿ����ϴ�.");
//		}
//
//	}
	

	
	//�˻�/����α�//����� ����sql ���ο�� ���//
	public void search() {
		if (loginId == null) {
			System.out.println("�α��� ���ּ���.");
			return;
		}
		
		System.out.println("[ �˻� ]");
		int type = 0;
		String word = null;
		
		while (true) {
			System.out.print("�˻���� (1:���� 2:���� 3:�ۼ���):");
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
		
		System.out.print("�˻���:");
		keyin.nextLine();
		word = keyin.nextLine();
		
		ArrayList<BoardVO> list = dao.search(type, word);
		System.out.printf("%-5s \t %-7s \t %-18s \t\t %-5s \t %-4s \n","��ȣ","���̵�","����","��ȸ��","�ۼ���");
		for (int i = 0; i < list.size(); i++) {
			BoardVO bvo = list.get(i);
			System.out.printf("%-5d \t %-7s \t %-18s \t %-5d \t %-4s\n"
					,bvo.getNum(),bvo.getId(),bvo.getTitle(),bvo.getHits(),bvo.getInputdate());
		}
	}
	//�α׾ƿ�
	public void logout() {
		loginId = null;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
	
	
	
	
}

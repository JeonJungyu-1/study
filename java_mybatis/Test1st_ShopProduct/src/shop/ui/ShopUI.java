package shop.ui;

import java.util.ArrayList;
import java.util.Scanner;

import shop.manager.ShopManager;
import shop.vo.ProductVO;
import shop.vo.SalesVO;

public class ShopUI {
	Scanner keyin = new Scanner(System.in);
	ShopManager manager = new ShopManager();
	
	public ShopUI() {
		while (true) {
			printMenu();
			int a = 0;
			try {
				a = keyin.nextInt();
			} catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			switch (a) {
			case 1: productInsert(); 		break;
			case 2: productSelectAll(); 	break;
			case 3: salesInsert(); 			break;
			case 4: salesSelectAll(); 		break;
			case 5: salesUpdate(); 			break;
			case 6: salesDelete(); 			break;
			case 7: productSales(); 			break;
			case 0: System.out.println("���α׷��� �����մϴ�.");	return;
			default : System.out.println("�ٽ� �Է��ϼ���.");
			
			}
			
		}
	}
	
	
	
	public void printMenu() {
		System.out.println("[ ������ǰ �ǸŰ��� ]");
		System.out.println("1. ��ǰ ���");
		System.out.println("2. ��ǰ ��ü ����");
		System.out.println("3. �Ǹ����� ���");
		System.out.println("4. �Ǹ����� ��ü����");
		System.out.println("5. �Ǹ����� ����");
		System.out.println("6. �Ǹ����� ����");
		System.out.println("7. ��ǰ�� �Ǹ���Ȳ");
		System.out.println("0. ����");
		System.out.print("����  > ");
	}
	
	public void productInsert() {
		int price = 0;
		String code = null;
		String name = null;
		System.out.println("[ ��ǰ ���� ��� ]");
		
		while (true) {
			System.out.print("��ǰ�ڵ� : ");
			try {
				code = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		ProductVO v = manager.getCode(code);
		if (v != null) {
			System.out.println("�����ϴ� ��ǰ��ȣ�Դϴ�.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("��ǰ�� : ");
			try {
				name = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
	
		
		
		while (true) {
			System.out.print("�ܰ� : ");
			try {
				price = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		ProductVO vo = new ProductVO(code, name, price);
		int result = manager.productInsert(vo);
		if (result == 1) {
			System.out.println("* ����Ǿ����ϴ�.");
		}
		else {
			System.out.println("* ���� �����߽��ϴ�.");
		}
	}
	public void productSelectAll() {
		System.out.println("[ ��ǰ ���� ]");
		System.out.printf("%-10s \t %-10s \t %s \n", "��ǰ�ڵ�", "��ǰ��", "����");
		System.out.println("==========================================");
		ArrayList<ProductVO> list = manager.productSelectAll();
		ProductVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			System.out.printf("%-10s \t %-10s \t %d \n", vo.getCode(), vo.getPname(), vo.getPrice());
		}
		
	}
	public void salesInsert() {
		String code = null;
		int quantity = 0;
		System.out.println("[ �Ǹ� ���� ��� ]");
		
		while (true) {
			System.out.print("��ǰ�ڵ� : ");
			try {
				code = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
		ProductVO v = manager.getCode(code);
		if (v == null) {
			System.out.println("��ǰ�ڵ尡 �߸��Ǿ����ϴ�.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("�Ǹż��� : ");
			try {
				quantity = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
		SalesVO vo = new SalesVO(code, quantity);
		int result = manager.salesInsert(vo);
		if (result == 1) {
			System.out.println("* ����Ǿ����ϴ�.");
		}
		else {
			System.out.println("* ���� �����߽��ϴ�.");
		}
	}
	public void salesSelectAll() {
		System.out.println("[ �Ǹ� ���� ]");
		System.out.printf("%-10s \t %-10s \t %-10s \t %s \n", "�Ϸù�ȣ", "��ǰ�ڵ�", "����", "�Ǹ���");
		System.out.println("==========================================");
		ArrayList<SalesVO> list = manager.salesSelectAll();
		SalesVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			System.out.printf("%-10d \t %-10s \t %-10d \t %s \n", vo.getNum(), vo.getCode(), vo.getQuantity(), vo.getInputdate());
		}
	}
	public void salesUpdate() {
		System.out.println("[ �Ǹ� ���� ���� ]");
		int a = 0;
		
		while (true) {
			System.out.print("������ Ÿ�� (1: �ڵ�, 2: ����) : ");
			try {
				a = keyin.nextInt();
				break;
			} catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
			switch (a) {
			case 1: salesUpdateCode(); 		break;
			case 2: salesUpdateQuantity(); 	break;
			case 0: System.out.println("���α׷��� �����մϴ�.");	return;
			default : System.out.println("�ٽ� �Է��ϼ���.");
			}
		
		
	}
	
	public void salesUpdateCode() {
		int num = 0;
		String code = null;
		
		while (true) {
			System.out.print("������ ��ȣ : ");
			try {
				num = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		SalesVO v = manager.getNum(num);
		if (v == null) {
			System.out.println("��ǰ��ȣ�� �߸��Ǿ����ϴ�.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("������ ��ǰ �ڵ� : ");
			try {
				code = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
		ProductVO vo = manager.getCode(code);
		if (vo == null) {
			System.out.println("��ǰ�ڵ尡 �߸��Ǿ����ϴ�.");
			return;
		}
		SalesVO svo = new SalesVO(num, code);
		int result = manager.salesUpdateCode(svo);
		if (result == 1) {
			System.out.println("* �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("* ���� �����߽��ϴ�.");
		}
	}

	public void salesUpdateQuantity() {
		int num = 0;
		int quantity = 0;
		
		while (true) {
			System.out.print("������ ��ȣ : ");
			try {
				num = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		SalesVO v = manager.getNum(num);
		if (v == null) {
			System.out.println("��ǰ��ȣ�� �߸��Ǿ����ϴ�.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("�Ǹ� ���� : ");
			try {
				quantity = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
		
		SalesVO svo = new SalesVO(num, quantity);
		int result = manager.salesUpdateQuantity(svo);
		if (result == 1) {
			System.out.println("* �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("* ���� �����߽��ϴ�.");
		}
	}
	
	public void salesDelete() {
		int num = 0;
		System.out.println("[ �Ǹ� ���� ���� ]");
		System.out.print("������ ��ȣ : ");
		while (true) {
			try {
				num = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
		SalesVO v = manager.getNum(num);
		if (v == null) {
			System.out.println("��ǰ��ȣ�� �߸��Ǿ����ϴ�.");
			return;
		}
		
		int result = manager.salesDelete(num);
		if (result == 1) {
			System.out.println("* �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("* ���� �����߽��ϴ�.");
		}
	}
	public void productSales() {
		System.out.println("[ ��ǰ�� �Ǹ� ��Ȳ ]");
		System.out.printf("%-10s \t %-10s \t %-10s \t %s \n", "��ǰ�ڵ�", "��ǰ��", "����", "�Ǹűݾ�");
		System.out.println("==========================================");
		ArrayList<SalesVO> list = manager.productSales();
		SalesVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			System.out.printf("%-10s \t %-10s \t %-10d \t %d \n", vo.getCode(), vo.getPname(), vo.getQuantity(), vo.getPrice());
		}
		
	}
	
	
}

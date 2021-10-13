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
				System.out.println("다시 입력하세요.");
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
			case 0: System.out.println("프로그램을 종료합니다.");	return;
			default : System.out.println("다시 입력하세요.");
			
			}
			
		}
	}
	
	
	
	public void printMenu() {
		System.out.println("[ 전자제품 판매관리 ]");
		System.out.println("1. 상품 등록");
		System.out.println("2. 상품 전체 보기");
		System.out.println("3. 판매정보 등록");
		System.out.println("4. 판매정보 전체보기");
		System.out.println("5. 판매정보 수정");
		System.out.println("6. 판매정보 삭제");
		System.out.println("7. 상품별 판매현황");
		System.out.println("0. 종료");
		System.out.print("선택  > ");
	}
	
	public void productInsert() {
		int price = 0;
		String code = null;
		String name = null;
		System.out.println("[ 상품 정보 등록 ]");
		
		while (true) {
			System.out.print("상품코드 : ");
			try {
				code = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		ProductVO v = manager.getCode(code);
		if (v != null) {
			System.out.println("존재하는 상품번호입니다.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("상품명 : ");
			try {
				name = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
	
		
		
		while (true) {
			System.out.print("단가 : ");
			try {
				price = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		ProductVO vo = new ProductVO(code, name, price);
		int result = manager.productInsert(vo);
		if (result == 1) {
			System.out.println("* 저장되었습니다.");
		}
		else {
			System.out.println("* 저장 실패했습니다.");
		}
	}
	public void productSelectAll() {
		System.out.println("[ 상품 정보 ]");
		System.out.printf("%-10s \t %-10s \t %s \n", "상품코드", "상품명", "가격");
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
		System.out.println("[ 판매 정보 등록 ]");
		
		while (true) {
			System.out.print("상품코드 : ");
			try {
				code = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		
		ProductVO v = manager.getCode(code);
		if (v == null) {
			System.out.println("상품코드가 잘못되었습니다.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("판매수량 : ");
			try {
				quantity = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		
		SalesVO vo = new SalesVO(code, quantity);
		int result = manager.salesInsert(vo);
		if (result == 1) {
			System.out.println("* 저장되었습니다.");
		}
		else {
			System.out.println("* 저장 실패했습니다.");
		}
	}
	public void salesSelectAll() {
		System.out.println("[ 판매 정보 ]");
		System.out.printf("%-10s \t %-10s \t %-10s \t %s \n", "일련번호", "상품코드", "수량", "판매일");
		System.out.println("==========================================");
		ArrayList<SalesVO> list = manager.salesSelectAll();
		SalesVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			System.out.printf("%-10d \t %-10s \t %-10d \t %s \n", vo.getNum(), vo.getCode(), vo.getQuantity(), vo.getInputdate());
		}
	}
	public void salesUpdate() {
		System.out.println("[ 판매 정보 수정 ]");
		int a = 0;
		
		while (true) {
			System.out.print("수정할 타입 (1: 코드, 2: 수량) : ");
			try {
				a = keyin.nextInt();
				break;
			} catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		
			switch (a) {
			case 1: salesUpdateCode(); 		break;
			case 2: salesUpdateQuantity(); 	break;
			case 0: System.out.println("프로그램을 종료합니다.");	return;
			default : System.out.println("다시 입력하세요.");
			}
		
		
	}
	
	public void salesUpdateCode() {
		int num = 0;
		String code = null;
		
		while (true) {
			System.out.print("수정할 번호 : ");
			try {
				num = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		SalesVO v = manager.getNum(num);
		if (v == null) {
			System.out.println("상품번호가 잘못되었습니다.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("수정할 상품 코드 : ");
			try {
				code = keyin.next();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		
		ProductVO vo = manager.getCode(code);
		if (vo == null) {
			System.out.println("상품코드가 잘못되었습니다.");
			return;
		}
		SalesVO svo = new SalesVO(num, code);
		int result = manager.salesUpdateCode(svo);
		if (result == 1) {
			System.out.println("* 수정되었습니다.");
		}
		else {
			System.out.println("* 수정 실패했습니다.");
		}
	}

	public void salesUpdateQuantity() {
		int num = 0;
		int quantity = 0;
		
		while (true) {
			System.out.print("수정할 번호 : ");
			try {
				num = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		SalesVO v = manager.getNum(num);
		if (v == null) {
			System.out.println("상품번호가 잘못되었습니다.");
			return;
		}
		
		
		
		while (true) {
			System.out.print("판매 수량 : ");
			try {
				quantity = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		
		
		SalesVO svo = new SalesVO(num, quantity);
		int result = manager.salesUpdateQuantity(svo);
		if (result == 1) {
			System.out.println("* 수정되었습니다.");
		}
		else {
			System.out.println("* 수정 실패했습니다.");
		}
	}
	
	public void salesDelete() {
		int num = 0;
		System.out.println("[ 판매 정보 삭제 ]");
		System.out.print("삭제할 번호 : ");
		while (true) {
			try {
				num = keyin.nextInt();
				break;
			} 
			catch(Exception e) {
				keyin.nextLine();
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		
		SalesVO v = manager.getNum(num);
		if (v == null) {
			System.out.println("상품번호가 잘못되었습니다.");
			return;
		}
		
		int result = manager.salesDelete(num);
		if (result == 1) {
			System.out.println("* 삭제되었습니다.");
		}
		else {
			System.out.println("* 삭제 실패했습니다.");
		}
	}
	public void productSales() {
		System.out.println("[ 상품별 판매 현황 ]");
		System.out.printf("%-10s \t %-10s \t %-10s \t %s \n", "상품코드", "상품명", "수량", "판매금액");
		System.out.println("==========================================");
		ArrayList<SalesVO> list = manager.productSales();
		SalesVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			System.out.printf("%-10s \t %-10s \t %-10d \t %d \n", vo.getCode(), vo.getPname(), vo.getQuantity(), vo.getPrice());
		}
		
	}
	
	
}

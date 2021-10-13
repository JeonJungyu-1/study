/*
 [ 프로그램 제목 ]
 1. 입력
 2. 출력
 3. 삭제
 4. 검색
 0. 종료
 선택> 1
 
 입력메뉴 선택했습니다.
 
  [ 프로그램 제목 ]
 1. 입력
 2. 출력
 3. 삭제
 4. 검색
 0. 종료
 선택> 5
 
없는 번호입니다.

 [ 프로그램 제목 ]
 1. 입력
 2. 출력
 3. 삭제
 4. 검색
 0. 종료
 선택> 0
 프로그램을 종료합니다.
 */
import java.util.Scanner;
public class UserMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while (true) {
			System.out.println("[ 프로그램 제목 ]");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("0. 종료");
			System.out.print("선택> ");
			a = input.nextInt();
			
			if (a == 1) {
				System.out.println("입력메뉴 선택했습니다.");
			}
			else if (a == 2) {
				System.out.println("출력메뉴 선택했습니다.");
			}
			else if (a == 3) {
				System.out.println("삭제메뉴 선택했습니다.");
			}
			else if (a == 4) {
				System.out.println("검색메뉴 선택했습니다.");
			}
			else if (a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("없는 번호입니다.");
			}
			System.out.println();
		}
		
		//선생님 코드
		//변수 선언
		int menu;
		while (true) {
			//메뉴 출력
			System.out.println("[ 프로그램 제목 ]");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("0. 종료");
			System.out.println("선택> ");
			//번호 입력받음
			menu = input.nextInt();
			//입력받은 번호에 따라 실행
			switch (menu) {
			case 1:
				System.out.println("입력 메뉴 선택");
				break;
			
			case 2:
				System.out.println("출력 메뉴 선택");
				break;
		
			case 3:
				System.out.println("삭제 메뉴 선택");
				break;
	
			case 4:
				System.out.println("검색 메뉴 선택");
				break;
			
			case 0: 	//0을 입력했다면 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default:
				System.out.println("없는 번호입니다. 다시 선택하세요.");

			}
		}
		
		//밑의 2개가 결과는 같지만 if문만 쓰면 실행하는데 시간이 더걸림/ if문이 조건이 맞으면 if문만 실행되고 else if부분은 건너뜀
//			if () {
//				
//			}
//			else if () {
//				
//			}
//			
//			if () {
//				
//			}
//			if () {
//				
//			}
//			
			
		

	}

}

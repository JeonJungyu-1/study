import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int idx;
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		while (true) {
			try {
				System.out.print("리스트에서 읽을 위치는? ");
				idx = input.nextInt();	
				break;
			}
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("범위를 벗어났습니다.");
////				input.nextLine();
////				continue;
//			}
//			catch (InputMismatchException e) {
//				System.out.println("정수를 입력해야 합니다.");
//				input.nextLine();
////				continue;
//			}
		}

		
//		System.out.println(idx + "위치의 값은 " + list.get(idx));
		
		//선생님 코드
//		while (true) {
//			System.out.print("리스트에서 읽을 위치는? ");
//			try {
//				idx = input.nextInt();
//				System.out.println(idx + "위치의 값은 " + list.get(idx));
//				break;
//			}
//			catch (InputMismatchException e) {
//				System.out.println("정수를 입력하세요.");
//				input.nextLine();
//			}
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("범위를 벗어났습니다."); 
////				input.nextLine(); //입력버퍼에 뭐가 남아있는 상태가 아니라 넣지 않아도 됨/입력버퍼가 남아있는데 쓰면 입력을 기다림.
//			}
//		}
		
	}

}

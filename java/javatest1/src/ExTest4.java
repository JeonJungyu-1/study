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
				System.out.print("����Ʈ���� ���� ��ġ��? ");
				idx = input.nextInt();	
				break;
			}
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("������ ������ϴ�.");
////				input.nextLine();
////				continue;
//			}
//			catch (InputMismatchException e) {
//				System.out.println("������ �Է��ؾ� �մϴ�.");
//				input.nextLine();
////				continue;
//			}
		}

		
//		System.out.println(idx + "��ġ�� ���� " + list.get(idx));
		
		//������ �ڵ�
//		while (true) {
//			System.out.print("����Ʈ���� ���� ��ġ��? ");
//			try {
//				idx = input.nextInt();
//				System.out.println(idx + "��ġ�� ���� " + list.get(idx));
//				break;
//			}
//			catch (InputMismatchException e) {
//				System.out.println("������ �Է��ϼ���.");
//				input.nextLine();
//			}
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("������ ������ϴ�."); 
////				input.nextLine(); //�Է¹��ۿ� ���� �����ִ� ���°� �ƴ϶� ���� �ʾƵ� ��/�Է¹��۰� �����ִµ� ���� �Է��� ��ٸ�.
//			}
//		}
		
	}

}

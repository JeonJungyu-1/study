//�ܾ �Է¹޾� ArrayList�� ����
//�׳� ����ġ�� �Է�����
//�Է¹��� �ܾ� �߿� "abc"�� �ִ��� ���� ���
//�����ؼ� �ٽ� ���
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		ArrayList<String> list = new ArrayList<String>();
//		String a;
//		while (true) {
//			System.out.print("�Է�:");
//			a = input.next();
//			if () break;
//			list.add(a);
//		}
//		System.out.println(list);
//		System.out.println(list.indexOf("abc"));
//		Collections.sort(list);
//		System.out.println(list);
		
		//������ �ڵ�
		String s;
		ArrayList<String> list2 = new ArrayList<String>();
		//�ݺ� �Է� ����
		while (true) {
			System.out.print("�ܾ��Է�:");
			s = input.nextLine();
			System.out.println("[" + s + "]");
			if (s.isEmpty()) break;
			list2.add(s);
		}
		//��� ���
		if (list2.indexOf("abc") == -1) {
			System.out.println("ã�� �ܾ �����ϴ�.");
		}
		else {
			System.out.println("abc�� �ֽ��ϴ�.");
		}
		
		Collections.sort(list2);
		System.out.println(list2);
		
	}

}

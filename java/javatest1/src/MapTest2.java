import java.util.HashMap;
import java.util.Scanner;

public class MapTest2 {

	public static void main(String[] args) {
		//�ܾ�� ������ ������ �ܾ��� ���� {"a":"aaaaaa", "b":"bbbbbb", "c":"cccccc"}
		HashMap<String, String> map = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		//�ܾ��忡 ����� �ܾ�� ������ �Է¹���
		String a, n;
		for (int i = 0; i < 6; i++) {
			System.out.print("�ܾ� : ");
			a = input.next();
			System.out.print("���� : ");
			n = input.next();
			map.put(a, n);
		}

//		map.put("a", "aaaaaa");
//		map.put("b", "bbbbbb");
//		map.put("c", "cccccc");
//		System.out.println(map);
		//�˻��� �ܾ� �Է�
		System.out.print("�˻��� �ܾ� : ");
		n = input.next();
		//�˻� ��� ���
//		System.out.println("�˻� ��� : " + map.get(n));
		System.out.println();
		
		//������ �ڵ�
		HashMap<String, String> dic = new HashMap<>();
		String s1, s2;
//		while (true) {
			System.out.print("����� �ܾ�:");
			s1 = input.nextLine();
//			if (s1.isEmpty()) break;
			System.out.print("�ܾ� ����:");
			s2 = input.nextLine();
			dic.put(s1, s2);
//		}
		
		System.out.print("�˻��� �ܾ�:");
		s1 = input.nextLine();
		s2 = dic.get(s1);
		if (s2 == null) {
			System.out.println("ã�� �ܾ �����ϴ�.");
		}
		else {
			System.out.println(s1 + " : " + s2);
		}
		
	}

}

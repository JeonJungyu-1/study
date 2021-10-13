import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 1. ������ �ݺ� �Է� �޾� ArrayList�� ����(���� ���� ������ ����Ʈ�� �����)
 2. ���� �ϳ��� �� �Է¹���(�� ��°?)
 3. ��ü �߿��� n��°�� ū �� ���
 
 [��]
 [ 6,3,1,5,9 ]
 �� ��°? 2
 2��°�� ū ���� 6�Դϴ�. 
 */
public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("���� �Է�(0 �Է��ϸ� ����) : ");
			num = input.nextInt();
			if (num == 0) break;
			list.add(num);
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.print("�� ��°? ");
		num = input.nextInt();
		System.out.println(list);
		System.out.println(num + "��°�� ū ���� " + list.get(list.size() - num) + "�Դϴ�.");
		
		//������ �ڵ�
		int n;
		//�ߺ� ���
		for( int i = 0; i < 5; i++) {
			System.out.println("���� �Է� :");
			n = input.nextInt();
			list.add(n);
		}
		
		//�ߺ� �Ұ�
		for( int i = 0; i < 5; i++) {
			System.out.println("���� �Է� :");
			n = input.nextInt();
			if (list.indexOf(n) != -1) {
				i--;
				continue;
			}
			list.add(n);
		}
		
		for1:
		for( int i = 0; i < 5; i++) {
			System.out.println("���� �Է� :");
			n = input.nextInt();
			for (int j = 0; j < i; j++) {
				if (list.get(i) == list.get(j)) {
					i--;
					continue for1;
				}
			}
			list.add(n);
		}
		
		System.out.println("���°?");
		n = input.nextInt();
		if (n>list.size()) {
			System.out.println("������ ������ϴ�.");
			return;
		}
		
		System.out.println("�Է��� ����:" + list);
		
		//��� 1 - ���� �� �ڿ��������� ������ ���
		Collections.sort(list);
		System.out.println("�������� ����:" + list);
		System.out.println(n + "��°�� ū ���� " + list.get(list.size() - n));
		//��� 2 - ���� �� �迭������ ��������
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("�������� ����:" + list);
		System.out.println(n+"��°�� ū ����"+list.get(n - 1));
		//��� 3 - �������� ����
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("�������� ����:" + list);
		System.out.println(n+"��°�� ū ����"+list.get(n - 1));
		
	}

}

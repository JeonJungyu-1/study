//Ű����� ������ �Է¹޾� ArrayList�� ����
//0 �Է��ϸ� �ݺ� ����
//�հ踦 ���Ͽ� ���
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ListTest2 {

	public static void main(String[] args) {
		int a = 0, sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("���� �Է� : ");
			a = input.nextInt();
			list.add(a);
			if (a == 0) {
				break;
			}
				
		}
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("�հ� : " + sum);
		
		System.out.println(list);
		//������ �ڵ�
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int num, s = 0;
		
		//�ݺ� �Է� ����
		while (true) {
			System.out.print("�����Է�:");
			num = input.nextInt();
			if (num == 0) break;
			list2.add(num);
		}
		
		//�հ� ���ϱ�
		for (int i = 0; i < list2.size(); i++) {
			s += list2.get(i);
		}
		//��� ���
		System.out.println(list2);
		System.out.println("�հ�:" + s);
		
		Collections.sort(list2);
		System.out.println(list2);
	}

}

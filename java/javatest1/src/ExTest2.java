import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//���� 5���� �Է¹޾� ArrayList�� ���� -> ��� ���

public class ExTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int n;
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.print("���� �Է� : ");
				n = input.nextInt();
				list.add(n);
			}
			catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�.");
				input.nextLine(); //Enter ģ�������� ��� ���� �б�
				i--;
			}
				
		}
		System.out.println(list);
	}

}

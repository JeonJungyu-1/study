import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//������ �ݺ��Է¹޾� ArrayList�� ����. ���� ������� ������ �ƴѰ��� �Է��ϸ� ����
public class ExTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n;
		
		while (true) {
			try {
				System.out.print("���� �Է� : ");
				n = input.nextInt();
				list.add(n);	
			}
			catch (InputMismatchException e) {
				break;
			}
		}
		
		//������ �ڵ�
		try {
			while (true) {
				System.out.print("���� �Է� : ");
				n = input.nextInt();
				list.add(n);	
			}
		}
		catch (InputMismatchException e) {
		}
		
		
		System.out.println(list);
	
	}

}

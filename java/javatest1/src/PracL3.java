//3�� ��������
import java.util.Scanner;
public class PracL3 {

	public static void main(String[] args) {
		int i = 0;
		double j, k;
		Scanner input = new Scanner(System.in);
		//3�� ����
		System.out.println("����� �� �� �Դϱ�?");
		i = input.nextInt();
		System.out.println("����� " + i + "���Դϴ�.");
		
		//4�� ����
		System.out.println("�������� ���� ���Դϱ�?");
		j = input.nextDouble();
		System.out.println("�������� ���� " + j + "�Դϴ�.");
		
		//5�� ����
		System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�");
		j = input.nextDouble();
		k = input.nextDouble();
		System.out.println("Ű�� " + j + "��Ƽ�����Դϴ�.");
		System.out.println("�����Դ� " + k + "ų�α׷��Դϴ�.");
	}

}
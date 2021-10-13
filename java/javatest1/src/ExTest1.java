import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		
		try {
			System.out.print("�����Է� : ");
			a = input.nextInt();
			System.out.print("�����Է� : ");
			b = input.nextInt();
			
			c = a / b;
			System.out.println(a + " / " + b + " = " + c);
			ArrayList<Integer> list = new ArrayList<>();
			list.add(a);
			System.out.println(list.get(3));
		}
		//catch������ ��Ӱ��谡 �ƴϸ� ���� �������/��Ӱ���� ����Ŭ�������� ����//Exception�� ���� �ֻ���
		catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace();	//�����ڸ� ���� ���� �޼��� ���
			return; //�޼ҵ� ����/finally�� ����.
		}
		catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
			System.exit(0); //���α׷� ����/finally�� ����ȵ�.
		}
		catch (Exception e) {
			System.out.println("��Ÿ �ٸ� ����");
		}
		finally {
			System.out.println("���� �߻� ���ο� ������� ������ ����Ǵ� ��");
		}
		
		System.out.println("���α׷��� �� �κ�");
	}
		

}

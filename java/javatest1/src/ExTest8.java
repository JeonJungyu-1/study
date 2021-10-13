import java.util.InputMismatchException;
import java.util.Scanner;

//����ó���� �������� �帧�� �ڵ�� ���������� ���� �帧�� �ڵ带 �и��ؼ� �ۼ��ϱ� ���ؼ� �����./������ �� if�� ���� �ۼ����� �ʰ�, ����ó���� �����ϱ� ���ؼ���.

public class ExTest8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng;
		
		System.out.print("�̸� : ");
		name = input.next();

		while (true) {
			try {
				System.out.print("���� : ");
				kor = inputScore();	
				System.out.print("���� : ");
				eng = inputScore();
			}
			catch (InputMismatchException e) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			catch (MinusException e) {
				e.printStackTrace();
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			catch (Exception e)  {
				e.printStackTrace();
			}
			break;
		}

		
	}
	
	public static int inputScore() /*throws Exception*/ throws InputMismatchException, MinusException, OverException {
		Scanner input = new Scanner(System.in);
		int n = 0;
		n = input.nextInt();
//		if (n < 0 || n > 100) throw new InputMismatchException(); //���������� ���� ��Ȳ�� �߻��ϸ� ���ܰ� �߻��ϰԲ� �Ѱ�.
		if (n < 0) throw new MinusException();
		if (n > 100) throw new OverException();
		
		return n;
	}

}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class javatest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = null;
		int a = 0, b = 0, c=0;
		int sum = 0;
		
		
		System.out.print("������ ���Ͽ� ���ڿ� �����ڸ� ���ʷ� �Է��Ͻÿ�.");
		s = input.next();
		sum = Integer.parseInt(s.substring(0,1));
		try {
			for(int i = 0; i < s.length() - 1; i+=2) {
				if (s.substring(i+1,i+2).equals("+")) {
					sum += Integer.parseInt(s.substring(i+2,i+3));
				}
				else if (s.substring(i+1,i+2).equals("-")) {
					sum -= Integer.parseInt(s.substring(i+2,i+3));
				}
				else if (s.substring(i+1,i+2).equals("*")) {
					sum *= Integer.parseInt(s.substring(i+2,i+3));
				}
				else if (s.substring(i+1,i+2).equals("/")) {
					sum /= Integer.parseInt(s.substring(i+2,i+3));
				}
				else {
					System.out.println("���� : ������� �߸��Ǿ� ������ �� �� �����ϴ�.");
					return;
				}
					
			}
		}
		catch (ArithmeticException e) {
			System.out.println("���� : ������� �߸��Ǿ� ������ �� �� �����ϴ�.");
			return;

		}
		catch (Exception e) {
			System.out.println("���� : ������� �߸��Ǿ� ������ �� �� �����ϴ�.");
			return;

		}
		
		
		System.out.println("���� : " + sum);
		}
		

	}
	




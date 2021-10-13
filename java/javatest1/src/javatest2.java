import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class javatest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = null;
		int a = 0, b = 0, c=0;
		int sum = 0;
		
		
		System.out.print("연산을 위하여 숫자와 연산자를 차례로 입력하시오.");
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
					System.out.println("정답 : 연산식이 잘못되어 연산을 할 수 없습니다.");
					return;
				}
					
			}
		}
		catch (ArithmeticException e) {
			System.out.println("정답 : 연산식이 잘못되어 연산을 할 수 없습니다.");
			return;

		}
		catch (Exception e) {
			System.out.println("정답 : 연산식이 잘못되어 연산을 할 수 없습니다.");
			return;

		}
		
		
		System.out.println("정답 : " + sum);
		}
		

	}
	




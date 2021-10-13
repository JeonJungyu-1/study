import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		
		try {
			System.out.print("정수입력 : ");
			a = input.nextInt();
			System.out.print("정수입력 : ");
			b = input.nextInt();
			
			c = a / b;
			System.out.println(a + " / " + b + " = " + c);
			ArrayList<Integer> list = new ArrayList<>();
			list.add(a);
			System.out.println(list.get(3));
		}
		//catch문끼리 상속관계가 아니면 순서 상관없음/상속관계면 하위클래스부터 적기//Exception이 거의 최상위
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();	//개발자를 위한 예외 메세지 출력
			return; //메소드 종료/finally는 실행.
		}
		catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
			System.exit(0); //프로그램 종료/finally도 실행안됨.
		}
		catch (Exception e) {
			System.out.println("기타 다른 문제");
		}
		finally {
			System.out.println("예외 발생 여부에 상관없이 무조건 실행되는 곳");
		}
		
		System.out.println("프로그램의 뒷 부분");
	}
		

}

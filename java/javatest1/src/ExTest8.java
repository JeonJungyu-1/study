import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리는 정상적인 흐름의 코드와 정상적이지 않은 흐름의 코드를 분리해서 작성하기 위해서 사용함./협업할 때 if로 각자 작성하지 않고, 예외처리로 통일하기 위해서임.

public class ExTest8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng;
		
		System.out.print("이름 : ");
		name = input.next();

		while (true) {
			try {
				System.out.print("국어 : ");
				kor = inputScore();	
				System.out.print("영어 : ");
				eng = inputScore();
			}
			catch (InputMismatchException e) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			catch (MinusException e) {
				e.printStackTrace();
				System.out.println("다시 입력하세요.");
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
//		if (n < 0 || n > 100) throw new InputMismatchException(); //정상적이지 않은 상황이 발생하면 예외가 발생하게끔 한것.
		if (n < 0) throw new MinusException();
		if (n > 100) throw new OverException();
		
		return n;
	}

}

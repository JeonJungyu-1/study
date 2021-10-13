import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//정수를 반복입력받아 ArrayList에 저장. 개수 상관없이 정수가 아닌것을 입력하면 종료
public class ExTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n;
		
		while (true) {
			try {
				System.out.print("정수 입력 : ");
				n = input.nextInt();
				list.add(n);	
			}
			catch (InputMismatchException e) {
				break;
			}
		}
		
		//선생님 코드
		try {
			while (true) {
				System.out.print("정수 입력 : ");
				n = input.nextInt();
				list.add(n);	
			}
		}
		catch (InputMismatchException e) {
		}
		
		
		System.out.println(list);
	
	}

}

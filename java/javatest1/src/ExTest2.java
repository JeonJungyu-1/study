import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//정수 5개를 입력받아 ArrayList에 저장 -> 모두 출력

public class ExTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int n;
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.print("정수 입력 : ");
				n = input.nextInt();
				list.add(n);
			}
			catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				input.nextLine(); //Enter 친곳까지의 모든 내용 읽기
				i--;
			}
				
		}
		System.out.println(list);
	}

}

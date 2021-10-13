import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int n = 0;
		
		list.add("aaa");
		list.add("123");
		list.add("bbbb");
		list.add("100");
		list.add("44");
		list.add("asdf");
		list.add("!@#$%");
		list.add("가나다라");
		list.add("111");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			try {
//				n = list.get(i);
//				(int)list.get(i);
				Integer.parseInt(list.get(i));
				n++;
			}
			catch (InputMismatchException e) {
			}
		}
		System.out.println("정수의 개수는 " + n);
	}

}

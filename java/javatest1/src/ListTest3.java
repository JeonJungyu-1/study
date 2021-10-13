//단어를 입력받아 ArrayList에 저장
//그냥 엔터치면 입력종료
//입력받은 단어 중에 "abc"가 있는지 여부 출력
//정렬해서 다시 출력
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListTest3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		ArrayList<String> list = new ArrayList<String>();
//		String a;
//		while (true) {
//			System.out.print("입력:");
//			a = input.next();
//			if () break;
//			list.add(a);
//		}
//		System.out.println(list);
//		System.out.println(list.indexOf("abc"));
//		Collections.sort(list);
//		System.out.println(list);
		
		//선생님 코드
		String s;
		ArrayList<String> list2 = new ArrayList<String>();
		//반복 입력 받음
		while (true) {
			System.out.print("단어입력:");
			s = input.nextLine();
			System.out.println("[" + s + "]");
			if (s.isEmpty()) break;
			list2.add(s);
		}
		//결과 출력
		if (list2.indexOf("abc") == -1) {
			System.out.println("찾는 단어가 없습니다.");
		}
		else {
			System.out.println("abc가 있습니다.");
		}
		
		Collections.sort(list2);
		System.out.println(list2);
		
	}

}

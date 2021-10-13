import java.util.HashMap;
import java.util.Scanner;

public class MapTest2 {

	public static void main(String[] args) {
		//단어와 설명을 저장한 단어장 생성 {"a":"aaaaaa", "b":"bbbbbb", "c":"cccccc"}
		HashMap<String, String> map = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		//단어장에 등록할 단어와 설명을 입력받음
		String a, n;
		for (int i = 0; i < 6; i++) {
			System.out.print("단어 : ");
			a = input.next();
			System.out.print("설명 : ");
			n = input.next();
			map.put(a, n);
		}

//		map.put("a", "aaaaaa");
//		map.put("b", "bbbbbb");
//		map.put("c", "cccccc");
//		System.out.println(map);
		//검색할 단어 입력
		System.out.print("검색할 단어 : ");
		n = input.next();
		//검색 결과 출력
//		System.out.println("검색 결과 : " + map.get(n));
		System.out.println();
		
		//선생님 코드
		HashMap<String, String> dic = new HashMap<>();
		String s1, s2;
//		while (true) {
			System.out.print("등록할 단어:");
			s1 = input.nextLine();
//			if (s1.isEmpty()) break;
			System.out.print("단어 설명:");
			s2 = input.nextLine();
			dic.put(s1, s2);
//		}
		
		System.out.print("검색할 단어:");
		s1 = input.nextLine();
		s2 = dic.get(s1);
		if (s2 == null) {
			System.out.println("찾는 단어가 없습니다.");
		}
		else {
			System.out.println(s1 + " : " + s2);
		}
		
	}

}

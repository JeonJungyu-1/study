import java.util.ArrayList;
import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {
		//맵 생성
		HashMap<Integer, String> map = new HashMap<>(); //key는 Integer, value는 String으로 저장
		
		//맵에 키 + 값 쌍으로 저장
		map.put(1, "홍길동");
		map.put(5, "김길동");
		map.put(2, "박길동");
		System.out.println(map);
		//키가 같으면 추가저장이 아닌 수정
		map.put(5, "김철수"); //key가 5인 값을 덮어씀
		System.out.println(map);
		//맵의 값 읽기
		System.out.println(map.get(1));
		System.out.println(map.get(9));
		//키를 이용하여 삭제
		map.remove(1);
		System.out.println(map);
		
		//Object를 자료형으로 정하면 하위자료형을 다 쓸 수 있다.
		HashMap<String, Object> member = new HashMap<>();
		member.put("id", "abc");
		member.put("name", "홍길동");
		member.put("point", 1000);
		member.put("cart", new ArrayList<Integer>());  //[]
		
		System.out.println(member);
		System.out.println(member.get("name"));
		ArrayList<Integer> cartlist = (ArrayList<Integer>)member.get("cart");//개체의 형변환은 기본 자료형처럼 안맞는걸 억지로 바꾸는게 아니라 가리키는 곳을 바꿔주는것임
		cartlist.add(1001);
		cartlist.add(1002);
		System.out.println(member);
	}

}

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //ArrayList<담을 자료형>
		System.out.println(list);
		System.out.println(list.size()); //현재 저장된양
		
		//값 저장
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get(0)); //0번 위치의 데이터 읽어옴
		list.remove(2); //2번 위치에 있는거 지워라
		list.remove("aaa"); //aaa를 찾아 지워라
		list.remove("abc"); //abc를 찾아 지워라
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(new Integer(100));
		list2.add(200); //new Integer(200)으로 알아서 처리해줌
		System.out.println(list2);
//		Integer x = list2.get(0);
//		int y = list2.get(0).intValue(); //.intValue()는 생략해도 자동으로 동작함.
		
		list2.add(50);
		list2.add(300);
		list2.add(100);
		System.out.println(list2);
		
		System.out.println(list2.isEmpty()); //비었는지 확인
		System.out.println(list2.indexOf(50)); //50이 있는지 확인
		System.out.println(list2.indexOf(500)); //500이 있는지 확인
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
	}

}

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {
		//�� ����
		HashMap<Integer, String> map = new HashMap<>(); //key�� Integer, value�� String���� ����
		
		//�ʿ� Ű + �� ������ ����
		map.put(1, "ȫ�浿");
		map.put(5, "��浿");
		map.put(2, "�ڱ浿");
		System.out.println(map);
		//Ű�� ������ �߰������� �ƴ� ����
		map.put(5, "��ö��"); //key�� 5�� ���� ���
		System.out.println(map);
		//���� �� �б�
		System.out.println(map.get(1));
		System.out.println(map.get(9));
		//Ű�� �̿��Ͽ� ����
		map.remove(1);
		System.out.println(map);
		
		//Object�� �ڷ������� ���ϸ� �����ڷ����� �� �� �� �ִ�.
		HashMap<String, Object> member = new HashMap<>();
		member.put("id", "abc");
		member.put("name", "ȫ�浿");
		member.put("point", 1000);
		member.put("cart", new ArrayList<Integer>());  //[]
		
		System.out.println(member);
		System.out.println(member.get("name"));
		ArrayList<Integer> cartlist = (ArrayList<Integer>)member.get("cart");//��ü�� ����ȯ�� �⺻ �ڷ���ó�� �ȸ´°� ������ �ٲٴ°� �ƴ϶� ����Ű�� ���� �ٲ��ִ°���
		cartlist.add(1001);
		cartlist.add(1002);
		System.out.println(member);
	}

}

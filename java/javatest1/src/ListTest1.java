import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //ArrayList<���� �ڷ���>
		System.out.println(list);
		System.out.println(list.size()); //���� ����Ⱦ�
		
		//�� ����
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get(0)); //0�� ��ġ�� ������ �о��
		list.remove(2); //2�� ��ġ�� �ִ°� ������
		list.remove("aaa"); //aaa�� ã�� ������
		list.remove("abc"); //abc�� ã�� ������
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(new Integer(100));
		list2.add(200); //new Integer(200)���� �˾Ƽ� ó������
		System.out.println(list2);
//		Integer x = list2.get(0);
//		int y = list2.get(0).intValue(); //.intValue()�� �����ص� �ڵ����� ������.
		
		list2.add(50);
		list2.add(300);
		list2.add(100);
		System.out.println(list2);
		
		System.out.println(list2.isEmpty()); //������� Ȯ��
		System.out.println(list2.indexOf(50)); //50�� �ִ��� Ȯ��
		System.out.println(list2.indexOf(500)); //500�� �ִ��� Ȯ��
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
	}

}

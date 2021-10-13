import java.util.ArrayList;
import java.util.Collections;

import oop.Point;
import oop.Product;
import oop.Student;

public class ListTest4 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		
		list.add(new Product("001", "����", 100));
		list.add(new Product("003", "���찳", 200));
		list.add(new Product("004", "��Ʈ", 300));
		
		System.out.println(list);
		
		Product p = new Product("003", "���찳", 200);
		System.out.println(list.indexOf(p)); 
		
		ArrayList<Point> plist = new ArrayList<Point>();
		plist.add(new Point(3,4));
		plist.add(new Point(1,2));
		plist.add(new Point(5,6));
		
		//��ü ���
		System.out.println(plist);
		//�˻�.
		Point po = new Point(5,6);
		System.out.println(plist.indexOf(po));
		System.out.println(plist.get(2) == po);
		System.out.println(plist.get(2).equals(po));
		
		System.out.println(po.compareTo(plist.get(0)));
		
		Collections.sort(plist);
		System.out.println(plist);
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student("��",50,60,70));
		slist.add(new Student("��",90,90,70));
		slist.add(new Student("��",70,60,70));
		
		Collections.sort(slist);
		System.out.println(slist);
	}

}

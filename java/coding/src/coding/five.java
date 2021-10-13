package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		String s = new String();
		int cnt;
		ArrayList<String> list = new ArrayList<>();
		cnt = sc.nextInt();
		st = sc.next();
		for(int i = 0; i < cnt; i++) {
			s = sc.next();
			list.add(s);			
		}
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			if(!list.get(i).contains(st)) {
				list.remove(i);
				i--;
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

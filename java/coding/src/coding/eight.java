package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		int cnt = 1;
		StringBuffer str = new StringBuffer("");
		ArrayList<String> list = new ArrayList<String>();
		a:
		for(;;) {
			st = sc.next();
			if(st.equals("exit")) {
				break;
			}
			else {
				for(int i = 0; i < list.size(); i++) {
					if(st.charAt(0)==list.get(i).charAt(0)) {
						list.set(i, list.get(i).replace(list.get(i).charAt(2), Integer.toString(Character.getNumericValue(list.get(i).charAt(2)) + Character.getNumericValue(st.charAt(2))).charAt(0)));
						continue a;
					}
				}
				list.add(st);
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).charAt(0) + "=" + list.get(i).charAt(2));
		}

	}

}

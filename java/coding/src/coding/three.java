package coding;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		int cnt = 1;
		StringBuffer str = new StringBuffer("");
		st = sc.nextLine();
		
		for(int i=0; i<st.length(); i++) {
			st = st.replace(Character.toString(st.charAt(st.length()-1-i)), "#");
			System.out.println(st);
		}
	}

}

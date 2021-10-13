package coding;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		int cnt = 1;
		StringBuffer str = new StringBuffer("");
		st = sc.nextLine();
		for(int i = 0; i < st.length(); i++) {
			if(Character.toString(st.charAt(i)).equals(" ")) {
				str.append(Character.toString(st.charAt(0)) + ",");
				st = st.substring((i+1), st.length());
				i = -1;
				continue;
			}
			else if(i==(st.length()-1)) {
				str.append(Character.toString(st.charAt(0)));
			}
		}
		System.out.println(str);
	}

}

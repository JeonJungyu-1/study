package coding;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		int cnt = 1;
		StringBuffer str = new StringBuffer("");
		st = sc.nextLine();
		while(st.length()!=0) {
			for(int i = 1; i < st.length(); i++) {
				if(st.charAt(0)==st.charAt(i)) {
					cnt += 1;
				}
			}
			str.append(Character.toString(st.charAt(0))+cnt);
			cnt = 1;
			st = st.replace(Character.toString(st.charAt(0)), "");
		}
		System.out.println(str);
	}

}

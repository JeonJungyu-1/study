package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		int cnt = 0;
		int score = 0;
		int stScore;
		int day;
		StringBuffer str = new StringBuffer("");
		ArrayList<Integer> list = new ArrayList<>();
		
		st = sc.nextLine();
		for(int i = 0; i < st.length(); i++) {
			if(st.charAt(i)==' ') {
				cnt = Integer.parseInt(st.substring(0, i));
				score = Integer.parseInt(st.substring(i+1, st.length()));
			}
		}
		
		for(int i = 0; i < cnt; i++) {
			st=sc.nextLine();
			for(int j = 0; j < st.length(); j++) {
				if(st.charAt(j)==' ') {
					stScore = Integer.parseInt(st.substring(0, j));
					day = Integer.parseInt(st.substring(j+1, st.length()));
					if(score <= (stScore-(5*day))) {
						list.add(i+1);
					}
				}
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

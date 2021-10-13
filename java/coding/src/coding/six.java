package coding;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		st = sc.nextLine();
		
		for(int i = 0; i < st.length(); i++) {
			if(st.charAt(i)=='A') {
				st = st.replace(Character.toString(st.charAt(i)), "4");
			}
			else if(st.charAt(i)=='E') {
				st = st.replace(Character.toString(st.charAt(i)), "3");
			}
			else if(st.charAt(i)=='G') {
				st = st.replace(Character.toString(st.charAt(i)), "6");
			}
			else if(st.charAt(i)=='I') {
				st = st.replace(Character.toString(st.charAt(i)), "1");
			}
			else if(st.charAt(i)=='O') {
				st = st.replace(Character.toString(st.charAt(i)), "0");
			}
			else if(st.charAt(i)=='S') {
				st = st.replace(Character.toString(st.charAt(i)), "5");
			}
			else if(st.charAt(i)=='Z') {
				st = st.replace(Character.toString(st.charAt(i)), "2");
			}
		}
		
		System.out.println(st);
	}

}

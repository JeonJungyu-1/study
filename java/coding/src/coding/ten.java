package coding;

import java.util.Arrays;
import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		String[][] list = {{"#", "#", "#"}, {" ", "#", " "}, {" ", "#", " "}};
		for(int k = 0; k < list.length; k++) {
			System.out.println(Arrays.deepToString(list[k]));
		}
		String[][] temp = new String[3][3];
		Scanner sc = new Scanner(System.in);
		String st ="";
		while(!st.equals("exit")) {
			System.out.print("ют╥б:");
			st = sc.next();
			for(int i = 0; i < list.length; i++) {
				for(int j = 0; j < list[i].length; j++) {
					
					if(i!=1&&j==1) {
						temp[i][j] = list[j][i];
					}
					if(i==0&&j==0) {
						temp[i][j] = list[2][0];
					}
					else if(i==0&&j==2) {
						temp[0][2] = list[0][0];
					}
					else if(i==1&&j==0) {
						temp[i][j] = list[i+1][j+1];
					}
					else if(i==1&&j==1) {
						temp[i][j] = list[1][1];
					}
					else if(i==1&&j==2) {
						temp[i][j] = list[i-1][j-1];
					}
					else if(i==2&j==0) {
						temp[i][j] = list[i][j+2];
					}
					else if(i==2&j==2) {
						temp[i][j] = list[i-2][j];
					}
				}
			}
			for(int i = 0; i < list.length; i++) {
				for(int j = 0; j < list[i].length; j++) {
					list[i][j] = temp[i][j];
				}
			}
			for(int k = 0; k < list.length; k++) {
				System.out.println(Arrays.deepToString(temp[k]));
			}
		}
	}

}

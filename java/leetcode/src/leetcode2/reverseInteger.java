package leetcode2;

import java.util.Scanner;

public class reverseInteger {

	public int reverse(int x) {
		long output = 0;
		
		while (x != 0) {
			output = (output * 10) + (x % 10);
			x=x/10;
		}
		
		if (output< (-(int)Math.pow(2, 31)) || output > (((int)Math.pow(2, 31)-1))) {
			return 0;
		}
		else {
			return (int)output;
		}
		
	}
	
	
	public static void main(String[] args) {
		reverseInteger ri = new reverseInteger();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.print("input?");
		x = sc.nextInt();
		int output = ri.reverse(x);
		System.out.println(output);
		
	}

}

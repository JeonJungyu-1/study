package leetcode11;

public class climbingStairs {
	public int climbStairs(int n) {
		int a = 1;
		int b = 2;
		int sum = 0;
		for(int i = 2; i<n; i++) {
			sum = a+b;
			a=b;
			b=sum;
		}
		if(n==1) {
			return a;
		}
		else if(n==2) {
			return b;
		}
		else {
			return sum;
		}
		
	}
}

package leetcode4;

public class palindromeNumber {

	public boolean isPalindrome(int x) {
        boolean check;
		if (x< 0) {
        	check = false;
        }
        else {
        	int num = x;
        	int result = 0;
        	while (num != 0) {
        		result = (result*10) + (num%10);
        		num /= 10;
        	}
        	if (x == result) {
        		check = true;
        	}
        	else {
        		check = false;
        	}
        }
		return check;
    }
	

}

package leetcode1;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        
    	int result[] = new int[2];
    	
    	for (int i = 0; i<nums.length; i++) {
    		for (int j = i+1; j<nums.length; j++) {
    			int hap = nums[i] + nums[j];
    			if (hap == target) {
    				result[0] = i;
    				result[1] = j;
    			}
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	twoSum ts = new twoSum();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] nums = null;
    	int target = 0;
    	int cnt = 0;
    	int[] output = new int[2];
    	
    	System.out.print("number?");
    	cnt = sc.nextInt();
    	
    	if(cnt >= 2) {
    		nums = new int[cnt];
    		for(int i = 0 ; i< cnt ; i++) {
    			System.out.print((i+1)+" nums?");
    			nums[i] = sc.nextInt();
    		}
    		System.out.print("target?");
    		target = sc.nextInt();
    		
    		output = ts.twoSum(nums, target);
    	}
    	
    	System.out.println(Arrays.toString(output));

    }
    
}



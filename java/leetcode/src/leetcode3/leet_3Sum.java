package leetcode3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class leet_3Sum {

	 public List<List<Integer>> threeSum(int[] nums) {
	        
		 List<List<Integer>> big = new ArrayList<List<Integer>>();
		 List<Integer> small = null;
		 Arrays.sort(nums);
		 for (int i = 0; i< nums.length; i++) {
			 for (int j = i + 1; j< nums.length; j++) {
				 a:
				 for (int k = j + 1; k< nums.length; k++) {
					 if (nums[i] == nums[j] && nums[j] == nums[k] && nums[i] != 0) {
						 continue;
					 }
					 else if ( (nums[i] + nums[j] + nums[k]) == 0 ) {
						 small = new ArrayList<Integer>();
						 small.add(Integer.valueOf(nums[i]));
						 small.add(Integer.valueOf(nums[j]));
						 small.add(Integer.valueOf(nums[k]));
						 Collections.sort(small);
						 for (int a = 0; a< big.size(); a++) {
							 if (Arrays.equals(big.get(a).toArray(), small.toArray())) {
								 continue a;
							 }
						 }
						 big.add(small);
					 }
				 }
			 }
		 }
		 
		 return big;
	    }
	
	public static void main(String[] args) {
		
		leet_3Sum su = new leet_3Sum();
		
		int[] nums = null;
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		System.out.print("cnt?");
		cnt = sc.nextInt();
		
		nums = new int[cnt];
		for(int i = 0; i<nums.length; i++ ) {
			nums[i] = sc.nextInt();
			if (nums[i]< -100000 || nums[i] > 100000) {
				cnt = 0;
			}
		}
		System.out.println("input :" + Arrays.toString(nums));
		
		if (cnt< 3 || cnt > 3000) {
			int[] nums2 = new int[0];
			System.out.println("output :" + Arrays.toString(nums2));
		}
		else {
			List<List<Integer>> output= su.threeSum(nums);
			System.out.println("output :" + output);
		}
		
		

	}

}

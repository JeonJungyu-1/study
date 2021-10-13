package leetcode3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class leet_3Sum2 {

	public List<List<Integer>> threeSum(int[] nums) {
	        
		List<List<Integer>> big = new ArrayList<>();
		 Arrays.sort(nums);
        
        if (nums.length< 3 || nums.length > 3000) {
			
		}
        else {
		 for (int i = 0; i< nums.length-2; i++) {
			 for (int j = i + 1; j< nums.length-1; j++) {
				 a:
				 for (int k = j + 1; k< nums.length; k++) {
					 if ( (nums[i] + nums[j] + nums[k]) == 0 ) {
						 List<Integer> l1 = Arrays.asList(nums[i], nums[j], nums[k]);
						 for (int a = 0; a< big.size(); a++) {
							 if (Arrays.equals(big.get(a).toArray(), l1.toArray())) {
								 continue a;
							 }
						 }
                         big.add(Arrays.asList(nums[i], nums[j], nums[k]));
					 }
				 }
			 }
		 }
        }
		 
		 return big;
	    }
	

}

package leetcode9;

import java.util.ArrayList;
import java.util.Collections;

public class singleNumber {
    public int singleNumber(int[] nums) {
        Integer[] nums2 = new Integer[nums.length];
    	for (int i = 0; i< nums.length; i++) {
        	nums2[i] = nums[i];
        }
    	ArrayList<Integer> list = new ArrayList<>();
    	Collections.addAll(list, nums2);
    	a:
    	for (int i = 0; i< list.size()-1; i++) {
    		for (int j = i+1; j< list.size(); j++) {
    			if(list.get(i).equals(list.get(j))) {
    				list.remove(i);
    				list.remove(j-1);
    				i = -1;
    				j = 1;
    				continue a;
    			}
    		}
    	}
    	return list.get(0);
    }
}

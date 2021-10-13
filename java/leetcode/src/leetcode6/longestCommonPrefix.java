package leetcode6;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	String result = strs[0];
    	if (strs.length == 1) {
    		return strs[0];
    	}
    	a:
    	for (int i = 0; i< strs[0].length(); i++) {
    		for (int j = 1; j< strs.length; j++) {
    			if (i<= (strs[j].length()-1)) {
    				if ((result.length() >= strs[j].length()) || (result.equals(strs[0]))) {
	    				if (strs[0].charAt(i) != strs[j].charAt(i)) {
	    					if(i==0) {
	    						result ="";
	    						break a;
	    					}
	    					else {
	    						result = strs[0].substring(0, i);
	    						break a;
	    					}
	    				}
    				}
    			}
    			else {
    				if ((result.length() >= strs[j].length())||(result.equals(strs[0]))) {
    					result = strs[j];
    				}
    			}
    		}
        	
        }
    	return result;
    }
}

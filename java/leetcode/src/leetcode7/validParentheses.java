package leetcode7;

public class validParentheses {
	public boolean isValid(String s) {
		if (s.length()<= 1) {
			return false;
		}
		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
			return false;
		}
		if (s.length()%2 == 1) {
			return false;
		}
		int k;
		int j;
		a:
        for (int i = 0; i< s.length()-1; i++) {
        	k = 0;
        	if (s.charAt(i)=='(') {
                if(s.charAt(i+1) =='}' || s.charAt(i+1) == ']') {
                    return false;
                }
        		for (j = 1; j< s.length(); j+=2) {
        			if ((s.length() > i+j) && (s.charAt(i+j) == ')')) {
                        
        				
        				k++;
        			}
        			
        		}
        		if (k == 0) {
        			return false;
        		}
    		}
    		else if (s.charAt(i)=='[') {
                if(s.charAt(i+1) =='}' || s.charAt(i+1) == ')') {
                    return false;
                }
    			for (j = 1; j< s.length(); j+=2) {
        			if ((s.length() > i+j) && (s.charAt(i+j) == ']')) {
        				 
        				k++;
        			}
        			
        		}
        		if (k == 0) {
        			return false;
        		}
    		}
        	
    		else if (s.charAt(i)=='{') {
                if(s.charAt(i+1) ==')' || s.charAt(i+1) == ']') {
                    return false;
                }
    			for (j = 1; j< s.length(); j+=2) {
        			if ((s.length() > i+j) && (s.charAt(i+j) == '}')) {
        				 
        				k++;
        			}
        			
        		}
        		if (k == 0) {
        			return false;
        		}
    		}
        	
        	
    		else if (s.charAt(i)==')') {
    			if (i == 0) {
        			return false;
        		}
    			
    			for (j = 1; j< s.length(); j+=2) {
    				if ((i>j-1) && (s.charAt(i-j) == '(')) {
                        
    					k++;
        			}
        			
        		}
        		if (k == 0) {
        			return false;
        		}
    			
    		}
    		else if (s.charAt(i)==']') {
    			if (i == 0) {
        			return false;
        		}
    			for (j = 1; j< s.length(); j+=2) {
    				if ((i>j-1) && (s.charAt(i-j) == '[')) {
                         
    					k++;
        			}
        			
        		}
        		if (k == 0) {
        			return false;
        		}
    		}
    		else if (s.charAt(i)=='}') {
    			if (i == 0) {
        			return false;
        		}
    			for (j = 1; j< s.length(); j+=2) {
    				if ((i>j-1) && (s.charAt(i-j) == '{')) {
                         
    					k++;
        			}
        			
        		}
        		if (k == 0) {
        			return false;
        		}
    		}
        	
        	
        	
        }
        return true;
    }
	
}

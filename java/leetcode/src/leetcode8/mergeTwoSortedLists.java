package leetcode8;
/**
 * Definition for singly-linked list.*/ 
public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class mergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			ListNode temp;
		
			if(l1==null) {
				return l2;
			}
			else if(l2==null) {
				return l1;
			}
	        if(l1.val > l2.val) {
	        	temp = l2;
	        	l2 = l2.next;
	        }
	        else {
	        	temp = l1;
	        	l1 = l1.next;
	        }
	        
	        ListNode result = temp;
	        
	        
	        while(l1 != null && l2 != null) {
	        	if(l1.val > l2.val) {
	        		temp.next = l2;
	        		l2 = l2.next;
	        	}
	        	else {
	        		temp.next = l1;
	        		l1 = l1.next;
	        	}
	        	temp = temp.next;
	        }
	        
	        if (l1 == null) {
	        	temp.next = l2;
	        }
	        else {
	        	temp.next = l1;
	        }
	        return result;
	    }
}

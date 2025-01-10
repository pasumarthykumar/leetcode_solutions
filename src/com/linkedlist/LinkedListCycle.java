package com.linkedlist;

public class LinkedListCycle {

	    public boolean hasCycle(ListNode head) {
	        if(head==null || head.next==null){
	            return false;
	        }
	        ListNode fp=head;
	        ListNode sp=head;
	        while(fp.next!=null && fp.next.next!=null){
	            sp=sp.next;
	            fp=fp.next.next;
	            if(fp==sp){
	                return true;
	            }
	                
	        }
	        return false;
	    }
	}
// Time Complexity is O(n)
// SPace Complexity is O(1)
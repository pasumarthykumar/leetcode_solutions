package com.linkedlist;


public class RemoveNthNodeFromEndOfList {

	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null || head.next==null){
	            return null;
	        }
	        int count=0;
	        ListNode current=head;
	        while(current!=null){
	            count=count+1;
	            current=current.next;
	        }
	        current=head;
	        int i=0;
	        ListNode tempNode=new ListNode(-1);
	        tempNode.next=head;
	        ListNode prevNode=tempNode;
	        while(current!=null){
	            i++;
	            if(i==count-n+1){
	                prevNode.next=current.next;
	                return tempNode.next;
	            }
	            prevNode=current;
	            current=current.next;
	        }
	        return tempNode.next;
	    }

	}

// Time Complexity is O(n)
// Space Complexity is O(1)
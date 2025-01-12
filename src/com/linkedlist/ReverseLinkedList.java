package com.linkedlist;

public class ReverseLinkedList {

	    public ListNode reverseList(ListNode head) {
	        if(head ==null || head.next==null){
	            return head;
	        }
	        ListNode prevNode=null;
	        ListNode current=head;
	        while(current.next!=null){
	            ListNode nextNode=current.next;
	            current.next=prevNode;
	            prevNode=current;
	            current=nextNode;
	        }
	        current.next=prevNode;
	        return current;

	    }
	}
//Time Complexity is O(n)
//SPace Complexity is O(1)
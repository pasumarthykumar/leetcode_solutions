package com.linkedlist;
import java.util.*;

//class ListNode {
//	 int val;
//     ListNode next;
//	 ListNode() {}
//	 ListNode(int val) { this.val = val; }
//	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
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
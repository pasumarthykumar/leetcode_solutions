package com.linkedlist;

public class ReverseNodesinKGroup {
	    public ListNode reverseKGroup(ListNode head, int k) {
	        if(validate(head,k)){
	            ListNode current=head;
	            int count=0;
	            ListNode prevNode=null;
	            while(current!=null && count!=k){
	                count++;
	                prevNode=current;
	                current=current.next;
	            }  
	            prevNode.next=null;
	            ListNode reversedList=reverse(head);
	            head.next=reverseKGroup(current,k);
	            return reversedList;
	        }else{
	            return head;
	        }
	    }
	    public boolean validate(ListNode head,int k){
	        ListNode current=head;
	        int count=0;
	        while(current!=null){
	            count++;
	            current=current.next;
	        }
	        if(count<k){
	            return false;
	        }
	        return true;
	    }
	    public ListNode reverse(ListNode head){
	        ListNode current=head;
	        ListNode prevNode=null;
	        while(current.next!=null){
	            ListNode newNode=current.next;
	            current.next=prevNode;
	            prevNode=current;
	            current=newNode;
	        }
	        current.next=prevNode;
	        return current;
	    }
	}
// Time Complexity is O(n)
// SPace Complexity is O(1)

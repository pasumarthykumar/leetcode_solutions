package com.linkedlist;

public class ReorderList {

	
	    public void reorderList(ListNode head) {
	        if (head == null || head.next == null) {
	            return; 
	        }

	        int count=0;
	        ListNode current=head;
	        while(current!=null){
	            count++;
	            current=current.next;
	        }
	        int mid=count/2;
	        int i=0;
	        current=head;
	        ListNode prevNode=null;
	        ListNode list2;
	        while(i<mid){
	            i++;
	            prevNode=current;
	            current=current.next;
	        }
	        prevNode.next=null;
	        list2=reverse(current);
	        merge(head,list2);

	    }
	    public void merge(ListNode list1, ListNode list2){
	       
	        while(list1!=null && list2!=null){
	            ListNode temp1=list1.next;
	            ListNode temp2=list2.next;
	            list1.next=list2;
	            if (temp1 != null) {
	                list2.next = temp1;
	            }
	            list1=temp1;
	            list2=temp2;

	        }
	    
	    }
	    public ListNode reverse(ListNode head){
	        ListNode prevNode=null;
	        ListNode current=head;
	        while(current.next!=null){
	            ListNode nextnode=current.next;
	            current.next=prevNode;
	            prevNode=current;
	            current=nextnode;
	        }
	        current.next=prevNode;
	        return current;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(1)

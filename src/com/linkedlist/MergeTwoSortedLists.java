package com.linkedlist;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {

	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode tempNode=new ListNode(-1);
	        ListNode prevNode=tempNode;
	        while(list1!=null && list2!=null){
	            if(list1.val<=list2.val){
	                ListNode currentNode=new ListNode(list1.val);
	                prevNode.next=currentNode;
	                list1=list1.next;
	                prevNode=currentNode;
	            }else{
	                 ListNode currentNode=new ListNode(list2.val);
	                 prevNode.next=currentNode;
	                 list2=list2.next;
	                 prevNode=currentNode;
	            }
	        }
	        if(list1!=null && list2==null){
	            prevNode.next=list1;
	        }else if(list1==null && list2!=null){
	            prevNode.next=list2;
	        }
	        return tempNode.next;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)

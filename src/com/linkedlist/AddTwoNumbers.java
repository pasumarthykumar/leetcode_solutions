package com.linkedlist;

public class AddTwoNumbers {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode current1=l1;
	        ListNode current2=l2;
	        int carry=0;
	        ListNode tempNode=new ListNode(-1);
	        ListNode prevNode=tempNode;
	        while(current1!=null || current2!=null){
	            int firstVal= current1!=null?current1.val:0;
	            int secondVal= current2!=null?current2.val:0;
	            int sum=firstVal+secondVal+carry;
	            int nodeVal=sum%10;
	            carry=sum/10;
	            ListNode newNode=new ListNode(nodeVal);
	            prevNode.next=newNode;
	            prevNode=newNode;
	            if(current1!=null)
	            current1=current1.next;
	            if(current2!=null)
	            current2=current2.next;
	        }
	        if(carry!=0){
	            ListNode newNode=new ListNode(carry);
	            prevNode.next=newNode;
	        }
	        return tempNode.next;
	    }
}
	
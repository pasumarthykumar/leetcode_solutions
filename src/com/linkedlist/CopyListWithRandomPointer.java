package com.linkedlist;
import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {

	    public Node copyRandomList(Node head) {
	        Node current=head;
	        Node tempNode=new Node(-1);
	        Node prevNode=tempNode;
	        ArrayList<Node> al1=new ArrayList<>();
	        ArrayList<Node> al2=new ArrayList<>();
	        while(current!=null){
	           al1.add(current);
	           current=current.next;
	        }
	        current=head;
	        while(current!=null){
	            Node newNode=new Node(current.val);
	            prevNode.next=newNode;
	            prevNode=newNode;
	            al2.add(newNode);
	            current=current.next;
	        }
	        Node currentNode=tempNode.next;
	        int i=0;
	        while(currentNode!=null){
	            Node originalNode=al1.get(i);
	            if(originalNode.random!=null){
	                int randomNodeIndex=al1.indexOf(originalNode.random);
	               currentNode.random=al2.get(randomNodeIndex);   
	            }
	            currentNode=currentNode.next;
	            i++;
	        }
	        return tempNode.next;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)

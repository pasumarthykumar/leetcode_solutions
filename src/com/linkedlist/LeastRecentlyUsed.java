package com.linkedlist;
import java.util.*;

public class LeastRecentlyUsed {

	class Node{
	    int key;
	    int value;
	    Node next;
	    Node prev;
	    Node (int key,int val){
	        this.key=key;
	        this.value=val;
	    }
	}
	class LRUCache {
	    Node head=new Node(0,0);
	    Node tail=new Node(0,0);
	    int capacity;
	    Map<Integer,Node> hp=new HashMap<>();
	    public LRUCache(int capacity) {
	        this.capacity=capacity;
	        head.next=tail;
	        tail.prev=head;
	    }
	    
	    public int get(int key) {
	       if(hp.containsKey(key)){
	        Node node=hp.get(key);
	        remove(node);
	        insert(node);
	        return node.value;
	       }
	       return -1; 
	    }
	    
	   public void put(int key, int value) {
	        if (hp.containsKey(key)) {
	            Node node = hp.get(key);
	            remove(node);
	        } else if (hp.size() == capacity) {
	            remove(tail.prev);
	        }
	        Node newNode = new Node(key, value);
	        insert(newNode);
	    }

	    public void insert(Node node){
	        hp.put(node.key,node);
	        Node headNext=head.next;
	        head.next=node;
	        node.prev=head;
	        node.next=headNext;
	        headNext.prev=node;
	    }

	    public void remove(Node node){
	        hp.remove(node.key);
	        node.prev.next=node.next;
	        node.next.prev=node.prev;
	    }
	}
	
}

// Time Complexity is O(1)
// Space Complexity is O(1)

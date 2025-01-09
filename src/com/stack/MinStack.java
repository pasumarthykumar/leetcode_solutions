package com.stack;
import java.util.*;

public class MinStack {
	    Stack<Integer> stack=new Stack<>();
	    Stack<Integer> minStack;
	    int min=Integer.MAX_VALUE;
	    public MinStack() {
	         minStack=new Stack<>();
	    }
	    public void push(int val) {
	        if(minStack.isEmpty() || minStack.peek()>=val){
	            minStack.push(val);
	        }
	        stack.push(val);
	            
	    }
	    
	    public void pop() {
	        if(stack.pop().equals(minStack.peek())){
	            minStack.pop();
	        }
	    }
	    
	    public int top() {
	       return stack.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
	}

// Time Complexity is O(1)
// Space Complexity is O(n)
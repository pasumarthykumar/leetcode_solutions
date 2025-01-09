package com.stack;
import java.util.*;

public class MonotonicStack {
	class Solution {
	    public int[] dailyTemperatures(int[] temperatures) {
	        int temp[]=new int[temperatures.length];
	        Stack<Integer> stack=new Stack<>();
	        for(int i=0;i<temperatures.length;i++){
	            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
	                int index=stack.pop();
	                temp[index]=i-index;
	            }
	            stack.push(i);
	        }
	    return temp;
	    }
	}

}

// Time Comlexity is O(n)
// Space Complexity is O(n)
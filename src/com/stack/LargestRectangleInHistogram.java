package com.stack;

import java.util.*;

public class LargestRectangleInHistogram {

	    public int largestRectangleArea(int[] heights) {
	        int i=0;
	        Stack<Integer> stack=new Stack<>();
	        int area=0;
	        int currentHeight;
	        while(i<=heights.length){
	            if(i==heights.length){
	                currentHeight=0;
	            }else{
	                currentHeight=heights[i];
	            }
	            while(!stack.isEmpty() && heights[stack.peek()]>currentHeight){
	                int height=heights[stack.pop()];
	                int width=stack.isEmpty()? i:i-stack.peek()-1;
	                area=Math.max(area,height*width);
	            }
	            stack.push(i);
	            i++;
	        }
	        return area;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)

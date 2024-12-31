package com.twopointers;

public class TrappingRainWater {
		public int trap(int[] height) {
	        int waterUnits=0;
	        int leftMax=0;
	        int rightMax=0;
	        int left[]=new int[height.length];
	        int right[]=new int[height.length];
	        for(int i=0;i<height.length;i++){
	            leftMax=Math.max(leftMax,height[i]);
	            left[i]=leftMax;
	        }
	        for(int i=height.length-1;i>=0;i--){
	             rightMax=Math.max(rightMax,height[i]);
	             right[i]=rightMax;
	        }
	        for(int i=1;i<height.length-1;i++){
	            if(Math.min(left[i-1],right[i+1])-height[i] >0){
	                waterUnits=waterUnits+Math.min(left[i-1],right[i+1])-height[i];
	            }
	            
	        }
	        return waterUnits;
	        
	    }
}
	

// Time Complexity is O(n);
// Time Complexity is O(1);
package com.binarysearch;

public class FindMinInRotatedSortedArray {

	    public int findMin(int[] nums) {
	        int i=0;
	        int j=nums.length-1;
	        int min=Integer.MAX_VALUE;
	        while(i<=j){
	            int mid=(i+j)/2;
	            if(nums[i]<=nums[mid]){
	                min=Math.min(min,nums[i]);
	                i=mid+1;
	            }else{
	                min=Math.min(min,nums[mid]);
	                j=mid-1;
	            }

	        }
	        return min;
	    }
	}

// Time Complexity is O(logn)
// Space Complexity is O(1)

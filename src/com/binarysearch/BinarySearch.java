package com.binarysearch;

public class BinarySearch {

	    public int search(int[] nums, int target) {
	        int i=0;
	        int j=nums.length-1;
	        int result=-1;
	        while(i<=j){
	            int mid=(i+j)/2;
	            if(nums[mid]>target){
	                j=mid-1;
	            }else if (nums[mid]<target){
	                i=mid+1;
	            }else{
	                return mid;
	            }
	        }
	        return result;
	    }
	}

// Time Complexity is O(logn)
// SPace Complexity is O(1)

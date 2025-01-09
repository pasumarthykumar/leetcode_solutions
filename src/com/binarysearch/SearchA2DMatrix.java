package com.binarysearch;

public class SearchA2DMatrix {

	    public boolean searchMatrix(int[][] matrix, int target) {
	        int left=0;
	       
	        int m=matrix.length;
	        int n=matrix[0].length;
	        int right=m*n-1;
	        while(left<=right){
	            int mid=(left+right)/2;
	            if(matrix[mid/n][mid%n]==target){
	                return true;
	            }else if(matrix[mid/n][mid%n]>target){
	                right=right-1;
	            }else{
	                left=left+1;
	            }
	        }
	        return false;
	    }
	}


// Time Complexity is O(m*n)
// Space Complexity is O(1)
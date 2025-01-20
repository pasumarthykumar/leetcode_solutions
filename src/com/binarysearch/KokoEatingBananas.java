package com.binarysearch;

public class KokoEatingBananas {

	    public int minEatingSpeed(int[] piles, int h) {
	        int max=findMax(piles);
	        int low=1;
	        int high=max;
	        int min=Integer.MAX_VALUE;
	        while(low<=high){
	            int mid=(low+high)/2;
	            double hours=computeTime(piles,mid);
	            if(hours>h){
	                low=mid+1;
	            }
	            else{
	                min=Math.min(min,mid);
	                high=mid-1;
	            }
	        }
	        return min;
	    }
	    public double computeTime(int[] piles, int mid){
	       double hours=0;
	        for(int i=0;i<piles.length;i++){
	            hours=hours+Math.ceil((double) piles[i] / mid);
	        }
	        return hours;
	    }
	    public int findMax(int[] piles){
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<piles.length;i++){
	            max=Math.max(max,piles[i]);
	        }
	        return max;
	    }
	}

// Time Complexity is O(n*log(max));

// Space Complexity is O(1)
package com.arraysandhashing;

public class BestTimeToBuyAndSellStock {

	    public int maxProfit(int[] prices) {
	    
	        int maxPrice=0;
	        int i=0;
	        int j=1;
	        while(j<prices.length){
	            if(prices[j]<prices[i]){
	                i=j;
	                j++;
	            }else{
	                maxPrice=Math.max(maxPrice,prices[j]-prices[i]);
	                j++;
	            }
	        }
	        return maxPrice; 
	    }
	             
}

//Time Complexity is O(n)
//Space Complexity is O(1)

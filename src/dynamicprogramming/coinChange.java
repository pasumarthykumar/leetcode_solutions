package dynamicprogramming;
import java.util.*;

public class coinChange {
	    public int coinChangeSolution(int[] coins, int amount) {
	        int [][]dp=new int[coins.length][amount+1];
	        for(int i=0;i<coins.length;i++){
	            for(int j=0;j<amount+1;j++){
	                dp[i][j]=-1;
	            }
	        }
	        int ans= minNoOfCoins(dp,coins,0,amount);
	        if(ans==10001)
	            return -1;
	        return ans;        
	    }
	    
	    public int minNoOfCoins(int[][] dp,int coins[],int currentIndex,int target){
	        if(target==0){
	            return 0;
	        }
	        if(currentIndex==coins.length && target!=0){
	            return 10001;
	        }
	        int include=10001;
	        if(dp[currentIndex][target]!=-1){
	            return dp[currentIndex][target];
	        }
	        if(coins[currentIndex]<=target){
	             include=1+minNoOfCoins(dp,coins,currentIndex,target-coins[currentIndex]);
	        }
	        int dontInclude=minNoOfCoins(dp,coins,currentIndex+1,target);
	        dp[currentIndex][target]=Math.min(include,dontInclude);
	        return Math.min(include,dontInclude);
	    }
	}

// Time Complexity of this O(n*m)
// Space Complexity of this O(n*m)
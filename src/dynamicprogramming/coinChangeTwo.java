package dynamicprogramming;

public class coinChangeTwo {

	    public int change(int amount, int[] coins) {
	        int [][]dp=new int[coins.length][amount+1];
	        for(int i=0;i<coins.length;i++){
	            for(int j=0;j<amount+1;j++){
	                dp[i][j]=-1;
	            }
	        }
	        int ans= NoOfWays(dp,coins,0,amount);
	        return ans;        
	    }
	    
	    public int NoOfWays(int[][] dp,int coins[],int currentIndex,int target){
	        if(target==0){
	            return 1;
	        }
	        if(currentIndex==coins.length && target!=0){
	            return 0;
	        }
	        int include=0;
	        if(dp[currentIndex][target]!=-1){
	            return dp[currentIndex][target];
	        }
	        if(coins[currentIndex]<=target){
	             include=NoOfWays(dp,coins,currentIndex,target-coins[currentIndex]);
	        }
	        int dontInclude=NoOfWays(dp,coins,currentIndex+1,target);
	        dp[currentIndex][target]=include+dontInclude;
	        return include+dontInclude;
	    }
	}

// Time Complexity is O(n*m)
// Space Complexity is O(n*m)


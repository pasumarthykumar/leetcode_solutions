package dynamicprogramming;

public class PartitionEqualSubsetSum {

	    public boolean canPartition(int[] nums) {
	        int sum=0;
	        for(int i=0;i<nums.length;i++){
	            sum=sum+nums[i];
	        }
	        if(sum%2!=0){
	            return false;
	        }
	        sum=sum/2;
	        Boolean[][] dp = new Boolean[nums.length][sum + 1];
	        return canDivide(nums,sum,0,dp);
	    }
	    public boolean canDivide(int[] nums,int target,int currentIndex,Boolean[][] dp){
	        if(target==0){
	            return true;
	        }
	        if(currentIndex==nums.length && target!=0){
	            return false;
	        }
	        boolean consider=false;
	        if (dp[currentIndex][target] != null) return dp[currentIndex][target];
	        if(nums[currentIndex]<=target)
	            consider=canDivide(nums,target-nums[currentIndex],currentIndex+1,dp);
	        boolean notConsider=canDivide(nums,target,currentIndex+1,dp);  
	        dp[currentIndex][target] = consider || notConsider;
	        return consider || notConsider;
	    }
	}

// Time Complexity is O(N*sum/2)
// Space Complexity is O(N*sum/2)


package dynamicprogramming;
import java.util.*;

public class TargetSum {
	    public int findTargetSumWays(int[] nums, int target) {
	        HashMap<String,Integer> hp=new HashMap<>();
	        return noOfWays(nums,0,0,hp,target);
	    }
	    public int noOfWays(int[] nums, int currentIndex,int sum,HashMap<String,Integer> hp,int target){
	        if(currentIndex==nums.length && sum==target){
	            return 1;
	        }
	        if(currentIndex==nums.length && sum!=target){
	            return 0;
	        }
	        String currentKey=Integer.toString(currentIndex)+"-"+Integer.toString(sum);
	        if(hp.containsKey(currentKey)){
	            return hp.get(currentKey);
	        }
	        int positiveSign=noOfWays(nums,currentIndex+1,sum+nums[currentIndex],hp,target);
	        int negativeSign=noOfWays(nums,currentIndex+1,sum-nums[currentIndex],hp,target);
	        hp.put(currentKey,positiveSign+negativeSign);
	        return positiveSign+negativeSign;
	    }
	}

// Time Complexity is O(n*S)
// Space Complexity is O(n*S)
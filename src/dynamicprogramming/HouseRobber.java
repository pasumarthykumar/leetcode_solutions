package dynamicprogramming;
import java.util.*;

public class HouseRobber {

	    public int rob(int[] nums) {
	        HashMap<Integer,Integer> hp=new HashMap<>();
	        return maxAmount(nums,0,hp);
	    }
	    public int maxAmount(int[] nums,int currentIndex,HashMap<Integer,Integer> hp){
	        if(currentIndex>=nums.length){
	            return 0;
	        }
	        if(hp.containsKey(currentIndex)){
	            return hp.get(currentIndex);
	        }
	        int stolen=nums[currentIndex]+maxAmount(nums,currentIndex+2,hp);
	        int notStolen=maxAmount(nums,currentIndex+1,hp);
	        hp.put(currentIndex,Math.max(stolen,notStolen));
	        return Math.max(stolen,notStolen);
	    }
	}

// Time Complexity of this is O(n)
// Space Complexity of this is O(n)
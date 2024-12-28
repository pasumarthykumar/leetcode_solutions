package com.arraysandhashing;
import java.util.*;

public class ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> hs=new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            hs.add(nums[i]);
	        }
	        if(hs.size()!=nums.length){
	            return true;
	        }
	        return false;
	    }
}


//Time Commplexity is O(n)
//Space Commplexity is O(n)
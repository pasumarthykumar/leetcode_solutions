package com.arraysandhashing;
import java.util.*;

public class TwoSum  {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> hp=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            if(hp.containsKey(target-nums[i])){
                return new int[]{i,hp.get(target-nums[i])};
            }
            hp.put(nums[i],i);
         }
         return new int[]{0,0,};
    }
}


// Time Complexity:- O(n);
// Space Complexity:- O(n)
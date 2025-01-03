package com.arraysandhashing;
import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int length=1;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i+1]==nums[i]){
                continue;
            }
            if(i+1<nums.length && nums[i+1]-nums[i]==1){
                length=length+1;
            }else{
                if(max<length){
                    max=length;
                }
                length=1;
            }
        }
        return max;
    }
}

// Time Complexity is O(nlogn)
// Space Complexity is O(n)
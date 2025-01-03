package com.twopointers;
import java.util.*;
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
      HashSet<List<Integer>> al1=new HashSet<>();
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
        while(left<right)  {
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                ArrayList<Integer>al=new ArrayList<>();
                al.add(nums[i]);  al.add(nums[left]);  al.add(nums[right]);
                left++;
                right--;
                al1.add(al);
            }else if(sum>0){
                right--;
            }
            else{
                left++;
            }
        }
      } 
     ArrayList<List<Integer>> al2=new ArrayList<>(al1);
      return al2; 
    }
}

// Time Complexity is O(n^2)
// SPace Complexity is O(n)
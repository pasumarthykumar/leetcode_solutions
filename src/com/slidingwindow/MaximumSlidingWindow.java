package com.slidingwindow;

public class MaximumSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {  
            int a[]=new int[nums.length-k+1];
            int h=0;
        for(int i=0;i<nums.length-k+1;i++){
            int max=Integer.MIN_VALUE;
            int j=i;
            while(j<i+k)
            {
                if(max<nums[j])
                {
                    max=nums[j];
                }
                j++;
            }
            a[h++]=max;
        }
        return a;
    }
}

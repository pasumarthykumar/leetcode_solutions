package com.arraysandhashing;

public class ProductOfArraysExceptSelf {
    public int[] productExceptSelf(int[] nums) {
    //     int a[]=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //       int product=1;
    //       for(int j=0;j<nums.length;j++){
    //             if(i==j){
    //                 continue;
    //             }  
    //             product=product*nums[j];
    //     }
    //     a[i]=product;
    // }
    int left[]=new int[nums.length];
    int right[]=new int[nums.length];
    int result[]=new int[nums.length];
    left[0]=1;
    right[nums.length-1]=1;
    for(int i=1;i<nums.length;i++){
        left[i]=left[i-1]*nums[i-1];
    }
    for(int i=nums.length-2;i>=0;i--){
        right[i]=right[i+1]*nums[i+1];
    }
    for(int i=0;i<nums.length;i++){
        result[i]=left[i]*right[i];
    }
    return result;
    }
}


	

// Time Complexity is O(n)
// Space Complexity is O(n)
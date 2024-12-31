package com.twopointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        int leftMax=0;
        int rightMax=0;
        int waterUnits=0;
        for(int i=1;i<height.length-1;i++){
            int j=0;
            int k=i+1;
            leftMax=0;
            rightMax=0;
            while(j<i){
                if(leftMax<height[j]){
                    leftMax=height[j];
                } 
                j++;   
            }
            while(k<height.length){
                if(rightMax<height[k]){
                    rightMax=height[k];
                }
                k++;
            }
        
            if(Math.min(leftMax,rightMax)-height[i] >0){
                waterUnits=waterUnits+Math.min(leftMax,rightMax)-height[i];
            }
            
        }
        return waterUnits;

}
}

// Time Complexity is O(n^2);
// Time Complexity is O(1);
package com.twopointers;

public class ContainterWithMostWater {
    public int maxArea(int[] height) {
        int area=0;
        int i=0;
        int j=height.length-1;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         area=Math.max(area,Math.min(height[j],height[i])*(j-i));
        //     }
        // }
        while(i<j){
            area=Math.max(area,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }
}

// Time Complexity is O(n)
// Space Complexity is O(1)
package com.stack;
import java.util.*;

public class MonotonicStack {

    public int[] dailyTemperatures(int[] temperatures) {
        int temp[]=new int[temperatures.length];
        int i=0;
        int j=0;
        while(i<temperatures.length){
            if(i==temperatures.length-1){
                temp[i]=0;
            }
            j=i+1;
            int count=0;
            while(j<temperatures.length){
                if(temperatures[j]>temperatures[i]){
                    count++;
                    temp[i]=count;
                    break;
                }
                if(temperatures[j]<=temperatures[i]){
                    count++;
                }
                j++;
            }
            i++;
        }
    return temp;
    }
}

// Time Comlexity is O(n^2)
// Space Complexity is O(n)
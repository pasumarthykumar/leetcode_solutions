package com.twopointers;

public class TwoSumPartTwo {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer> hp=new HashMap<>();
        int a[]=new int[2];
        // for(int i=0;i<numbers.length;i++){
        //     if(hp.containsKey(target-numbers[i])){
        //         a[0]=i+1;
        //         a[1]=hp.get(target-numbers[i]);
        //     }
        //     hp.put(numbers[i],i+1);
        // }
        // Arrays.sort(a);
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return a;
    }
}

//Time Complexity is O(n)
//Space Complexity is O(1)
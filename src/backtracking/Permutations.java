package backtracking;
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        generatePermutations(nums,0,nums.length-1,answer);
        return answer;
    }
    public void generatePermutations(int[] nums,int start, int end,List<List<Integer>> answer){
        if (start > end) {  
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            answer.add(new ArrayList<>(currentPermutation));
            return;
        }
         for (int i = start; i <= end; i++) {  
            swap(nums, start, i);
            generatePermutations(nums, start + 1, end, answer);    
            swap(nums, start, i);  
        }
        return;
    }
    public void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}

// Time Complexity of this n*n!
// Space Complexity of this n*n!
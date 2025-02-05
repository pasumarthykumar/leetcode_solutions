package backtracking;
import java.util.*;

public class CombinationSumTwo {

	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        Set<List<Integer>> al = new HashSet<>();
	        Arrays.sort(candidates);
	        constructCombinations(candidates,new ArrayList<>(),0,al,target);
	       return new ArrayList<>(al);
	    }
	    public void constructCombinations(int[] candidates,List<Integer> al1,int currentIndex,Set<List<Integer>> al2,int target){
	        if(target==0){
	            List<Integer> al3=new ArrayList<>(al1);
	            al2.add(al3);
	            return;
	        }
	        if(currentIndex>=candidates.length || target<0){
	            return;
	        }
	        if(candidates[currentIndex]<=target){
	            al1.add(candidates[currentIndex]);
	            constructCombinations(candidates,al1,currentIndex+1,al2,target-candidates[currentIndex]);
	            al1.remove(al1.size()-1);
	        }
	        while (currentIndex + 1 < candidates.length && candidates[currentIndex] == candidates[currentIndex + 1]) {
	            currentIndex++;  
	        }
	        constructCombinations(candidates,al1,currentIndex+1,al2,target);
	        return;
	    }
	}

// Time Complexity is O(2^n)
// Space Complexity is O(2^n)
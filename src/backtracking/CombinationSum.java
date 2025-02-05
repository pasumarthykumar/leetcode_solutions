package backtracking;
import java.util.*;
public class CombinationSum {

	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> al=new ArrayList<>();
	        constructCombinations(candidates,0,new ArrayList<>(),al,target);
	        return al;
	    }
	    public void constructCombinations(int[] candidates,int currentIndex,List<Integer> al1, List<List<Integer>> al2,int target){
	        if(target==0){
	            al2.add(new ArrayList<>(al1));
	            return;
	        }
	        if(currentIndex>=candidates.length){
	            return;
	        }
	        if(candidates[currentIndex]<=target){
	                al1.add(candidates[currentIndex]);
	                constructCombinations(candidates,currentIndex,al1,al2,target-candidates[currentIndex]);
	                al1.remove(al1.size()-1);
	        }
	        
	        constructCombinations(candidates,currentIndex+1,al1,al2,target);
	        return;
	    }
	}

// Time Complexity is(2^n)
// Space Complexity is (2^n)
package backtracking;
import java.util.*;

public class SubsetsTwo {

	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> al=new ArrayList<>();
	        Arrays.sort(nums);
	        constructSubsets(nums,0,new ArrayList<>(),al);
	        return al;
	    }
	    public void constructSubsets(int[] nums,int currentIndex,List<Integer> al1,List<List<Integer>> al2){
	        if(currentIndex==nums.length){
	            al2.add(new ArrayList<>(al1));
	            return;
	        }
	        al1.add(nums[currentIndex]);
	        constructSubsets(nums,currentIndex+1,al1,al2);
	        al1.remove(al1.size()-1);
	        constructSubsets(nums,currentIndex+1,al1,al2);
	        return;
	    }
	}

// Time Complexity is O(2^n)
// Space Complexity is O(2^n)

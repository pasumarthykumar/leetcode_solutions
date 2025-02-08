package dynamicprogramming;
import java.util.*;

public class MinCost {

	    public int minCostClimbingStairs(int[] cost) {
	        HashMap<Integer,Integer> hp=new HashMap<>();
	        int indexOne=minCost(cost,0,hp);
	        int indexTwo=minCost(cost,1,hp);

	        return Math.min(indexOne,indexTwo);
	    }
	    public int minCost(int[] cost,int currentIndex,HashMap<Integer,Integer> hp){
	        if(currentIndex>=cost.length){
	            return 0;
	        }
	        if(currentIndex>cost.length){
	            return 999;
	        }
	        if(hp.containsKey(currentIndex)){
	            return hp.get(currentIndex);
	        }
	        int oneStepCost=cost[currentIndex]+minCost(cost,currentIndex+1,hp);
	        int twoStepCost=cost[currentIndex]+minCost(cost,currentIndex+2,hp);
	        hp.put(currentIndex,Math.min(oneStepCost,twoStepCost));
	        return Math.min(oneStepCost,twoStepCost);

	    }
	}


// Time Complexity is O(n)
//Space Complexity is O(n)
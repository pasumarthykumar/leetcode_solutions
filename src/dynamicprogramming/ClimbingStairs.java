package dynamicprogramming;
import java.util.*;

public class ClimbingStairs {

	    public int climbStairs(int n) {
	        HashMap<Integer,Integer> hp=new HashMap<>();
	        return noOfWays(0,n,hp);
	    }
	    public int noOfWays(int currentIndex,int n,HashMap<Integer,Integer> hp){
	        if(currentIndex==n){
	            return 1;
	        }
	        if(currentIndex>n){
	            return 0;
	        }
	        if(hp.containsKey(currentIndex)){
	            return hp.get(currentIndex);
	        }
	        int oneStep=noOfWays(currentIndex+1,n,hp);
	        int twoStep=noOfWays(currentIndex+2,n,hp);
	        hp.put(currentIndex,oneStep+twoStep);
	        return oneStep+twoStep;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)

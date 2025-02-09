package dynamicprogramming;
import java.util.*;

public class HouseRobberTwo {

	    public int rob(int[] nums) {
	        if(nums.length==1){
	            return nums[0];
	        }
	        int a[]=new int[nums.length-1];
	        int b[]=new int[nums.length-1];
	        int j=0;
	        for(int i=0;i<nums.length-1;i++){
	            a[i]=nums[i];
	        }
	        for(int i=1;i<nums.length;i++){
	            b[j++]=nums[i];
	        }
	        HashMap<Integer,Integer> hp1=new HashMap<>();
	        HashMap<Integer,Integer> hp2=new HashMap<>();
	        int startZero=maxProfit(a,0,hp1);
	        int starOne=maxProfit(b,0,hp2);
	        return Math.max(startZero,starOne);
	    }
	    public int maxProfit(int a[],int currentIndex,HashMap<Integer,Integer> hp){
	        if(currentIndex>=a.length){
	            return 0;
	        }
	        if(hp.containsKey(currentIndex)){
	            return hp.get(currentIndex);
	        }
	        int Rob=a[currentIndex]+maxProfit(a,currentIndex+2,hp);
	        int notRob=maxProfit(a,currentIndex+1,hp);
	        hp.put(currentIndex,Math.max(Rob,notRob));
	        return Math.max(Rob,notRob);

	    }
	}

// Time Complexity of this O(n)
// Space Complexity of this O(n)
package dynamicprogramming;
import java.util.*;

public class BestTimeToBuyAndSellStock {

	    public int maxProfit(int[] prices) {
	        HashMap<String,Integer> hp=new HashMap<>();
	        return maxGain(prices,0,1,1,hp);
	    }
	    public int maxGain(int[] prices,int currentIndex,int canBuy,int trans, HashMap<String,Integer> hp){

	        if(currentIndex>=prices.length){
	            return 0;
	        }
	        int idle=0;
	        int buy=0;
	        int sell=0;
	        String currentKey=currentIndex+"-"+canBuy;
	        if(hp.containsKey(currentKey)){
	            return hp.get(currentKey);
	        }
	        if(canBuy==1){
	            idle=maxGain(prices,currentIndex+1,1,1,hp);
	            buy=-prices[currentIndex]+maxGain(prices,currentIndex+1,0,1,hp);
	            hp.put(currentKey,Math.max(idle,buy));
	            return Math.max(idle,buy);
	        }else{
	            idle=maxGain(prices,currentIndex+1,0,1,hp);
	            sell=prices[currentIndex]+maxGain(prices,currentIndex+2,1,0,hp);
	            hp.put(currentKey,Math.max(idle,sell));
	            return Math.max(idle,sell);
	        }
	    }
	}

//Time Complexity is O(N)
//Space Complexity is O(N)

package com.binarysearch;
import java.util.*;

public class TimeBasedKeyValueStore {

	    HashMap<String,List<Pair>>hp;
	    
	    public TimeBasedKeyValueStore() {   
	        hp=new HashMap<>();
	    }
	    
	    public void set(String key, String value, int timestamp) {
	        hp.putIfAbsent(key, new ArrayList<>());
	        hp.get(key).add(new Pair(value,timestamp));
	    }
	    
	    public String get(String key, int timestamp) {
	        if(!hp.containsKey(key)){
	            return "";
	        }
	        List<Pair> pairs = hp.get(key);
	        String result="";
	        int low=0;
	        int high=hp.get(key).size()-1;
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(pairs.get(mid).timestamp<=timestamp){
	                result=pairs.get(mid).value;
	                low=mid+1;
	            }else{
	                high=mid-1;
	            }
	        }
	        return result;

	    }
	}
	class Pair{
	    String value;
	    int timestamp;
	    Pair(String value,int timestamp){
	        this.value=value;
	        this.timestamp=timestamp;
	    }
	}

// Time Comlexity is O(logN)
// Space Complexity is O(1)
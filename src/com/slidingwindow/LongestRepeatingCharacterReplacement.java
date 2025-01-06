package com.slidingwindow;
import java.util.*;

public class LongestRepeatingCharacterReplacement {
	    public int characterReplacement(String s, int k) {
	        int i=0;
	        int j=0;
	        HashMap<Character,Integer> hp=new HashMap<>();
	        int max=0;
	        int result=0;
	        while(j<s.length()){
	            hp.put(s.charAt(j),hp.getOrDefault(s.charAt(j),0)+1);
	            if(max<hp.get(s.charAt(j))){
	                max=hp.get(s.charAt(j));
	            }
	            int length=j-i+1;
	            if(length-max>k){
	                hp.put(s.charAt(i),hp.get(s.charAt(i))-1);
	                i++;
	            }
	            result=Math.max(result,j-i+1);
	            j++;
	        }
	        return result;
	    }
	}

// Time Complexity is O(s.length)
// Space Complexity is O(1)
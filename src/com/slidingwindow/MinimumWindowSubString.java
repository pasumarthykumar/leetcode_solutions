package com.slidingwindow;
import java.util.*;

public class MinimumWindowSubString {

	    public String minWindow(String s, String t) {

	        HashMap<Character,Integer> hp=new HashMap<>();
	        for(int i=0;i<t.length();i++){
	            hp.put(t.charAt(i),hp.getOrDefault(t.charAt(i),0)+1);
	        }
	        int i=0;
	        int j=0;
	        HashMap<Character,Integer> hp2=new HashMap<>();
	        int count=0;
	        int minLength=Integer.MAX_VALUE;
	        int start = 0; 
	        while(j<s.length()){
	             hp2.put(s.charAt(j),hp2.getOrDefault(s.charAt(j),0)+1);
	             while (i <= j && isContains(hp, hp2)) {
	                if (j - i + 1 < minLength) {
	                    minLength = j - i + 1;
	                    start = i;
	                }
	                char leftChar = s.charAt(i);
	                hp2.put(leftChar, hp2.get(leftChar) - 1);
	                if (hp2.get(leftChar) == 0) {
	                    hp2.remove(leftChar);
	                }
	                i++;
	             }
	        j++;
	        }
	        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
	    }
	     public static boolean isContains(HashMap<Character, Integer> superMap, HashMap<Character, Integer> subMap) {
	        for (Character key : superMap.keySet()) {
	            if (subMap.getOrDefault(key, 0) < superMap.get(key)) {
	                return false; 
	            }
	        }
	        return true;
	    }
	}

// Time Complexity is O(m+n)
// Space Complexity is O(1)


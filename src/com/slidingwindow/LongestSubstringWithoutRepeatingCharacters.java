package com.slidingwindow;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs =new HashSet<>();
        int max=1;
        if(s.length()==0){
           return 0;
        }
        for(int i=0;i<s.length();i++){
            int j=i;
            while(j<s.length()){
                if(!hs.contains(s.charAt(j))){
                    hs.add(s.charAt(j));
                    j++;
                }
                else{
                    break;
                }
                if(hs.size()>max){
                    max=hs.size();
                }
            }
            hs.clear();
        }
        return max;
    }
}

// Time Complexity is O(n^2)
// Space COmplexity is O(n)
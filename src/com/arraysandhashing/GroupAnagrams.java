package com.arraysandhashing;
import java.util.*;
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char str1[]=str.toCharArray();
            Arrays.sort(str1);
            String str2=new String(str1);
            if(hp.containsKey(str2)){
                hp.get(str2).add(str);
            }else{
                ArrayList<String> al4=new ArrayList<>();
                al4.add(str);
                hp.put(str2,al4);
            }
        } 
        return new ArrayList<>(hp.values());
    }
}


// Time Complexity is O(nlogn)
// Space Complexity is O(n)
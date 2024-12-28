package com.arraysandhashing;
import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
       if(t.length()!=s.length()){
        return false;
       } 
       HashMap<Character, Integer> hp1=new HashMap<>();
       HashMap<Character, Integer> hp2=new HashMap<>();
       for(int i=0;i<s.length();i++){
            if(!hp1.containsKey(s.charAt(i))){
                hp1.put(s.charAt(i),1);
            }else{
                hp1.put(s.charAt(i),hp1.get(s.charAt(i))+1);
            }
       }
       for(int i=0;i<t.length();i++){
            if(!hp2.containsKey(t.charAt(i))){
                hp2.put(t.charAt(i),1);
            }else{
                hp2.put(t.charAt(i),hp2.get(t.charAt(i))+1);
            }
       }
       for(char a:hp1.keySet()){
        if(!hp2.containsKey(a)){
            return false;
        }
        if (!hp1.get(a).equals(hp2.get(a))){
            return false;
        }

       }
       return true;

    }
}

// Time Complexity is O(n)
//Space Complexity is O(n)

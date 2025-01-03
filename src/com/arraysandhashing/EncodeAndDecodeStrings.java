package com.arraysandhashing;
import java.util.*;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<strs.size();i++){
           String str=strs.get(i);
           sb.append(str.length()).append('#').append(str);
       }
       return sb.toString();
   }
   public List<String> decode(String str) {
   List<String> al1=new ArrayList<>();        
   int i=0;
   while(i<str.length()){
       int delimeter=str.indexOf('#',i);
       int length = Integer.parseInt(str.substring(i, delimeter));
       String str1=str.substring(delimeter+1,delimeter+length+1);            al1.add(str1);
       i=delimeter+length+1;
       }
       return al1;
   }
       
}

// Time Complexity is O(n)
// Space Complexity is O(n)

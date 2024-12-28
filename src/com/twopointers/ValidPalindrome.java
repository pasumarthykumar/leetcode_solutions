package com.twopointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i=0;
        String ms="";
        for(int k=0;k<s.length();k++){
            if(Character.isLetterOrDigit(s.charAt(k))){
                ms=ms+s.charAt(k);
            }
        }
        ms=ms.toLowerCase();
        int j=ms.length()-1;
        while(i<j){
            if(ms.charAt(i)!=ms.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// Time Complexity is O(n)
// Space Complexity is O(n)
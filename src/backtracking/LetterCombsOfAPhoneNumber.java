package backtracking;
import java.util.*;

public class LetterCombsOfAPhoneNumber {
	    public List<String> letterCombinations(String digits) {
	        List<String> ans=new ArrayList<>();
	        if(digits.length()==0){
	            return ans;
	        }
	        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        constructCombs(digits,map,0,"",ans);
	        return ans;
	    }
	    public void constructCombs(String digits,String[] map,int currentIndex,String currentString,List<String> ans){
	        if(currentIndex==digits.length()){
	            ans.add(currentString);
	            return;
	        }
	       String letters = map[digits.charAt(currentIndex) - '0'];
	        for(int i=0;i<letters.length();i++){
	            constructCombs(digits,map,currentIndex+1,currentString+letters.charAt(i),ans);
	        }
	        return;
	    }
	}

// TIme Complexity is O(4^n)
// Space Complexity is (n*4^n)
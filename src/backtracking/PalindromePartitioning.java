package backtracking;
import java.util.*;

public class PalindromePartitioning {

	    public List<List<String>> partition(String s) {
	        List<List<String>> answer=new ArrayList<>();
	        generatePalindromes(answer,0,s.length()-1,new ArrayList<String>(),s);
	        return answer;
	    }
	    public void generatePalindromes(List<List<String>> answer,int start,int end, List<String> currentConf,String str){
	        if(start>end){
	            answer.add(new ArrayList<String>(currentConf));
	            return;
	        }

	        for(int i=start;i<=end;i++){
	            String st=str.substring(start,i+1);
	            if(palindrome(st)){
	                currentConf.add(st);
	                generatePalindromes(answer,i+1,end,currentConf,str);
	                currentConf.remove(currentConf.size()-1);
	            }
	        }
	        return;
	    }

	    public boolean palindrome(String str){
	        int i=0;
	        int j=str.length()-1;
	        while(i<=j){
	            if(str.charAt(i)==str.charAt(j)){
	                i++;
	                j--;
	                continue;
	            }else{
	                return false;
	            }
	        }
	        return true;
	    }
	}
// Time Complexity of this n*2^n
// Space Complexity of this n*2^n

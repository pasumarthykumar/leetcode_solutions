package backtracking;
import java.util.*;

public class GenerateParentheses {

	    public List<String> generateParenthesis(int n) {
	        List<String> al=new ArrayList<>();
	        generateParenthesis(al,n,0,0,"");
	        return al;
	    }
	    public void generateParenthesis(List<String> al,int n,int openCount,int closeCount,String str){
	        if(openCount==closeCount && openCount==n){
	            al.add(str);
	            return;
	        }
	        if(openCount<n){
	            generateParenthesis(al,n,openCount+1,closeCount,str+"(");
	        }
	        if(closeCount<openCount){
	            generateParenthesis(al,n,openCount,closeCount+1,str+")");
	        }
	        return;
	    }
	}

// Time 
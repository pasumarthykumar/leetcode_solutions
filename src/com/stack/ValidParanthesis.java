package com.stack;
import java.util.*;

public class ValidParanthesis {
	
	    public boolean isValid(String s) {
	    Stack<Character> stack=new Stack<>();
	    for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
	                stack.push(s.charAt(i));
	            }
	        else{
	                char ch=s.charAt(i);
	                if(stack.isEmpty()){
	                    return false;
	                }
	                char top=stack.pop();
	            if((ch==')' && top!='(') || (ch=='}' && top!='{' )|| (ch==']' && top!='[')){
	                return false;
	            }
	        }  
	    }
	    return stack.isEmpty();
	}
	}

// Time Complexity is O(n)
// SPace Complexity is O(n)
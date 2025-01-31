package com.trees;
import java.util.*;

public class ValidateBST {

	    public boolean isValidBST(TreeNode root) {
	        ArrayList<Integer> al=new ArrayList<>();
	        isBSTValid(root,al);
	        return isSorted(al);
	    }
	    public boolean isSorted(ArrayList<Integer> al){
	        for(int i=0;i<al.size();i++){
	            if(i+1==al.size()){
	                break;
	            }
	            if(al.get(i+1)>al.get(i)){
	                continue;
	            }else{
	                return false;
	            }
	        }
	        return true;

	    }
	    public void isBSTValid(TreeNode root,ArrayList<Integer> al){
	        if(root==null){
	            return;
	        }
	        isBSTValid(root.left,al);
	        al.add(root.val);
	        isBSTValid(root.right,al);
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)



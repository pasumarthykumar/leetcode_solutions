package com.trees;
import java.util.*;

public class BinaryTreeRightView {

	    public List<Integer> rightSideView(TreeNode root) {
	        
	        HashMap<Integer,Integer> hp=new HashMap<>();
	        rightView(root,hp,0);
	        ArrayList<Integer> al=new ArrayList<>(hp.values());
	        
	        return al;
	    }

	    public void rightView(TreeNode root,HashMap<Integer,Integer> hp,int currentLevel){
	        if(root==null){
	            return;
	        }
	        if(!hp.containsKey(currentLevel)){
	            hp.put(currentLevel,root.val);
	        }
	        rightView(root.right,hp,currentLevel+1);
	        rightView(root.left,hp,currentLevel+1);
	    }

	}

// Time Complexity is O(n)
// Space Complexity is O(n)
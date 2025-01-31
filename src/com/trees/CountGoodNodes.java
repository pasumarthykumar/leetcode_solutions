package com.trees;
import java.util.*;

public class CountGoodNodes {
		int count=0;
	    public int goodNodes(TreeNode root) {
	        int max=Integer.MIN_VALUE;
	        goodNodes(root,max);
	        return count;
	    }
	    public void goodNodes(TreeNode root,int max){
	        if(root==null){
	            return;
	        }
	        if(root.val>=max){
	            max=root.val;
	           count++;
	        }
	        goodNodes(root.left,max);
	        goodNodes(root.right,max);
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(1)


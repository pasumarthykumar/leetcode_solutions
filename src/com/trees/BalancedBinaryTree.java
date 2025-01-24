package com.trees;

public class BalancedBinaryTree {
	    boolean var=true;
	    public boolean isBalanced(TreeNode root) {
	        height(root);
	        return var;
	    }
	    public int height(TreeNode root){
	            if(root==null){
	                return 0;
	            }
	            int leftHeight=height(root.left);
	            int rightHeight=height(root.right);
	            if(Math.abs(leftHeight-rightHeight)>1){
	                var=false;
	            }
	            return 1+Math.max(leftHeight,rightHeight);
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(h)
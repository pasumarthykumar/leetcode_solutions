package com.trees;

public class InvertedTree {

	    public TreeNode invertTree(TreeNode root) {
	        return invertedTree(root);
	    }
	    public TreeNode invertedTree(TreeNode root) {
	        if(root==null){
	            return null;
	        }
	        TreeNode newNode=new TreeNode(root.val);
	        newNode.left=invertedTree(root.right);
	        newNode.right=invertedTree(root.left);
	        return newNode;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)

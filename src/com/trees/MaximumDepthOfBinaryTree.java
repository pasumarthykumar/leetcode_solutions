package com.trees;

public class MaximumDepthOfBinaryTree {
	
	    public int maxDepth(TreeNode root) {
	        int depth=height(root);
	        return depth;
	    }
	    public int height(TreeNode root){
	        if(root==null){
	            return 0;
	        }
	        int leftChildHeight=1+height(root.left);
	        int rightChildHeight=1+height(root.right);
	        return Math.max(leftChildHeight,rightChildHeight);
	    }
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Time Complexity is O(n)
 // Space Complexity is O(h)
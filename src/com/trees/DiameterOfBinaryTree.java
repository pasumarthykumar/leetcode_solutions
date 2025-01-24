package com.trees;

public class DiameterOfBinaryTree {

	    int maxDiameter=0;
	    
	    public int diameterOfBinaryTree(TreeNode root) {
	        height(root);
	        return maxDiameter;
	    }

	    public int height(TreeNode root){
	        if(root==null){
	            return 0;
	        }
	        int leftChild=height(root.left);
	        int rightChild=height(root.right);
	        maxDiameter=Math.max(maxDiameter,leftChild+rightChild);
	        return 1+Math.max(leftChild,rightChild);
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(1)
// Auxilary Space is O(h)
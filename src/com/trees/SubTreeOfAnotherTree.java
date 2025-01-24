package com.trees;

public class SubTreeOfAnotherTree {
	    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
	        if(root==null){
	            return false;
	        }
	        if(sameTree(root,subRoot)){
	            return true;
	        }
	        boolean leftChild=isSubtree(root.left,subRoot);
	        boolean rightChild=isSubtree(root.right,subRoot);
	        return leftChild || rightChild;
	    }
	     public boolean sameTree(TreeNode root, TreeNode subRoot){
	        if(root==null && subRoot==null){
	            return true;
	        }
	        if(root==null || subRoot==null){
	            return false;
	        }
	        if(root.val!=subRoot.val){
	            return false;
	        }
	        return sameTree(root.left,subRoot.left) && sameTree(root.right,subRoot.right);
	     }
	}

// Time Complexity is O(n*m);
// Space Complexity is O(h)

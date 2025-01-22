package com.trees;

public class SameTree {

	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        return isSamTree(p,q);
	    }
	    public boolean isSamTree(TreeNode p, TreeNode q){
	        if(p!=null && q==null){
	            return false;
	        }
	        if(q!=null && p==null){
	            return false;
	        }
	        if(p==null && q==null){
	            return true;
	        }
	        if(p.val!=q.val){
	            return false;
	        }
	        boolean leftChild=isSamTree(p.left,q.left);
	        boolean rightChild=isSamTree(p.right,q.right) ;
	        return leftChild && rightChild;
	    }
	}

// Time Complexity is O(n);
// Space Complexity is O(h)

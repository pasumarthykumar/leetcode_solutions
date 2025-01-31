package com.trees;

public class LowestCommonAncestor {

	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        return lowestComAncestor(root,p,q);
	    }
	    public TreeNode lowestComAncestor(TreeNode root, TreeNode p, TreeNode q){
	        if(root==null){
	            return null;
	        }
	        if(root.val == p.val || root.val == q.val){
	            return root;
	        }
	        TreeNode leftAns=lowestComAncestor(root.left,p,q);
	        TreeNode rightAns=lowestComAncestor(root.right,p,q);
	        if(leftAns!=null && rightAns!=null){
	            return root;
	        }
	        if(leftAns!=null){
	            return leftAns;
	        }
	        if(rightAns!=null){
	            return rightAns;
	        }
	        return null;
	    }
	}

// Time Complexity is O(n)
// Space Complexity is O(h)


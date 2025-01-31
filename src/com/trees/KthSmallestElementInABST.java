package com.trees;
import java.util.*;

public class KthSmallestElementInABST {

	    public int kthSmallest(TreeNode root, int k) {
	         ArrayList<Integer> al=new ArrayList<>();
	         isBSTValid(root,al);
	         return al.get(k-1);
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
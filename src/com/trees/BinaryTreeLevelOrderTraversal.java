package com.trees;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {

	    public List<List<Integer>> levelOrder(TreeNode root) {
	         Queue<TreeNode> queue=new LinkedList<>();
	         queue.add(root);
	         List<List<Integer>> al=new ArrayList<>();
	         if (root == null) return al;
	         while(!queue.isEmpty()){
	            ArrayList<Integer> al1=new ArrayList<>();
	            int currentSize=queue.size();
	            while(currentSize>0){
	                TreeNode element=queue.remove();
	                al1.add(element.val);
	                currentSize--;
	                if(element.left!=null)
	                    queue.add(element.left);
	                if(element.right!=null)
	                    queue.add(element.right);
	            }
	            al.add(al1);
	            }
	            return al;
	        }
	}

// Time Complexity is O(n)
// Space Complexity is O(n)

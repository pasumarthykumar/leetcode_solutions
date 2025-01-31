package com.trees;

public class ConstructBinaryTreeFromInOrderAndPreOrder {

	    int count=0;
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return constructTree(preorder,inorder,0,inorder.length-1);
	    }
	    public TreeNode constructTree(int[] preorder, int[] inorder,int inStart,int inEnd){
	        if(count>=preorder.length || inStart>inEnd){
	            return null;
	        }
	        TreeNode newNode=new TreeNode(preorder[count]);
	        int val=preorder[count];
	        int i=0;
	        for(i=inStart;i<inEnd;i++){
	            if(val==inorder[i]){
	                break;
	            }
	        }
	        count++;
	        
	        newNode.left=constructTree(preorder,inorder,inStart,i-1);
	        newNode.right=constructTree(preorder,inorder,i+1,inEnd);
	        return newNode;
	    }

	}

// Time Complexity is O()
// Space Complexity is O(n)
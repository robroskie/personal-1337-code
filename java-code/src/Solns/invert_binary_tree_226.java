package Solns;

import Generic_Classes.TreeNode;

public class invert_binary_tree_226 {
	class Solution {
	    public TreeNode invertTree(TreeNode root) {
//	    	Base case occurs when traverse to a null element
	        if(root == null)
	            return root;
	        
//	        Swap the left and right child nodes
	        TreeNode left_temp = root.left;
	        root.left = root.right;
	        root.right = left_temp;
	        
//	        Recursively perform the algorithm on the left and right children
	        invertTree(root.left);
	        invertTree(root.right);
	        
	        return root;
	    }
	}
}

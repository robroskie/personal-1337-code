package Solns;

public class maximum_depth_of_binary_tree_104 {

//	  Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int maxDepth(TreeNode root) {
		// If the current node is null, return 0 since it won't contribute to the max depth 
		if(root == null)
            return 0;
        
		// Otherwise traverse left and then right nodes 		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		// Take the max of the results of the left and right recursive calls and add 1
		return Math.max(left, right) + 1;
	}

	public static void main(String[] args) {
		
	}

}

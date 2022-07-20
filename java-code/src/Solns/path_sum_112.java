package Solns;

import Generic_Classes.TreeNode;

public class path_sum_112 {

	public boolean hasPathSum(TreeNode root, int targetSum) {

		if (root.left == null && root.right == null) {
			if (root.val == targetSum)
				return true;
			return false;
		}
		targetSum -= root.val;
		if (root.left != null)
			hasPathSum(root.left, targetSum);
		if (root.right != null)
			hasPathSum(root.right, targetSum);
		return false;
	}

	public static void main(String[] args) {

	}

}

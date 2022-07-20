package Solns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Generic_Classes.TreeNode;



 class minimum_depth_of_binary_tree_111 {
	// Definition for a binary tree node.



	public static int minDepth(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<Integer> list = new LinkedList<Integer>();

		int minDepth = 0;

		if (root == null) {
			return 0;
		}

		q.add(root);

		while (!q.isEmpty()) {

			int size = q.size();

			for (int i = 0; i < size; i++) {
				TreeNode current = q.poll();
				list.add(current.val);

				if (current.left == null && current.right == null)
					return minDepth;

				if (current.left != null)
					q.add(current.left);
				if (current.right != null)
					q.add(current.right);

			}

			minDepth++;

		}

		return -1;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		System.out.println("Tree Minimum Depth: " + minDepth(root));
		root.left.left = new TreeNode(9);
		root.right.left.left = new TreeNode(11);
		System.out.println("Tree Minimum Depth: " + minDepth(root));
	}

}

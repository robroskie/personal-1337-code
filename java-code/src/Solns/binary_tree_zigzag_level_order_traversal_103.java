package Solns;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class binary_tree_zigzag_level_order_traversal_103 {
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();

		List<List<Integer>> return_list = new LinkedList<List<Integer>>();

		if (root == null) {
			return return_list;
		}

		q.add(root);
		
		boolean odd = true;
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> temp_list = new LinkedList<>();
			
			for(int i = 0; i < size; i++) {
				TreeNode currentNode = q.poll();
				
				if(odd)
					temp_list.add(currentNode.val);
				else
					temp_list.add(0, currentNode.val);
				
				if (currentNode.left != null)
					q.add(currentNode.left);
				if (currentNode.right != null)
					q.add(currentNode.right);
	
			}
		
			return_list.add(temp_list);
			if(odd)
				odd = false;
			else
				odd =true;
			
		}
		return return_list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);

		System.out.println(zigzagLevelOrder(root));
	}
}

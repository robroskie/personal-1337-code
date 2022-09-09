package BFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class binary_tree_level_order_traversal_102a2 {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			List<Integer> temp = new ArrayList<>();
			
			for(int i = 0; i < size; i++) {
				TreeNode current = q.poll();
				
				temp.add(current.val);
				
				if(current.left != null) 
					q.add(current.left);
				if(current.right != null)
					q.add(current.right);
			}
			list.add(temp);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);

		System.out.println(levelOrder(root));
	}

}







package BFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class binary_tree_level_order_traversal_102 {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> toReturn = new ArrayList<>();
		if(root == null) {
			return toReturn;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> temp = new ArrayList<>();

			for(int i = 0; i < size; i++){
				TreeNode current = q.poll();
				temp.add(current.val);
				
				if(current.left != null)
					q.add(current.left);
				if(current.right != null)
					q.add(current.right);
			}
			toReturn.add(temp);
		}
		
		return toReturn;
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








//public static List<List<Integer>> levelOrder(TreeNode root) {
//	Queue<TreeNode> q = new LinkedList<>();
//
//	List<List<Integer>> return_list = new LinkedList<List<Integer>>();
//
//	if (root == null) {
//		return return_list;
//	}
//
//	q.add(root);
//
//	while (!q.isEmpty()) {
//		int sizeList = q.size();
//
//		List<Integer> temp_list = new LinkedList<Integer>();
//
//		for (int i = 0; i < sizeList; i++) {
//			TreeNode currentNode = q.poll();
//
//			temp_list.add(currentNode.val);
//			if (currentNode.left != null)
//				q.add(currentNode.left);
//			if (currentNode.right != null)
//				q.add(currentNode.right);
//		}
//		return_list.add(temp_list);
//	}
//	return return_list;
//}
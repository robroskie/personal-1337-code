package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs_algorithm {

	
	public static List<List<Integer>> traverse(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
				
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		
		q.add(root);
		
		while(!q.isEmpty()) {
			List<Integer> temp = new ArrayList<Integer>();
			
			int size = q.size();
			
			for(int i = 0; i < size; i++) {
				TreeNode curr = q.poll();
				temp.add(curr.val);
				
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
			result.add(temp);
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(5);
		List<List<Integer>> result = traverse(root);
		System.out.println("Level order traversal: " + result);
	}

}

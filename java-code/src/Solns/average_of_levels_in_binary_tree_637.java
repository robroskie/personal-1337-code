package Solns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Generic_Classes.TreeNode;

public class average_of_levels_in_binary_tree_637 {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> toReturn = new ArrayList<Double>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);

        while(!q.isEmpty()) {
        	int size = q.size();
        	double calcValue = 0;

			List<Double> temp_list = new LinkedList<Double>();
        
        	for(int i = 0; i < size; i++) {
            	TreeNode currentNode = q.poll();
            	calcValue += currentNode.val;
            	
				if (currentNode.left != null)
					q.add(currentNode.left);
				if (currentNode.right != null)
					q.add(currentNode.right);
				
				temp_list.add(calcValue);
        	}
        	toReturn.add(calcValue / size);
        	
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

		System.out.println(averageOfLevels(root));
	}
}

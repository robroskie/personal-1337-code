/**
 * Simple DFS recursive solution
 */



public class maximum_depth_of_binary_tree_104 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public static void main(String[] args) {

	}
	
    public int maxDepth(TreeNode root) {
    
    	if(root == null)
    		return 1;
    	
    	return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

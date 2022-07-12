package DFS;

public class path_sum_112 {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        
    	if(root == null)
    		return false;
    	
    	boolean left = root.left != null;
    	boolean right = root.right != null;
    	
    	System.out.println(left);
    	System.out.println(right);
    	System.out.println(targetSum + ",    " + root.val);
    	System.out.println();
    	
    	if(!left && !right && root.val == targetSum) {
    		return true;
    	}
    	
    	targetSum -= root.val;
    	

		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    		
    		
    	
    	
    
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path: " + hasPathSum(root, 23));
        System.out.println("Tree has path: " + hasPathSum(root, 16));
      }
    
}

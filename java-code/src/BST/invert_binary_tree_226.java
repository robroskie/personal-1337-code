package BST;

public class invert_binary_tree_226 {
    public TreeNode invertTree(TreeNode root) {
    	if(root == null)
    		return root;
    	
    	TreeNode temp = root.left;
    	root.left = root.right;
    	root.right = temp;
    	
    	invertTree(root.left);
		invertTree(root.right);
		
		return root;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        
        System.out.println(root.toString());
      }
    
}

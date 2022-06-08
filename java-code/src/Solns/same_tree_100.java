package Solns;

public class same_tree_100 {
    // Base cases      
    // Both trees are empty, return true
    if(p == null && q == null)
        return true;
    
    // One but not both of the trees are empty (and therefore the two trees are not the same)
    else if(p == null || q == null)
        return false;
    
    // Both trees contain values however the values are not the same 
    else if(p.val != q.val)
        return false;
    
    // Recursively call and if returned values for left and right components of each respective tree are the same, return true
    // If they differ, return false
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

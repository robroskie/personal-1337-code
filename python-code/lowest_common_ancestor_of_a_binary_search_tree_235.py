from typing import Optional, List

class TreeNode:
  def __init__(self, val):
    self.val = val
    self.left, self.right = None, None


def lowestCommonAncestor(root, p, q):
    minVal = min(p.val, q.val)
    maxVal = max(p.val, q.val)

    while root:
        # If both values are smaller than the current node, traverse the left subtree
        if(minVal < root.val):
            root = root.left
        # If both valueare grater than the current node, traverse the right subtree
        elif(maxVal > root.val):
            root = root.right
        else:
        # If smaller value is in left subtree and larger value is in right subtree, the current node is the LCA
            return root.val




def main():
    root = TreeNode(6)
    root.left = TreeNode(2)
    root.right = TreeNode(8)


    root.left.left = TreeNode(0)
    root.left.right = TreeNode(4)

    root.right.left = TreeNode(7)
    root.right.right = TreeNode(9)


    p = TreeNode(2)
    q = TreeNode(8)

    print(lowestCommonAncestor(root, p, q))


main()
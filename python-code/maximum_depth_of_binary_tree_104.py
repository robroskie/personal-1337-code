class TreeNode:
  def __init__(self, val):
    self.val = val
    self.left, self.right = None, None



def maxDepth(root):
    if(root == None):
        return 0

    return 1 + max(maxDepth(root.left), maxDepth(root.right))

def main():
    root = TreeNode(12)
    root.left = TreeNode(7)
    root.right = TreeNode(1)
    root.left.left = TreeNode(9)
    root.right.left = TreeNode(10)
    root.right.right = TreeNode(5)
    print(maxDepth(root))


main()


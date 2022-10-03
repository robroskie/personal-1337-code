from TreeNode import TreeNode


def inorderTraversal(root):
    res = []
    if root:
        res.append([inorderTraversal(root.left)] + [inorderTraversal(root.left)] + [inorderTraversal(root.right)])
    return res



def main():
    root = TreeNode(5)
    root.left = TreeNode(3)
    root.right = TreeNode(6)
    root.left.left = TreeNode(2)
    root.left.right = TreeNode(4)
    root.left.left.left = TreeNode(1)
    print(inorderTraversal(root))



main()


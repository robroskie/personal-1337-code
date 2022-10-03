from TreeNode import TreeNode


def kthSmallest(root, K):
    if not root.left:
        return root.val

    if not root.right:
        return root.val

    return [kthSmallest(root.left, K)] + [root.val] + [kthSmallest(root.right, K)]

    # return [kthSmallest(root.left, K)] + [root.val] + [kthSmallest(root.right, K)]





def main():
    root = TreeNode(5)
    root.left = TreeNode(3)
    root.right = TreeNode(6)
    root.left.left = TreeNode(2)
    root.left.right = TreeNode(4)
    root.left.left.left = TreeNode(1)
    print(kthSmallest(root, 3))



main()


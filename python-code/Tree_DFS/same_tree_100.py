import TreeNode as T3


def isSameTree(p, q):
    print('p = {}   q = {}'.format(p.val,q.val))
    if not p and not q:
        return True
    elif not p or not q:
        return False

    elif p.val != q.val:
        return False

    return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)



def main():
    print('hi')
    root1 = T3.TreeNode(1)
    root1.left = T3.TreeNode(2)
    # root1.right = T3.TreeNode(3)

    root2 = T3.TreeNode(1)
    root2.left = T3.TreeNode(None)
    root2.right = T3.TreeNode(3)

    print("same tree ? " + str(isSameTree(root1,root2)))

main()

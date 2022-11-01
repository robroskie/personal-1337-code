
import TreeNode as T3


def isSameTree(p, q):
    # print('p = {}   q = {}'.format(p.val,q.val))
    if not p and not q:
        return True
    elif not p or not q:
        return False

    elif p.val != q.val:
        return False

    return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)

def isSubtree(root, subRoot) -> bool:
    print(root)
    if root == None:
        return False


    if isSameTree(root, subRoot):
        return True

    return isSubtree(root.left, subRoot) or isSubtree(root.right, subRoot)

def main():
    print('hi')
    root1 = T3.TreeNode(3)
    root1.left = T3.TreeNode(4)
    root1.right = T3.TreeNode(5)
    root1.left.left = T3.TreeNode(1)
    root1.left.right = T3.TreeNode(2)

    root2 = T3.TreeNode(4)
    root2.left = T3.TreeNode(1)
    root2.right = T3.TreeNode(2)

    print(isSubtree(root1, root2))

main()

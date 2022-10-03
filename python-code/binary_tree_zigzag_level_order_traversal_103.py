class TreeNode:
  def __init__(self, val):
    self.val = val
    self.left, self.right = None, None


def zigzagLevelOrder(root):
    list = []

    if not root:
        return list

    queue = [root]

    even = False

    while queue:
        even = not even
        temp = []
        size = len(queue)

        for i in range(size):
            curr = queue.pop(0)

            if even:
                temp.append(curr.val)
            else:
                temp.insert(0, curr.val)

            if curr.left:

                queue.append(curr.left)
            if curr.right:
                queue.append(curr.right)

        list.append(temp)

    return list

def main():
    root = TreeNode(12)
    root.left = TreeNode(7)
    root.right = TreeNode(1)
    root.left.left = TreeNode(9)
    root.right.left = TreeNode(10)
    root.right.right = TreeNode(5)
    result = zigzagLevelOrder(root)

    print(result)

main()

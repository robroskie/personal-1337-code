from typing import Optional, List

class TreeNode:
  def __init__(self, val):
    self.val = val
    self.left, self.right = None, None


def levelOrderBottom(root):
    queue = []

    queue.append(root)

    list = []

    while(len(queue) != 0):
        size = len(queue)

        temp = []
        for i in range(size):
            current = queue.pop(0)
            temp.append(current.val)

            if(current.left != None):
                queue.append(current.left)
            if(current.right != None):
                queue.append(current.right)

        list.insert(0, temp)

        print('\n')

    print(list)
    return -1



def main():
    root = TreeNode(12)
    root.left = TreeNode(7)
    root.right = TreeNode(1)
    root.left.left = TreeNode(9)
    root.right.left = TreeNode(10)
    root.right.right = TreeNode(5)
    levelOrderBottom(root)


main()


import sys
from collections import deque
import TreeNode as T3



def minDepth(root):
    if not root:
        return 0

    minVal = 0

    queue = deque()
    queue.append(root)

    while(queue):
        size = len(queue)

        for i in range(0, size):
            print('loop')
            print('size {}'.format(size))
            curr = queue.pop()
            print(curr.val)

            if curr.left == None and curr.right == None:
                print('found smallest val' + str(minVal))
                return minVal

            if curr.left != None:
                queue.appendleft(curr.left)
            if curr.right != None:
                queue.appendleft(curr.right)

            minVal += 1


    return minVal







def main():
    print('hi')
    root = T3.TreeNode(1)
    root.left = T3.TreeNode(2)
    root.right = T3.TreeNode(3)
    root.left.left = T3.TreeNode(4)
    root.left.right = T3.TreeNode(5)
    print("min depth is" + str(minDepth(root)))


main()

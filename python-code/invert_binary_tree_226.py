from typing import Optional, List

class TreeNode:
  def __init__(self, val):
    self.val = val
    self.left, self.right = None, None


def invertTree(root):
    if root == None:
        return None

    temp = None
    print(temp)

    temp = root.right
    root.right = root.left
    root.left = temp

    if(root.left != None):
        invertTree(root.left)
    if(root.right != None):
        invertTree(root.right)

    return root


# Function to  print level order traversal of tree
def printLevelOrder(root):
    h = height(root)
    for i in range(1, h + 1):
        printCurrentLevel(root, i)


# Print nodes at a current level
def printCurrentLevel(root, level):
    if root is None:
        return
    if level == 1:
        print(root.val, end=" ")
    elif level > 1:
        printCurrentLevel(root.left, level - 1)
        printCurrentLevel(root.right, level - 1)


def height(node):
    if node is None:
        return 0
    else:
        # Compute the height of each subtree
        lheight = height(node.left)
        rheight = height(node.right)

        # Use the larger one
        if lheight > rheight:
            return lheight + 1
        else:
            return rheight + 1

def main():
    root = TreeNode(12)
    root.left = TreeNode(7)
    root.right = TreeNode(1)
    root.left.left = TreeNode(9)
    root.right.left = TreeNode(10)
    root.right.right = TreeNode(5)
    tree2 = invertTree(root)
    printLevelOrder(tree2)
main()

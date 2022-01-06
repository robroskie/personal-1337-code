# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right






class Solution(object):
    def invertTree(self, root):
        temp = self.left
        self.right = temp

    t1 = TreeNode([3,9,20,None,None,15,7])
        

    t2 = invertTree(t1)



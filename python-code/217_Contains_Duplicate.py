

def containsDuplicate(lst):

    nums = set()

    for i in lst:
        if i in nums:
            return True
        nums.add(i)

    return False


lst = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
containsDuplicate(lst)
def sortedSquares(nums):
#   If list is empty
    if len(nums) == 0:
        return []

    left = 0
    right = len(nums) - 1
    newNums = []

    while right >= left:
        print('loop')
        if abs(nums[right]) > abs(nums[left]):
            newNums.insert(0, nums[right]**2)
            right -= 1
        else:
            newNums.insert(0, nums[left]**2)
            left += 1

    print(newNums)


def main():
    a = [0, 1, 9, 16, 100]

    # print(sortedSquares(a))

    b = [-7, -3, -2, -1]
    # print(sortedSquares(b))

    c = [-10, -8, -7, -2, 0, 1, 3, 4, 7, 9]
    # sortedSquares(c)

    d = [-4,-1,0,3,10]
    sortedSquares(d)

main()
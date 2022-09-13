class Solution:
    def missingNumber(self, nums) -> int:
        sums = 0
        for i in range(len(nums) + 1):
            sums += i
            print(sums)

        return sums - sum(nums)

    n = [9,6,4,2,3,5,7,0,1]
    print(missingNumber(0, n))
class Solution:
    def hammingWeight(n: int) -> int:
        count = 0

        while(n > 0):
            if(n % 2 != 0):
                count = count + 1
            n =  n >> 1


        return count

n = 0o000001011111
k = Solution.hammingWeight(n)

print(k)
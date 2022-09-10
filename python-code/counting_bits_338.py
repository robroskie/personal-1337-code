from typing import List


class Solution:
    def hammingWeight(n: int) -> int:
        count = 0

        while(n > 0):
            if(n % 2 != 0):
                count = count + 1
            n =  n >> 1


        return count


    def countBits(self, n: int) -> List[int]:
        result = []

        for i in range(0, n + 1):
            print('for i =' + str(i))
            count = 0
            while(i > 0):
                if (i % 2 != 0):
                    count = count + 1
                i = i >> 1
            print('appending' + str(count))
            result.append(count)

        return result


n = 5
k = Solution.countBits(0, n)

print(k)
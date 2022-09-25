from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if(len(prices) <= 1):
            return 0
        left = 0
        maxProfit = prices[1] - prices[left]

        for right in range(1, len(prices)):
            if(prices[right] - prices[left] < 0 and right - left >= 2 or right == len(prices) - 1):
                print('increment left')
                left += 1
            else:
                print('increment right')
                right += 1

            maxProfit = max(prices[right] - prices[left], maxProfit)
        print(maxProfit)
        return maxProfit


    prices = [7,6,4,3,1]
    maxProfit(0, prices)
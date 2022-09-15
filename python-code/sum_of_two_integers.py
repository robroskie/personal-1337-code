class Solution:
    def getSum(self, a: int, b: int) -> int:


        while(b  != 0):
            temp = (a & b) << 1
            a = a ^ b
            b = temp


        print(bin(b))
        return b



    getSum(0, 9, 11)
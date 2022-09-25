class Solution:
    def getSum(self, a: int, b: int) -> int:
        xorOP = a ^ b
        andOP = (a & b) << 1

        while(andOP != 0):
            temp = xorOP
            xorOP = andOP ^ xorOP
            andOP = (temp & andOP) << 1


            print(bin(xorOP))
            print(bin(andOP))

    getSum(0, -1, 1)
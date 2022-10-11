class Solution:
    def reverse(self, x: int) -> int:
        isneg = -1 if x < 0 else 1
        x = abs(x)
        num = 0
        while x:
            num *= 10
            num += (x%10)
            x //= 10
            if not (-2**31 <= num <2**31):
                return 0
        return num*isneg

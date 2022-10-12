class Solution:
    def romanToInt(self, s: str) -> int:
        d = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        ans = d[s[0]]
        for i in range(1,len(s)):
            ans += d[s[i]]
            if s[i-1] == "I" and (s[i] == "V" or s[i] == "X"):
                ans -= 2
            elif s[i-1] == "X" and (s[i] == "L" or s[i] == "C"):
                ans -= 20
            elif s[i-1] == "C" and (s[i] == "D" or s[i] == "M"):
                ans -= 200
        return ans

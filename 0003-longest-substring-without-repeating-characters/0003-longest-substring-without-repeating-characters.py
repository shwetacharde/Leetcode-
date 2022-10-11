class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        chars = [0]*256
        m = 0
        i = 0
        for j,char in enumerate(s):
            chars[ord(char)] += 1
            while chars[ord(char)] > 1:
                chars[ord(s[i])] -= 1
                i += 1
            m = max(j-i+1, m)
        return m
class Solution:
    def maxArea(self, height: List[int]) -> int:
        m = 0
        i, j = 0, len(height)-1
        while i < j:
            m = max((j-i)*min(height[i], height[j]), m)
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return m

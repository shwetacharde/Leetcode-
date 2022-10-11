class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = len(nums)
        i = 0
        while i < l-1:
            if nums[i] == nums[i+1]:
                del nums[i]
                l -= 1
                i -= 1
            i += 1
        return l

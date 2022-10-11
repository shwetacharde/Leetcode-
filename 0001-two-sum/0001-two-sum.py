class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = {}
        for i,num in enumerate(nums):
            l[num] = i
        for i,num in enumerate(nums):
            if (target - num) in l:
                if l[target - num] == i:
                    continue
                return [i, l[target - num]]
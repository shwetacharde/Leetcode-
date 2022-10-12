class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l,h = 0,len(nums)-1
        m = (l+h)//2
        while l <= h:
            if nums[l] == target:
                return l
            if nums[h] == target:
                return h
            if nums[m] == target:
                return m
            elif nums[l] < nums[m]:
                if nums[l] < target < nums[m]:
                    h = m-1
                else:
                    l = m+1
            else:
                if nums[m] < target < nums[h]:
                    l = m+1
                else:
                    h = m-1
            m = (l+h)//2
        return -1
                    
                    
                

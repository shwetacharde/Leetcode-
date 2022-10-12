class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        ans = []
        l, r = 0,len(nums)-1 # 0, 5
        while l <= r:
            m = (l+r)//2 # 4 (3,3)
            if nums[m] == target:
                if m == 0 or nums[m-1] != target:
                    ans.append(m)
                    break
                else:
                    r = m-1
            elif nums[m] < target:
                l = m+1
            else:
                r = m-1
            # print(ans)
        if len(ans) != 1:
            return [-1,-1]
        
        l,r = 0,len(nums)-1
        while l <= r:
            m = (l+r)//2
            if nums[m] == target:
                if m == len(nums)-1 or nums[m+1] != target:
                    ans.append(m)
                    break
                else:
                    l = m+1
            elif nums[m] < target:
                l = m+1
            else:
                r = m-1
        return ans

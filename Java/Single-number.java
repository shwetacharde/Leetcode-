class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums)
            res ^= num;
        return res;
    }
}

// problem link: https://leetcode.com/problems/single-number/
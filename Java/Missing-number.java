class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int n = nums.length;
        for(int num : nums)
            actualSum += num;
        int expectedSum = (n * (n+1))/2;
        return expectedSum - actualSum;
    }
}

// problem link: https://leetcode.com/problems/missing-number/
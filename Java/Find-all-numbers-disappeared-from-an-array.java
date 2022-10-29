class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = Math.abs(nums[index]) * -1;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0)
                res.add(i+1);
        }
        return res;
    }
}

// problem link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
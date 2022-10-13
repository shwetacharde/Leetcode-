class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        int i=0;
        for(int p: nums){
            set.add(p);
        }
        i=0;
        for(int p:set){
            nums[i++]=p;
        }
        return set.size();
    }
}

// Question: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

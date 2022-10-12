class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,prev=r;
        int sq[]=new int[r+1];
        while(l<=r){
            if(nums[l]*nums[l]>nums[r]*nums[r]){
                sq[prev--]=nums[l]*nums[l];
                l++;
            }else{
                sq[prev--]=nums[r]*nums[r];
                r--;
            }
        }
        return sq;
    }
}

// Question Link: https://leetcode.com/problems/squares-of-a-sorted-array/
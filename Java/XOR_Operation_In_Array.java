class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            c^=nums[i];
        }
        return c;
    }
}

// Question: https://leetcode.com/problems/xor-operation-in-an-array/

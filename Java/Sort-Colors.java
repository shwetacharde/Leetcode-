class Solution {
    public void sortColors(int[] nums) {
        // Two pointers Approach
        int start=0,end=nums.length-1,i=0;
        if(end==0) return;
        while(i<=end){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                start++;i++;
            }else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[end];
                nums[end]=temp;
                end--;
            }else{
                i++;
            }
        }
    }
}


// Question Link: https://leetcode.com/problems/sort-colors/
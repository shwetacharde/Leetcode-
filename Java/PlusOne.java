class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int i=n-1;
        int a=0;
        while(i>=0){
            if(digits[i]!=9){
                digits[i]+=1;
                break;
            }else{
                if(i==0 && digits[i]==9){
                    a++;
                }
                digits[i]=0;
                i--;
            }
        }
        if(a==0)
        return digits;
        else{
            int arr[]=new int[n+1];
            arr[0]=1;
            return arr;
        }
    }
}

// Question: https://leetcode.com/problems/plus-one/

class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1) return "";
        char ch[]=palindrome.toCharArray();
        int n = palindrome.length();
        int index = -1;
        for(int i = 0; i < n/2; i++){
            if(ch[i]!='a'){
                index = i;
                ch[i] = 'a';
                break;
            }
        }
        if(index == -1){
            ch[n-1] = 'b';
        }
        return new String(ch);   
    }
}

// Question Link : https://leetcode.com/problems/break-a-palindrome/
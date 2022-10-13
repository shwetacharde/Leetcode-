class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i);
            if(a>=65 && a<=90){
                a=a+32;
                sb.append((char)a);
            }else if(a>=97 && a<=122){
                sb.append((char)a);
            }else if((s.charAt(i)-'0')>=0 && (s.charAt(i)-'0')<=9 ){
                sb.append(s.charAt(i));
            }else
                continue;
        }
        int m=0,n=sb.length()-1;
        while(m<n){
            if(sb.charAt(m)==sb.charAt(n)){
                m++;n--;
            }else
                return false;
        }
        return true;
    }
}

// Question: https://leetcode.com/problems/valid-palindrome/

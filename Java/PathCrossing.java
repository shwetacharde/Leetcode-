class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> st=new HashSet<>();
        int x=0,y=0;
        st.add(x+","+y);
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N') y++;
            else if(path.charAt(i)=='S') y--;
            else if(path.charAt(i)=='E') x++;
            else x--;
            if(st.contains(x+","+y)) return true;
            st.add(x+","+y);
        }
        return false;
    }
}

// Question: https://leetcode.com/problems/path-crossing/

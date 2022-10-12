class Solution {
public:
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
        int m=heights.size(), n=heights[0].size();
        vector<vector<bool>>pacific(m,vector<bool>(n,false));
        vector<vector<bool>>atlantic(m,vector<bool>(n,false));
        for(int i=0;i<m;i++) dfs(heights,pacific,i,0,m,n);
        for(int j=0;j<n;j++) dfs(heights,pacific,0,j,m,n);
        for(int i=0;i<m;i++) dfs(heights,atlantic,i,n-1,m,n);
        for(int j=0;j<n;j++) dfs(heights,atlantic,m-1,j,m,n);
        vector<vector<int>>soln;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) 
                if(pacific[i][j] && atlantic[i][j])
                    soln.push_back(vector<int>{i,j});
        }
        return soln;
    }

     // starting from the sea to find all the cells that can be accessed
    void dfs(vector<vector<int>>&height,vector<vector<bool>>&vis,int x,int y,int m,int n){
        if(vis[x][y]) return;
        vis[x][y]=true;
        if(x+1<m && height[x+1][y]>=height[x][y]) dfs(height,vis,x+1,y,m,n);
        if(x-1>=0 && height[x-1][y]>=height[x][y]) dfs(height,vis,x-1,y,m,n);
        if(y+1<n && height[x][y+1]>=height[x][y]) dfs(height,vis,x,y+1,m,n);
        if(y-1>=0 && height[x][y-1]>=height[x][y]) dfs(height,vis,x,y-1,m,n);
    }
};

// Question Link: https://leetcode.com/problems/pacific-atlantic-water-flow/

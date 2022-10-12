class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m=matrix.size(),n=matrix[0].size();
        int row=0,col=0;
        vector<int>soln;
        while(row<m && col<n){
            if(row>=m || col>=n) break;
            for(int j=col; j<n;j++) soln.push_back(matrix[row][j]);
            row++;
            if(row>=m || col>=n) break;
            for(int i=row;i<m;i++) soln.push_back(matrix[i][n-1]);
            n--;
            if(row>=m || col>=n) break;
            for(int j=n-1;j>=col;j--) soln.push_back(matrix[m-1][j]);
            m--;
            if(row>=m || col>=n) break;
            for(int i=m-1;i>=row;i--) soln.push_back(matrix[i][col]);
            col++;
        }
        return soln;
    }
};

// Question Link: https://leetcode.com/problems/spiral-matrix/
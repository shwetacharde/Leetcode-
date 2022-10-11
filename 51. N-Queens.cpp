class Solution {
public:
    vector<vector<string>>soln;
    vector<pair<int,int>> fill_board(vector<vector<string>>&board,int row,int col, int n,string to_fill){
        vector<pair<int,int>> leave;
        // Vertical filling 
        for(int i=row+1;i<n;i++){ 
            if(board[i][col]!=to_fill){
                board[i][col]=to_fill;
                leave.push_back({i,col});
            }
        }
        for(int i=0;i<row;i++){ 
            if(board[i][col]!=to_fill){
                board[i][col]=to_fill;
                leave.push_back({i,col});
            }
        }
        // Horizontal filling
        for(int j=col+1;j<n;j++){ 
            if(board[row][j]!=to_fill){
                board[row][j]=to_fill;
                leave.push_back({row,j});
            }
        }
        for(int j=0;j<col;j++){ 
            if(board[row][j]!=to_fill){
                board[row][j]=to_fill;
                leave.push_back({row,j});
            }
        }
        // Top_Left->Bottom_right diagonal
        int x=row+1,y=col+1;
        while(x<n && y<n){
            if(board[x][y]!=to_fill){
                board[x][y]=to_fill;
                leave.push_back({x,y});
            }
            x++;y++;
        }
        x=row-1,y=col-1;
        while(x>=0 &&y>=0){
            if(board[x][y]!=to_fill){
                board[x][y]=to_fill;
                leave.push_back({x,y});
            }
            x--;y--;
        }
        // Bottom_Left->Top_right diagonal
        x=row-1,y=col+1;
        while(x>=0 && y<n){
            if(board[x][y]!=to_fill){
                board[x][y]=to_fill;
                leave.push_back({x,y});
            }
            x--;y++;
        }
        x=row+1,y=col-1;
        while(x<n && y>=0){
            if(board[x][y]!=to_fill){
                board[x][y]=to_fill;
                leave.push_back({x,y});
            }
            x++;y--;
        }
        return leave;
    }   
    
    void remove_board(vector<vector<string>>&board,string to_fill,vector<pair<int,int>> change){
        for(auto &x:change){
            board[x.first][x.second]=to_fill;
        }
    }
    
    void rec(int qp, int n,vector<vector<string>>board){
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++) cout<<board[i][j];
        //     cout<<endl;
        // }cout<<endl;
        
        // Base Case all Queens are Placed
        if(qp==n){
            vector<string>string_board;
            for(int i=0;i<n;i++){
                string s="";
                for(int j=0;j<n;j++) s+=board[i][j];
                string_board.push_back(s);
            }
            soln.push_back(string_board);
            return;
        }
        // Base Case 2 all the row is filled
        bool val=true;
        for(int j=0;j<n;j++){ 
            if(board[qp][j]!="."){
                val=false;
                break;
            }
        }
        if(val==true) return;
            
        // Hypothesis 
        for(int j=0;j<n;j++){
            if(board[qp][j]=="x"){
                board[qp][j]="Q";
                // fill the dots as per queens placed
                vector<pair<int,int>> change;
                change = fill_board(board,qp,j,n,".");
                rec(qp+1,n,board);
                // backtrack
                remove_board(board,"x",change);
                board[qp][j]="";
            }
        }
    }
    
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>>board(n,vector<string>(n,"x"));
        rec(0,n,board);
        return soln;
    }
};

// Questiion Link: https://leetcode.com/problems/n-queens/
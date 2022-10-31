class Solution {
public:
    int mincost(vector<vector<int>>& dp,vector<vector<int>>& cost,int i,int j,int m,int n)
    {
        if(i == m && j == n)
        {
            return cost[i][j];
        }
        if(i > m || j > n)
        {
            return INT_MAX;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        return dp[i][j] = (cost[i][j]+min(mincost(dp,cost,i+1,j,m,n),mincost(dp,cost,i,j+1,m,n)));
    }
    int minPathSum(vector<vector<int>>& grid) {
        int m = grid.size()-1;
        int n = grid[0].size()-1;
        vector<vector<int>> dp(m+1,vector<int>(n+1,-1));
       return  mincost(dp,grid,0,0,m,n);
    }
};
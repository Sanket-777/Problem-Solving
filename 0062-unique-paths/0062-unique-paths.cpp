class Solution {
public:
    //brute forece recursion
    int calpaths(int i,int j,int m,int n, vector<vector<int>> &dp)
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(i == (m-1) && j == (n-1))
        {
            return 1;
        }
        
        if(i >= m || j >= n)
        {
            return 0;
        }
        
        return dp[i][j] = calpaths(i+1,j,m,n,dp) + calpaths(i,j+1,m,n,dp);
    }
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m+1 , vector<int> (n+1, -1));
        return calpaths(0,0,m,n,dp);
    }
};
class Solution {
public:
    int dfs(int i,int j,vector<vector<int>>& grid)
    {
        if(i >= grid.size())
        {
            return j;
        }
        
        if(grid[i][j] == 1 && j+1 < grid[0].size() && grid[i][j+1] == 1)
        {
            return dfs(i+1,j+1,grid);
        }
        
        if(grid[i][j] == -1 && j-1 >= 0 && grid[i][j-1] == -1)
        {
            return dfs(i+1,j-1,grid);
        }
        
        return -1;
    }
    vector<int> findBall(vector<vector<int>>& grid) {
        int col = grid[0].size();
        vector<int> ans(col);
        for(int i = 0;i < col;i++)
        {
            ans[i] = dfs(0,i,grid);
        }
        return ans;
    }
};
class Solution {
public:

        int f(int index,int buy,vector<int> &prices,vector<vector<int>> &dp) 
    {
        if(index >= prices.size())
            return 0;
        if(dp[index][buy] != -1)
            return dp[index][buy];
        int profit = 0;
        
        
        if(buy)
        {
            return dp[index][buy] = max(-prices[index]+f(index+1,0,prices,dp),0+f(index+1,1,prices,dp));
        }
        else
        {
            return dp[index][buy] = max(prices[index]+f(index+1,1,prices,dp),0+f(index+1,0,prices,dp));
        }
        
        return dp [index][buy];
    }
    int maxProfit(vector<int>& prices) {
         int n=prices.size();
        if(n<2) return 0;
        
        //dp vector
        vector<vector<int>> dp(prices.size(),vector<int>(2,-1));
        return f(0,1,prices,dp);
    }
};
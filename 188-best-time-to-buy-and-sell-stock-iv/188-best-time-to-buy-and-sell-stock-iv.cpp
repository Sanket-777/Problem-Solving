class Solution {
public:
    int fun(int index,bool buy,int profit,vector<int> &prices,int k,vector<vector<vector<int>>> &dp)
    {
        if(index == prices.size())
        {
            return 0;
        }
        if(k == 0)
        {
            return profit;
        }
        if(dp[index][buy][k]!=-1)
        {
            return dp[index][buy][k];
        }
        if(buy)
        {
            profit = max( -prices[index]+fun(index+1,false,profit,prices,k,dp),fun(index+1,true,profit,prices,k,dp));
        }
        else
        {
            profit = max(prices[index]+fun(index+1,true,profit,prices,k-1,dp),fun(index+1,false,profit,prices,k,dp));
        }
        return dp[index][buy][k] = profit;
;
    }
    int maxProfit(int k, vector<int>& prices) {
        int n = prices.size();
        vector<vector<vector<int>>>dp(n+1,vector<vector<int>>(2,vector<int>(k+1,-1)));
        return fun(0,true,0,prices,k,dp);
    }
};
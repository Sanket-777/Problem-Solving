class Solution {
public:
    
    int fun(int ind,vector<int> &prices,int k,bool buy,int profit,vector<vector<vector<int>>> &dp)
    {
        if(ind==prices.size())
        {
            return 0;
        }
        if(k==0)
        {
            return profit;
        }
        if(dp[ind][buy][k]!=-1)
        {
            return dp[ind][buy][k];
        }
        if(buy)
        {
            profit=max(-prices[ind]+fun(ind+1,prices,k,false,profit,dp),fun(ind+1,prices,k,true,profit,dp));
        }
        else
        {
             profit=max(prices[ind]+fun(ind+1,prices,k-1,true,profit,dp),fun(ind+1,prices,k,false,profit,dp));
        }
        
        return dp[ind][buy][k]=profit;
    }
    
    int maxProfit(int k, vector<int>& prices) {
        int n=prices.size();
        vector<vector<vector<int>>> dp(n+1,vector<vector<int>>(2,vector<int>(k+1,-1)));
        return fun(0,prices,k,true,0,dp);
    }
};
class Solution {
public:
    int maxProfit(vector<int>& prices) {
      int buy = INT_MAX;
    int profit = 0;
    for(int n:prices)
    {
        buy = min(buy,n);
        profit = max(profit,n-buy);
    }
    return profit;  
    }
};
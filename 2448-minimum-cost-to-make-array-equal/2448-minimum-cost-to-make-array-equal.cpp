class Solution {
public:
    long long calc(vector<int>& nums, vector<int>& cost, long long median)
    {
        long long ans = 0;
        for(int i  = 0;i < nums.size();i++)
        {
            ans = ans +  abs(1ll * nums[i]-median)*(1ll*cost[i]);
        }
        return ans;
    }
    
    long long minCost(vector<int>& nums, vector<int>& cost) {
        
        long long n = nums.size();
        
        vector<pair<int,int>> v;
        for(int i = 0;i < n;i++)
        {
            v.push_back({nums[i],cost[i]});
        }
        sort(v.begin(),v.end());
        long long totalele = 0;
        for(int i = 0;i < n;i++)
        {
            totalele  = 1ll * totalele +cost[i];
        }
        
        long long currsum = 0;
        long long median=  0;
        int i = 0;
        while(currsum < (totalele+1)/2 && i  < n)
        {
            currsum = currsum + (1ll *  v[i].second);
            median = v[i].first;
            i++;   
        }
        
        return calc(nums,cost,median);
        
        
    }
};
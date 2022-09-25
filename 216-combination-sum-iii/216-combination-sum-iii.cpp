class Solution {
public:
    void fun(int index,int sum,int n,vector<vector<int>> &ans2,vector<int> ans, int k)
    {
        if(sum == n && k == 0)
        {
            ans2.push_back(ans);
            return;
        }
        
        if(sum > n)
        {
            return;
        }
        
        for(int i = index;i <= 9;i++)
        {
            if(i > n)
            {
                break;
            }
            ans.push_back(i);
            fun(i+1,sum+i,n,ans2,ans,k-1);
            ans.pop_back();  // backtracking
        }
    }
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>> ans2;
        vector<int> ans;
        fun(1,0,n,ans2,ans,k);
        return ans2;
    }
};
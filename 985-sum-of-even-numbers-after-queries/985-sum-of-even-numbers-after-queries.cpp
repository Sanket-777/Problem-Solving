class Solution {
public:
    int caleven(vector<int> &v)
    {
        int sum = 0;
        for(int i:v)
        {
            if(i%2==0)
                sum+=i;
        }
        return sum;
    }
    vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& queries) {
        vector<int> ans;
        int n = queries.size();
        for(int  i = 0; i < n;i++)
        {
            nums[queries[i][1]] += queries[i][0];
            ans.push_back(caleven(nums));
        }
        return ans;
    }
};
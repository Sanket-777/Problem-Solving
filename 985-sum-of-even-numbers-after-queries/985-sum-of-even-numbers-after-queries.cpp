class Solution {
public:
    // int caleven(vector<int> &v)
    // {
    //     int sum = 0;
    //     for(int i:v)
    //     {
    //         if(i%2==0)
    //             sum+=i;
    //     }
    //     return sum;
    // }
    // vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& queries) {
    //     vector<int> ans;
    //     int n = queries.size();
    //     for(int  i = 0; i < n;i++)
    //     {
    //         nums[queries[i][1]] += queries[i][0];
    //         ans.push_back(caleven(nums));
    //     }
    //     return ans;
    // }
    vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& q) {
        int n = q.size();
        int sum  = 0;
        vector<int> ans(n, 0);

        for(int j:nums)
        {
            if(j%2 == 0)
            {
                sum+=j;
            }

        }
        for(int i = 0; i <  n;i++)
        {
            int index = q[i][1];
            int val = q[i][0];
            int oldvalue =  nums[index];
            nums[index] += val;
            
            bool wasEven = (oldvalue %2 == 0);
            bool isEven = (nums[index]%2 == 0);
            
            
            if(!wasEven && isEven)
            {
                ans[i] = sum + nums[index];
                sum += nums[index];
            }
            else if(wasEven && !isEven)
            {
                ans[i] = sum - oldvalue;
                sum -= oldvalue;
            }
            else if(wasEven && isEven)
            {
                ans[i] = sum + val;
                sum += val;
            }
            else
            {
                ans[i] = sum;
            }
        }
        
        return ans;
    }
};
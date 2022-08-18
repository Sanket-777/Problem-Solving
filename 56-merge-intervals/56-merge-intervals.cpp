class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        // sort(intervals.begin(),intervals.end());
        // int n = intervals.size();
        // vector<vector<int>> ans;
        // for(int i = 0; i < n;i++)
        // {
        //     if(ans.empty())
        //     {
        //         ans.push_back(intervals[i]);
        //     }
        //     else
        //     {
        //         vector<int> &v = ans.back();  // here &v when you are passing the referennece the actual value stored there is //modified 
        //         int end = v[1];
        //         if(intervals[i][0] <= end)
        //         {
        //             v[1] = max(end,intervals[i][1]);
        //         }
        //         else
        //         {
        //             ans.push_back(intervals[i]);
        //         }
        //     }
        // }
        // return  ans;
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> ans = {intervals[0]};
        for(int i =1 ;i < intervals.size();i++)
        {
            if(intervals[i][0] > ans.back()[1])
            {
               ans.push_back(intervals[i]);
            }
            else
            {
                 ans.back()[1] = max(intervals[i][1],ans.back()[1]);
                  
            }
          
        }
        return ans;
        
        
    }
};
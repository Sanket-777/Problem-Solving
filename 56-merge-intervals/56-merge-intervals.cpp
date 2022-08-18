class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        int n = intervals.size();
        vector<vector<int>> ans;
        for(int i = 0; i < n;i++)
        {
            if(ans.empty())
            {
                ans.push_back(intervals[i]);
            }
            else
            {
                vector<int> &v = ans.back();
                int end = v[1];
                if(intervals[i][0] <= end)
                {
                    v[1] = max(end,intervals[i][1]);
                }
                else
                {
                    ans.push_back(intervals[i]);
                }
            }
        }
        return  ans;
    }
};
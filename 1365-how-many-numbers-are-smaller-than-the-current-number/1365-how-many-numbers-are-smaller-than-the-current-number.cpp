class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> v;
        int count = 0;
        for(int i = 0;i < nums.size();i++)
        {
            count = 0;
            for(int j = 0;j < nums.size();j++)
            {
                if(nums[i] > nums[j] && i!=j)
                {
                    count++;
                }
            }
            v.push_back(count);
        }
        return v;
    }
};
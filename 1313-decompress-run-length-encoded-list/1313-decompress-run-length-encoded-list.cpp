class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector <int> v;
        for(int i = 0;i < nums.size();i++)
        {
            
            for(int k = 0;k < nums[i];k++)
            {
                int j = i+1;
                v.push_back(nums[j]);
            }
            i++;
        }
        return v;
    }
    
};
class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector <int> v;
        for(int i = 0;i < nums.size();i+=2)
        {
            
            v.insert(v.end(),nums[i],nums[i+1]);
        }
        return v;
    }
    
};
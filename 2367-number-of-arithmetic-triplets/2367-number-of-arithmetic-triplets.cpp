class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        set<int> s(nums.begin(),nums.end());
        int cnt= 0;
        for(int i = 0; i < nums.size();i++)
        {
            if(s.find(nums[i]-diff)!=s.end() && s.find(nums[i]-2*diff)!=s.end())
                cnt++;
        }
        return cnt;
    }
};
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int l = 0;
        int r = nums.size()-1;
        vector<int> v;
        int loc = r;
        while(l<=r)
        {
            if(nums[l]*nums[l] < nums[r]*nums[r])
            {
                v.insert(v.begin(),nums[r]*nums[r]);
                r--;
            }
            else
            {
                v.insert(v.begin(),nums[l]*nums[l]);
                l++;
            }
        }
        return v;
    }
};
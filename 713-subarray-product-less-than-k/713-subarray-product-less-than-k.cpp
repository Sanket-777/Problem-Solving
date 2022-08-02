class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        //sliding window approach
        if(k <= 1)return 0;
        int product = 1;
        int result   = 0;
        int start  = 0;
        int end = 0;
        while(end < nums.size())
        {
            product *= nums[end];
            
            while(product >= k)
            {
                product /= nums[start++];
            }
            result += end - start + 1;
            end++;
        }
        return result;
    }
};
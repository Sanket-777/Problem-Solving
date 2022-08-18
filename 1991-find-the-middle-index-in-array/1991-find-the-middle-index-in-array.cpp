class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int left = 0;
      int sum = 0;
        for(int i = 0; i < nums.size();i++)
        {
            sum += nums[i];
        }
        
        for(int i = 0; i < nums.size();i++)
        {
         
            sum -= nums[i];
            if(sum == left) return i;
            left += nums[i];
         }
        return -1;
    }
};
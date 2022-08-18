class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int ansindex = 0;
        int count = 1;
        for(int i  = 0;i < nums.size();i++)
        {
            if(nums[i] ==nums[ansindex])
                count++;
            else 
                count--;
            
            if(count == 0)
            {
                ansindex = i;
                count = 1;
            }
        }
        return nums[ansindex];
    }
};
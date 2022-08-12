class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.size()-1];
        sort(nums.begin(),nums.end());
        for(int i =  0; i < nums.size();i++)
        {
            int a_pointer = i+1;
            int b_pointer = nums.size()-1;
            while(a_pointer < b_pointer)
            {
                int current_sum = nums[i]+nums[a_pointer]+nums[b_pointer];
                if(current_sum < target)
                {
                    a_pointer +=1;
                }
                else
                {
                    b_pointer -=1;
                }
                
                if(abs(current_sum - target) < abs(result-target))
                {
                    result = current_sum;
                }
            }
        }
        return result;
    }
};
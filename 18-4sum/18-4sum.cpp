class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        int n =  nums.size();
        sort(nums.begin(),nums.end());
         vector<vector<int>> ans;
        for(int  i = 0;i < n;i++)
        {
            for(int j = i+1;j < n;j++)
            {
                int left = j+1;
                int right = n-1;
                long long sum = target - nums[i]*1L - nums[j]; // Used long lonf ans *1l Beacuse of larget value then int
                while(left < right)
                {
                    int sum2 = nums[left]+nums[right];
                   
                     if(sum2 < sum)
                    {
                        left++;
                    }
                    else if(sum2 > sum)
                    {
                        right--;
                    }
                    else
                    {
                        vector<int> tmp(4,0);
                        tmp[0] = (nums[i]);
                        tmp[1] = (nums[j]);
                        tmp[2] = (nums[left]);
                        tmp[3]  = (nums[right]);
                        ans.push_back(tmp);
                        
                        while(left < right && nums[left] == tmp[2])left++;
                        while(left < right && nums[right] == tmp[3])right--;     
                    }
                    
                    
                }
                
                while(j+1 < n && nums[j+1] == nums[j])j++;
                
            }
            while(i+1 < n && nums[i+1] == nums[i])i++;
        }
        return ans;
    }
};
class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        int runningsum = 0;
        int result = 0;
       
        unordered_map <int,int> mp;
         mp[0] = -1;
        for(int i = 0;i < nums.size();i++)
        {
            runningsum += nums[i];   //maintaining the running  sum in hashmap
            
            if(runningsum != 0)
            {
                runningsum %=k; // checking the mod k is present in map or not
            }
            if(mp.find(runningsum)!=mp.end())
            {
                if(i-mp[runningsum]>1)
                    return true; //checking that the size of subarray is at  least two
            }
            else
            {
                mp[runningsum] = i;
            }
            
        }
        return false;
    }
};
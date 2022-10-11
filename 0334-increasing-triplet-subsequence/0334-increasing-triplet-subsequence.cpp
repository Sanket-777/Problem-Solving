class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        
        int j = INT_MAX;
        int k = INT_MAX;
        for(int n:nums)
        {
           if(n < j)
           {
               j = n;
           }
            else if(n > j && n < k)
            {
                k = n;
            }
            else if(n > k)
            {
                return true;
            }
        }
        return false;
    }
};
class Solution {
public:
    
    int findbest(vector<int> &nums,int start,int end)
    {
        if(start > end)
            return 0;
        
        
        int chooseleft =  nums[start]+min(findbest(nums,start+2,end),findbest(nums,start+1,end-1));
        int chooseright = nums[end]+min(findbest(nums,start+1,end-1),findbest(nums,start,end-2));
        
        return max(chooseleft,chooseright);
    }
    bool PredictTheWinner(vector<int>& nums) {
        int n  =  nums.size();
        int bestscore = findbest(nums,0,n-1);
        int sum = 0;
        for(int i = 0; i < n;i++) sum+=nums[i];

        return (bestscore >= (sum-bestscore));
    }
        
};
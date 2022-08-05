class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int n=nums.size();
        vector<string> ans;
        //first consider the special case that n is equal to 0 and 1
        if(n==0) return ans;
        if(n==1) {
            ans.push_back(to_string(nums[0]));
            return ans;
        }
        for(int i=0;i<n-1;){
            
            
            if((nums[i+1]-1)>nums[i]){
                ans.push_back(to_string(nums[i]));
                i++;
            }
            
            else{
                int diff=1;
                int j =i+diff;
            for( ;j<n;){
                if(nums[j]-j==nums[i]-i){
                    diff++;
                    j++;
                }else if(nums[j]-j!=nums[i]-i){
                    break;
                }
               
            }
                
               ans.push_back(to_string(nums[i]) + "->" + to_string(nums[j-1]));
               i=i+diff;
            }
            
            
        }
        
        if(nums[n-1]!=nums[n-2]+1){
            ans.push_back(to_string(nums[n-1]));
        }
        
        
        return ans;
    }
};
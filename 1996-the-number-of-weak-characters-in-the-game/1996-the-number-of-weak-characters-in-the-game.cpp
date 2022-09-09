// class Solution {
// public:
//     bool static sorted(vector<int> &a,vector<int> &b)
//     {
//         if(a[0]==b[0])
//         {
//             return a[1]>b[1]; // if the a[0] == b[0] then bigger first smaller last
//         }
//         return  a[0]<b[0];//here smaller first ,bigger last
//     }
//     int numberOfWeakCharacters(vector<vector<int>>& p) {
//         int ans  = 0 ;
//         int maxd = INT_MIN;
//         int n = p.size();
//         sort(p.begin(),p.end(),sorted); //used sorted to edit sort function
//         for(int i = n-1;i >=0 ; i--)
//         {
//             if(p[i][1]<maxd)
//                 ans++;
//             if(p[i][1]>maxd)
//                 maxd=p[i][1];
//         }
//         return ans;
//     }
// };
class Solution {
public:
    int numberOfWeakCharacters(vector<vector<int>>& nums) {
        sort(nums.begin(),nums.end());
        int size  = nums.size();
        int ans=0,a=nums[size-1][0],b=nums[size-1][1],lmax=nums[size-1][1];
        for(int i=size-2;i>=0;i--)
        {
            if(nums[i][0]<nums[i+1][0]) 
            {
                b=max(lmax,b);
               lmax=max(b,nums[i][1]); 
            }
            if(nums[i][0]<a && nums[i][1]<b)
              ans++;
        }
        return ans;
        
        
        
    }
};
/*
b is the max value of defence till now (excluding the group in which we are currently )
      and lmax is the max value of defence till now including the current group.
*/
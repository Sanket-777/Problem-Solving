class Solution {
public:
    int cnt = 0;
    int calc(vector<int>& nums1, vector<int>& nums2)
    {
        unordered_map<long,long> mp;
         for(int i:nums1)
        {
            mp[(long)i*i]++;
        }
        sort(nums2.begin(),nums2.end());
        for(int i = 0;i < nums2.size();i++)
        {
            for(int j = i+1;j < nums2.size();j++)
            {
                if(mp[(long)nums2[i]*nums2[j]]>0)    
                {
                    cnt+=mp[(long)nums2[i]*nums2[j]];
                }
            }
        }
        return cnt;
    }
    int numTriplets(vector<int>& nums1, vector<int>& nums2) {
       
        calc(nums1,nums2);
        calc(nums2,nums1);
        return cnt;
    }
};
class Solution {
public:
    int numTriplets(vector<int>& nums1, vector<int>& nums2) {
       unordered_map <long,long> mp;
         unordered_map <long,long> mp2;
        for(long i:nums1)
        {
            mp[i*i]++;
        }
        int cnt= 0;
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
        for(long i:nums2)
        {
            mp2[i*i]++;
        }
        for(int i = 0;i < nums1.size();i++)
        {
            for(int j = i+1;j < nums1.size();j++)
            {
                if(mp2[(long)nums1[i]*nums1[j]]>0)    
                {
                    cnt+=mp2[(long)nums1[i]*nums1[j]];
                }
            }
        }
        return cnt;
    }
};
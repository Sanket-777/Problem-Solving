class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        map<int,int>m;
        vector<int> v;
        for(int i = 0;i < nums1.size();i++)
        {
            m[nums1[i]]++;
        }
        
        
        for(int j = 0; j < nums2.size();j++)
        {
            auto it = m.find(nums2[j]);
            if(it!=m.end() && it->second>0)
            {
                v.push_back(nums2[j]);
                it->second--;
            }
        }
        return v;
            
    }
};
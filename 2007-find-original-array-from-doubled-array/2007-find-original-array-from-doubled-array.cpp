class Solution {
public:
    vector<int> findOriginalArray(vector<int>& changed) {
        int n = changed.size();
        map<int,int> mp;
        vector<int> v;
        if(n%2 == 1)
        {
            return v;
        }
        sort(changed.begin(),changed.end());
        
        for(int  i =  0; i < n;i++)
        {
            mp[changed[i]]++;
        }
        
        for(int i = 0; i < n;i++)
        {
            if(mp[changed[i]] == 0) continue;
            if(mp[changed[i] * 2] == 0) return {};
            v.push_back(changed[i]);
            mp[changed[i]]--;
            mp[changed[i] * 2]--;
        }
        return v;
    }
};
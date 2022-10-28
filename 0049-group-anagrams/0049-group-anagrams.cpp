class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
         vector<vector<string>> vec;
        unordered_map <string,vector<string>> mp;
        for(int i = 0;i < strs.size();i++)
        {
            string st = strs[i];
            sort(strs[i].begin(),strs[i].end());
            mp[strs[i]].push_back(st);
        }
        for(auto i = mp.begin(); i != mp.end(); i++)
        {
            vec.push_back(i->second);
        }
        return vec;
    }
};
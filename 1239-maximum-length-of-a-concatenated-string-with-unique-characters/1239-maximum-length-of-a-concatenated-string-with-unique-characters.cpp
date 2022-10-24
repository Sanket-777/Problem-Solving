class Solution {
public:
    
    int maxi = 0;
    
    
    bool is_unique(string& str)
    {
        int n = str.size();
        vector<int> mp(26, 0);
        for(int i = 0; i < n; i++)
        {
            mp[str[i] - 'a']++;
            if(mp[str[i] - 'a'] > 1)
                return false;
        }
        return true;
    }
    
    void helper(vector<string>& arr, int i, int n, string curr)
    {
        if(is_unique(curr) == false)
            return;
        if(i == n)
        {
           
                int size = curr.size();
                maxi = max(maxi, size);
            
            return;
        }
        helper(arr, i + 1, n, curr + arr[i]);
        helper(arr, i + 1, n, curr);
    }
    int maxLength(vector<string>& arr) {
        int n = arr.size();
        helper(arr, 0, n, "");
        return maxi;
    }
};
class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        int n = s.length();
        string ch(n,'*');
        int i  = 0;
        while(i <  n)
        {
            ch[indices[i]] = s[i];
            i++;
        }
        return ch;
    }
};
class Solution {
public:
    vector<char> parent;
    char findroot(char x)
    {
        return parent[x] == x ? x : findroot(parent[x]);
    }
    bool equationsPossible(vector<string>& equations) {
        parent.resize(26,0);
        for(int i = 0; i < 26;i++)
            parent[i] = i;
        
        for(string s : equations)
        {
            if(s[1] == '=')
            {
                char x = findroot(s[0]-'a');
                char y = findroot(s[3]-'a');
                if(x != y)
                    parent[y] = x;
            }
        }
        for(string s:equations)
        {
             if(s[1] == '!')
            {
                char x = findroot(s[0]-'a');
                char y = findroot(s[3]-'a');
                if(x == y)
                    return false;
            }
        }
        return true;
    }
};
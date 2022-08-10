class Solution {
public:
    
    void backtrack(vector<string> &v,string current_string,int open,int close,int max)
    {
        if(current_string.length() == max*2)
        {
            v.push_back(current_string);
            return;
        }
        
        if(open < max)
        {
        backtrack(v,current_string +"(",open+1,close,max);

        }
          if(close < open)
        {
            backtrack(v,current_string +")",open,close+1,max);

        }
    }
    vector<string> generateParenthesis(int n) {
        vector<string> v;
        backtrack(v,"",0,0,n);
        return v;
    }
};
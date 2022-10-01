class Solution {
public:
    int dp[101];
    int decode(int i,string &s)
    {
        if(i >= s.size())
            return 1;
        
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int ans=  0;
        int s1 = s[i]-'0';
        int s2 = 0;
        if(i < s.size()-1)
        {
             s2 = s1 * 10 + s[i+1] - '0';
        }
        
        if(s1 > 0 ) 
        {
            ans += decode(i+1,s);
        }
        if(s1 > 0 && s2 > 0 && s2 <= 26)
        {
            ans += decode(i+2,s);
        }
        return dp[i] = ans;
    }

    int numDecodings(string s) {
        memset(dp,-1,sizeof dp );
        return decode(0,s);
    }
};
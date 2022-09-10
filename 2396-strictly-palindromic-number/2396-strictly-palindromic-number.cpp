class Solution {
public:
    bool isPalindrome(string &s)
    {
        int i = 0,j = s.size()-1;
        while(i <= j)
        {
            if(s[i++]!=s[j--])
                return false;
        }
        return true;
    }
    bool isStrictlyPalindromic(int n) {
        for(int  i =  2; i <= n-2;i++)
        {
            int num=  n;
            string s="";
            while(num)
            {
                s += (to_string(num%i));
                num=num/i;
            }
            if(!isPalindrome(s))
            {
                return false;
            }
        }
        return true;
    }
};
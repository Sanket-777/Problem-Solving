class Solution {
public:
    string breakPalindrome(string p) {
        // base  case
        if(p.size() == 1)
            return "";
        int n = p.length();
        for(int i = 0; i < n/2;i++) // n/2 beacuse palindrome can be identified from half and can be changed to non palindrome by changing only half of the string
        {
            if(p[i]!='a')
            {
                p[i] = 'a';
                return p;
            }
        }
        p[n-1] = 'b';
        return p;
          
    
    }
};
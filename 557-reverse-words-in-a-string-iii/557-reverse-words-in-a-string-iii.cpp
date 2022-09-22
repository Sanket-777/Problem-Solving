class Solution {
public:
    string rev(string &s,int i,int j)
    {
        while(i <= j)
        {
            swap(s[i++],s[j--]);
        }
        return s;
    }
    string reverseWords(string s) {
        int i = 0;
        int j = i;
        char space = ' ';
        while(j < s.length())
        {
            
             if(s[j] == space )
            {
            rev(s,i,j-1);
            i = j+1;
            }
            if(j == s.length()-1)
            {
                rev(s,i,j);
            }
            
            j++;
        }
        return s;
    }
};
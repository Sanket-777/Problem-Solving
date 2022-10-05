class Solution {
public:
    int countAsterisks(string s) {
        int cnt = 0;
        int cntl = 0;
        for(char ch:s)
        {
            if(ch == '*' && cntl%2 == 0)
                cnt++;
            if(ch == '|')
                cntl++;
        }
        return cnt;
    }
};
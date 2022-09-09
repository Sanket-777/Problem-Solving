class Solution {
public:
    vector<string> cellsInRange(string s) {
        char ch1 = s.at(0);
        char ch2 = s.at(3);
        int t = s.at(1) - '0';
        int y = s.at(4) - '0';
        int m = abs(y - t)+1;
        int n = ((ch2-ch1)+1);
        cout<<m;
        vector<string> sp;
        for(int i = 0; i < n ;i++)
        {
            for(int j = t-1; j < y;j++)
            {
                string a = string(1,(ch1+i));
                a.append(to_string(j+1));
                sp.push_back(a);
            }
        }
        return sp;
    }
};
class Solution {
public:
    int minPartitions(string n) {
        int len = n.length();
        int maxi =  n[0] - '0' ;
        for(int i = 0; i < len;i++)
        {
            maxi = max(maxi,n[i]-'0');
        }
        return maxi;
    }
};
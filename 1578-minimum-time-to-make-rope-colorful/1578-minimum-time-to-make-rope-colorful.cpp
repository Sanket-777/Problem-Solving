class Solution {
public:
    int minCost(string colors, vector<int>& needed) {
        int n = colors.size();
        int time = 0;
        for(int i = 1;i  < n;i++)
        {
            if(colors[i] == colors[i-1])
            {
                time  += min(needed[i],needed[i-1]);
            if(needed[i-1]>needed[i])
            {
                swap(needed[i-1],needed[i]);
            }
            }  
        }
        return time;
        }
};
class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        int cnt = 0;
        for(int i = 0; i < jewels.length();i++)
        {
            for(int j =0; j < stones.length();j++)
            {
                if(jewels.at(i) == stones.at(j))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
};
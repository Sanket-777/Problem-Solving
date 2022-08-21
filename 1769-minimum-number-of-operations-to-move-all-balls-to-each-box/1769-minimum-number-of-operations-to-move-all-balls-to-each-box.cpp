class Solution {
public:
    vector<int> minOperations(string boxes) {
        int  n = boxes.length();
        int steps = 0;
        vector<int> v;
        for(int i = 0;i < n;i++)
        {
            
            for(int j = 0;j < n;j++)
            {
                
                if(i == j)
                    continue;
                int tomove = boxes[j] - '0';
                while(tomove > 0)
                {
                    steps +=abs(i-j);
                    tomove--;
                }
                
            }
             v.push_back(steps);
            steps = 0;
        }
        return v;
    }
};
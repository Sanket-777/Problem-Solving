class Solution {
public:
    vector<int> minOperations(string boxes) {
        
        int n=boxes.length();
        vector <int> ans;
        int cnt=0;           

        for(int i=0;i<n;i++)
        {
             cnt  = 0;
            for(int j=0;j<n;j++)
            {
                if(i == j)
                {
                 continue;   
                }
                
                int balls = boxes[j] -'0';
                while(balls > 0)
                {
                    cnt += abs(i - j);
                    balls--;
                }
            }
            ans.push_back(cnt);
        }
        return ans;
        
    }
};
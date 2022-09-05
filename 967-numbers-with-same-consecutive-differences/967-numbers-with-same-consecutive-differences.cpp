class Solution {
public:
    vector<int> ans;
    int CountDigit(int n)
    {

        int  cnt = 0;
        while(n > 0)
        {
            cnt++;
            n/=10;
        }
        return cnt;
    }
    void find(int num,int n,int k)
    {
        if(CountDigit(num) == n)
        {
            ans.push_back(num);
            return;
        }
        
        for(int j  = 0;j <= 9; j++)
        {
           
            if(abs(( num % 10) - j) == k)
            {
                int number = num * 10 + j;
                  find(number,n,k);
            }
        }
    }

    vector<int> numsSameConsecDiff(int n, int k) {
        for(int i = 1;i < 10;i++)
        {
            find(i,n,k);
        }
        return ans;
    }
};
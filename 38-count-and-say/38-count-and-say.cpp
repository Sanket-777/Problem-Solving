class Solution {
public:
    string countAndSay(int n) {
        string ans[n+1];
        ans[1] = "1";
        for(int i = 2;i <= n;i++)
        {
            string temp = "";
            int count = 0;
            char var = ans[i-1][0];
            for(int j = 0;j <= ans[i-1].size();j++)
            {
                if(ans[i-1][j] == var)
                {
                    count++;
                }
                else
                {
                    temp +=to_string(count);
                    temp +=var;
                     var  = ans[i-1][j];
                    count = 1;
                }
                
        }
       
        ans[i]= temp;
     }
        return ans[n];
            
    }
};
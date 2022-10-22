class Solution {
public:
    double myPow(double x, int n) {
        double ans  = 1.0;
        long long n2 = n;
        if(n2 < 0)
        {
            n2 *= -1;
        }
        while(n2)
        {
            if(n2 % 2==0)
            {
                x *= x;
                n2/=2;
            }
            else
            {
                ans = ans * x;
                n2 -= 1;
            }
        }
        
        if(n  < 0)
        {
            ans = (double)1.0/(double)(ans);
        }
        return ans;
    }
};
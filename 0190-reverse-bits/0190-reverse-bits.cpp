class Solution {
public:
    bool findkthbit(int k,uint32_t n)
    {
        if(((1<<(k-1))&n)!=0) return true;
        return false;
    }

    uint32_t reverseBits(uint32_t n) {
        uint32_t ans = 0;
        for(int i =1;i <= 32;i++)
        {
            if(findkthbit(i,n))
            {
                ans  = 1 << (32-i) | ans;
            }
        }
        return ans;
    }
};
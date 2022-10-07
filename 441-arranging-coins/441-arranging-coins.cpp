class Solution {
public:
    int arrangeCoins(int n) {
        long i = 0, sum = 0;
        while (sum <= n) sum += ++i;
        return i-1;
    }
};
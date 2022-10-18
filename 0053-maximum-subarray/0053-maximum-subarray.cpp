class Solution {
public:
    int maxSubArray(vector<int>& arr) {
long long sum = 0;
    long long  maxi = INT_MIN;
    for(int i  = 0 ; i < arr.size();i++){
        sum += arr[i];
        maxi = max(sum,maxi);
        if(sum < 0) sum = 0;  
    }
   return maxi;
    }
};
class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        // int l = 0;
        // int r = nums.size()-1;
        // vector<int> v;
        // int loc = r;
        // while(l<=r)
        // {
        //     if(nums[l]*nums[l] < nums[r]*nums[r])
        //     {
        //         v.insert(v.begin(),nums[r]*nums[r]);
        //         r--;
        //     }
        //     else
        //     {
        //         v.insert(v.begin(),nums[l]*nums[l]);
        //         l++;
        //     }
        // }
        // return v;
         vector<int> res(A.size());
        int l = 0, r = A.size() - 1;
        for (int k = A.size() - 1; k >= 0; k--) {
            if (abs(A[r]) > abs(A[l])) res[k] = A[r] * A[r--];
            else res[k] = A[l] * A[l++];
        }
        return res;
    }
};
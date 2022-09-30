class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int start = 0;
        int end = arr.size()-1;
        vector<int> ans;
        while((end - start) >= k)
        {
            int newstart = abs(arr[start] - x);
            int newend = abs(arr[end] - x);
            if(newstart <= newend)
            {
                end--;
            }
            else
            {
                start++;
            }       
        }
         while(start <= end)
                ans.push_back(arr[start++]);
        return ans;
    }
};
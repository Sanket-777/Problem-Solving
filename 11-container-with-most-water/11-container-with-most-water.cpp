class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0;
        int j = height.size()-1;
        int ans  =  0;
        while(i < j)
        {
            int left = height[i];
            int right = height[j];
            int min_val = min(left,right);
            ans = max(ans,min_val*(j-i));
            if(left < right)i++;
            else j--;
        }
        return ans;
    }
};
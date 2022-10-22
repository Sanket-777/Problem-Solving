class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        //boyer moore algorithm for two  variable
        int cnt1 = 0;
        int cnt2 = 0;
        int num1 = -1;
        int num2 = -1;
        vector<int> v;
        for(int el:nums)
        {
            if(el == num1)
            {
                cnt1++;
            }
            else if(el == num2)
            {
                cnt2++;
            }
            else if(cnt1 == 0)
            {
                num1 = el;
                cnt1 = 1;
            }
           else if(cnt2 == 0)
            {
                num2 = el;
                cnt2 = 1;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i:nums)
        {
            if(i == num1)
                cnt1++;
            else if(i == num2)
            {
                cnt2++;
            }
        }
        if(cnt1>nums.size()/3)
        {
            v.push_back(num1);
        }
         if(cnt2>nums.size()/3)
        {
            v.push_back(num2);
        }
        return v;
    }
};
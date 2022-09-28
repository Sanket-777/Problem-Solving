class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> v1;
        vector<int> v2;
        for(int i =  0; i < nums.size();i++)
        {
            if(nums[i] < pivot)
            {
              v1.push_back(nums[i]);
            }
            else if(nums[i] > pivot)
            {
                v2.push_back(nums[i]);
            }
        }
        int rep =  nums.size() - (v1.size()+v2.size());
        while(rep--)
            v1.push_back(pivot);
        
        v1.insert(v1.end(),v2.begin(),v2.end());
        return v1;
    }
};
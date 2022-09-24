class Solution {
public:
    //pick and not pick
    void findcombinations(int index,int target,vector<int> &can,vector<vector<int>> &ds,vector<int> &v)
    {
        if(index ==  can.size())
        {
            if(target == 0)
            {
                ds.push_back(v);
            }
            return;
        }
        //picked
        if(can[index] <= target)
        {
            v.push_back(can[index]);
            findcombinations(index,target-can[index],can,ds,v);
            v.pop_back(); // Backtracking
        }
        //not pick
        findcombinations(index+1,target,can,ds,v);

    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ds;
        vector<int> v;
        findcombinations(0,target,candidates,ds,v);
        return ds;
    }
};
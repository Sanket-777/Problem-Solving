class Solution {
public:
    void findcombinations(int index,int target,vector<int> &cand,vector<vector<int>> &ds,vector<int> &v)
    {
        
            if(target == 0)
            {
                ds.push_back(v);
                return;
            }
        
            for(int i = index;i < cand.size();i++) // loopinf from index till end -1
            {
                if(i > index && cand[i] == cand[i-1]) continue;// for duplicates
                if(cand[i] > target) break;
                v.push_back(cand[i]);
                findcombinations(i+1,target-cand[i],cand,ds,v);
                v.pop_back();
            }

    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>> ds;
        vector<int> v;
        sort(candidates.begin(),candidates.end());
        findcombinations(0,target,candidates,ds,v);
        return ds;
    }
};
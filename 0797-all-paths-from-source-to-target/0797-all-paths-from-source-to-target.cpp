class Solution {
public:
    void dfs(vector<vector<int>>& graph,vector<vector<int>> &result,vector<int> &path,int curr)
    {
        path.push_back(curr);
        if(curr == graph.size()-1 )
        {
            //found answer
            result.push_back(path);
        }
        else
        {
            for(int i:graph[curr])//adjacency list visulalizaltion
            {
                dfs(graph,result,path,i);
            }
        }
                    path.pop_back();

        
    }
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        vector<vector<int>> result;
        vector<int> path;
        dfs(graph,result,path,0);
        return result;
    }
};
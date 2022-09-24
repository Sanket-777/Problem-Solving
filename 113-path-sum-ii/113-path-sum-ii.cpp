/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> res;
    vector<int> curr;
    void dfs(TreeNode *root,int targetsum,int currentsum)
    {
        if(root == NULL)
        {
            return;
        }
        curr.push_back(root->val);
        currentsum += root->val;
        if(root->left == NULL && root->right == NULL)
        {
            if(targetsum == currentsum)
            {
                res.push_back(curr);
            }
        }
        
        dfs(root->left,targetsum,currentsum);
        dfs(root->right,targetsum,currentsum);
        curr.pop_back(); 
    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        dfs(root,targetSum,0);
        return res;
    }
};
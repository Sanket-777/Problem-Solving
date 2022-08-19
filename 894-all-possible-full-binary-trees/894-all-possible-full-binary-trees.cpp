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
    vector<TreeNode*> allPossibleFBT(int n) {
        if(n == 1)
        {
            vector<TreeNode*> v;
            v.push_back(new TreeNode(0));
            return v;
        }
        
        vector<TreeNode*> allleft,allright;
        vector<TreeNode*> ans;
        for(int i = 1;i <  n ;i+=2)
        {
            allleft  = allPossibleFBT(i);
            allright = allPossibleFBT(n-i-1);
            
            for(int j = 0; j < allleft.size();j++)
            {
                for(int k = 0;k < allright.size();k++ )
                {
                    TreeNode *root = new TreeNode(0);
                    root->left = allleft[j];
                    root->right = allright[k];
                    ans.push_back(root);
                }
            }
        }
        return ans;
    }
};
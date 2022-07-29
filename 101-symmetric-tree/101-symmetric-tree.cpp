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
    bool solve(TreeNode* leftt,TreeNode* rightt)
    {
        if(leftt == NULL && rightt == NULL)
            return true;
        if(leftt == NULL || rightt == NULL)
            return false;
        
        return leftt->val == rightt->val && solve(leftt->left,rightt->right) && solve(leftt->right,rightt->left);
    
    }
    bool isSymmetric(TreeNode* root) {
              
        TreeNode* leftt = root->left;
        TreeNode* rightt = root->right;
        return solve(leftt,rightt);
    }
};
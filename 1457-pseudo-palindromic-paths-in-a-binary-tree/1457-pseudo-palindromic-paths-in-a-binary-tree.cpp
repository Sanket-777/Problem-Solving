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
    int ans = 0;
    void frequency(TreeNode *root,vector<int> &m,int count)
    {
         m[root->val]++;
        if(!root->left && !root->right){
            int count=0;
            for(int it:m) {
                if(it%2!=0) count++;
            }
            if(count<=1) ans++;
            m[root->val]--;
            return ;
        }
        if(root->left) frequency(root->left,m,count);
        if(root->right) frequency(root->right,m,count);
        m[root->val]--;
    }
    int pseudoPalindromicPaths (TreeNode* root) {
        if(!root) return 0;
        vector<int> v (10,0);
        frequency(root,v,0);
        return ans;
    }
};
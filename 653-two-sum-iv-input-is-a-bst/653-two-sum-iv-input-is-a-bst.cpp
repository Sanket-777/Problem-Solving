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
vector<int> num;
    void inordert(TreeNode *root)
   {
       if(root == NULL)
           return;
       inordert(root->left);
       num.push_back(root->val);
       inordert(root->right);
       
   }
    bool findTarget(TreeNode* root, int k) {
        inordert(root);
        int left = 0;
        int right = num.size()-1;
        sort(num.begin(),num.end());
        while(left < right)
        {
            if(num[left] + num[right] == k)
                return true;
            
            if(num[left] + num[right] < k)
            {
                left++;
            }
            else if(num[left] + num[right] > k)
            {
                right--;       
            }  
        }
        return false;
    }
};
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
    TreeNode *construct(vector<int> &nums,int start ,int end)
    {
        if(start > end) 
            return NULL;
        if(start == end) 
            return new TreeNode(nums[start]);
        int max_index = findmax(nums,start,end);
        TreeNode *root = new TreeNode(nums[max_index]);
        root->left = construct(nums,start,max_index-1);
        root->right = construct(nums,max_index+1,end);
        
        return root;
    }
    int findmax(vector<int> &nums,int s,int e)
    {
        
        int index = -1;
        int max = INT_MIN;
        for(int i =  s;i <= e;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
     TreeNode * root =  construct(nums,0,nums.size()-1);
    return root;
    }
};
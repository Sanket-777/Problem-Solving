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
     unordered_map<int, vector<TreeNode*>> memo; //for memoisation
    vector<TreeNode*> allPossibleFBT(int n) {
//         if(n == 1)
//         {
//             vector<TreeNode*> v;
//             v.push_back(new TreeNode(0));
//             return v;
//         }
        
//         vector<TreeNode*> allleft,allright;
//         vector<TreeNode*> ans;
//         for(int i = 1;i <  n ;i+=2)
//         {
//             allleft  = allPossibleFBT(i);
//             allright = allPossibleFBT(n-i-1);
            
//             for(int j = 0; j < allleft.size();j++)
//             {
//                 for(int k = 0;k < allright.size();k++ )
//                 {
//                     TreeNode *root = new TreeNode(0);
//                     root->left = allleft[j];
//                     root->right = allright[k];
//                     ans.push_back(root);
//                 }
//             }
//         }
//         return ans;
//     }
// USING MEMOISATION
        if(memo.find(n)!=memo.end())
            return memo[n];
        
        if(n == 1)
            return memo[n] = {new TreeNode(0)};
        
        if(n%2 == 0)
            return {};
        
        
        vector<TreeNode*> ans;
        for(int i = 1;i < n;i+=2)
        {
            for(auto l:allPossibleFBT(i))
            {
                for(auto r:allPossibleFBT(n-i-1))
                {
                    TreeNode *root = new TreeNode(0,l,r);
                    ans.push_back(root);
                }
            }
        }
        return ans;
    }
};
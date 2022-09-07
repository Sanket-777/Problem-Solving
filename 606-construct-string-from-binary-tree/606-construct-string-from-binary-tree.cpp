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
    string tree2str(TreeNode* t) {
//           if(root == NULL)
//               return " ";
        
//         string str = to_string(root->val);
//         if(root->left)
//         {
//             str += "("+ tree2str(root->left)+")";
//         }
//         else if(root->right)
//         {
//             str += "()";
//         }
//          if(root->right)
//         {
//             str += "("+ tree2str(root->right)+")";
//         }
        
        
//        return str; 
        if (!t) return "";
        string str = to_string(t->val);
        if (t->left || t->right) {
            str += "(" + tree2str(t->left) + ")";
            
            if (t->right) str += "(" + tree2str(t->right) + ")";
        }
        return str;
    }
};
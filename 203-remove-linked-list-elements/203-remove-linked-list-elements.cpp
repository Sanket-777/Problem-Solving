/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
//         while(head!=nullptr && head->val == val)
//         {
//             head = head->next;
//         }
        
//         ListNode *current_node = head;
//         while(current_node!=nullptr && current_node->next!=nullptr)
//         {
//             if(current_node->next->val == val)
//             {
//                 current_node->next = current_node->next->next;
//             }
//             else
//             {
//                 current_node = current_node->next;
//             }
//         }
//         return head;
        ListNode *cur = head;
        ListNode *prev = new ListNode(-1);
        prev->next = head;
        ListNode *res = prev;
        while(cur)
        {
            if(cur->val!=val)
            {
                prev = cur;
                cur = cur->next;
            }
            else
            {
                if(cur->next==nullptr)
                {
                    prev->next = nullptr;
                }  
                else
                {
                    prev->next = cur->next;
                }
                cur = cur->next;
            }
        }
        return res->next;
    }
};
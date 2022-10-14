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
    ListNode* deleteMiddle(ListNode* head) {
        ListNode *temp = head;
        if(head->next == NULL)
        {
            return NULL;
        }
        int cnt = 0;
        while(temp)
        {   temp = temp->next;
            cnt++;
        }
        cnt /= 2;
        cnt -=1;
        ListNode *slow = head;
        while(cnt--)
        {
            slow = slow->next;
        }
        slow->next  = slow->next->next;
        return head;
    }
};
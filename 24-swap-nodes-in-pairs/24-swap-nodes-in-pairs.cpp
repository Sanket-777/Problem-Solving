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
    ListNode* swapPairs(ListNode* head) {
        ListNode* first = head; //first node
        ListNode* dummy = new ListNode(0); //dummy to return
        ListNode* prev = dummy;
        prev->next = head;  // previous node
        
        
        while(first && first->next)
        {
            ListNode* second = first->next; //assigning addr to second
            ListNode* future = first->next->next; //assigning addr to future
            
            second->next = first; 
            prev->next = second;
            first->next = future;
            
            
            //for next iteration
            prev = first; 
            first = future;
       }
        return dummy->next;
    }
};
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        auto s = head, f = head;
        while (f) {
            s = s->next;
            f = f->next;
            if (!f) break;
            f = f->next;
        }
        
        ListNode *prev = nullptr, *curr = s;
        while (curr) {
            auto next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
      
        while (prev) {
            if (prev->val != head->val) return false;
            prev = prev->next;
            head = head->next;
        }
        return true;
    }
};
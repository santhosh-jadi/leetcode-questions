/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
ListNode pre = dummy;
ListNode t = head;

while(t != null){
    ListNode t1 = t.next;

    if(t1 != null && t.val == t1.val){
        int x = t.val;

        while(t1 != null && x == t1.val){
            t1 = t1.next;
        }

        pre.next = t1;
        t = t1;
    }
    else{
        pre.next = t;
        pre = t;
        t = t.next;
    }
}

return dummy.next;

        
    }
}
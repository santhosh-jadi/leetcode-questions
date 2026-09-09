/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Boolean> h1=new HashMap<>();
        ListNode t=headA;
        while(t!=null){
            h1.put(t,true);
            t=t.next;
        }
         ListNode t1=headB;
        while(t1!=null){
            if(h1.containsKey(t1)){
                return t1;
            }
            t1=t1.next;
        }


        return null;
        
    }
}
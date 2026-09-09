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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=null;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                if(ans==null){
                    ans=new ListNode(list1.val);
                }
                else{
                        ans=new ListNode(list1.val,ans);
                }
                list1=list1.next;
            }
            else{
                if(ans==null){
                    ans=new ListNode(list2.val);
                }
                else{
                   ans=new ListNode(list2.val,ans);
                }
                list2=list2.next;
            }
        }
        while(list1!=null){
                 if(ans==null){
                    ans=new ListNode(list1.val);
                }
                else{
                        ans=new ListNode(list1.val,ans);
                }
                list1=list1.next;
            }
        
        while(list2!=null){
                if(ans==null){
                    ans=new ListNode(list2.val);
                }
                else{
                   ans=new ListNode(list2.val,ans);
                }
                list2=list2.next;
            }
    ListNode prev = null;
    ListNode curr = ans;
    
    while (curr != null) {
        ListNode nxt = curr.next; 
        curr.next = prev;        
        prev = curr;             
        curr = nxt;              
    }
    
    return prev;
        
        
    }
}
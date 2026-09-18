class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode pre = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        ListNode head1 = pre;

        while (head1 != null && head != null) {
            if (head1.val != head.val) {
                return false;
            }
            head1 = head1.next;
            head = head.next;
        }

        return true;
    }
}
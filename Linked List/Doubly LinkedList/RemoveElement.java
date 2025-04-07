//https://leetcode.com/problems/remove-linked-list-elements/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next; // skip the current node
            } else {
                prev = curr; // move prev only when node is kept
            }
            curr = curr.next; // always move curr
        }

        return dummy.next;
    }
}
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow; //will point at prev of the middle element
            slow = slow.next;
            fast = fast.next.next;
        }
        //remove the link
        if(prev != null){
            prev.next = slow.next;
        }
        return head;
    }
}
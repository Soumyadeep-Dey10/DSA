public class Solution {
    public ListNode meetingNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return slow;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = meetingNode(head);
        ListNode slow = head;

        if (fast == null) return null;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
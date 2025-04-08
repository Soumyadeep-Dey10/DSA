//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         // Calculate the length of the list
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        if(n == length){
            return head.next;
        }
        ListNode temp2 = head;
        for(int i = 0; i < length-n-1; i++){
            temp2 = temp2.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // If prev is null, it means the length of the list is less than n
        if (temp2 == null || temp2.next == null) {
            return head; // No change
        }
        temp2.next = temp2.next.next;
        return dummy.next;
    }
}
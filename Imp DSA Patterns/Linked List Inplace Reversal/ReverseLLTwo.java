class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        if (left == right) return head;

        ListNode t = head, before = null;
        int pos = 1;

        while (t != null) {
            if (pos < left) {
                before = t;
                t = t.next;
                pos++;
                continue;
            }

            // now t is at left
            ListNode current = t, prev = null;
            int times = right - left + 1;

            while (times > 0) {                 
                ListNode temp = current.next;
                current.next = prev;            
                prev = current;
                current = temp;
                times--;
            }

            t.next = current;

            if (before != null) {              
                before.next = prev;
                return head;
            } else {
                return prev;   //if left == 1                 
            }
        }
        return head;
    }
}

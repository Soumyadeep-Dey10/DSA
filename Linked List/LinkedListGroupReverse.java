class Solution {
    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node current = head;
        Node prev = null;
        Node next = null;
        
        // Step 1: Check how many nodes are available
        int count = 0;
        Node temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Step 2: Reverse only if we have at least one node
        if (count > 0) {
            count = 0;
            current = head;

            // Reverse k nodes
            while (current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            // Step 3: Recursively reverse remaining list
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }

            // prev is the new head of this group
            return prev;
        }

        return head;
    }
}
//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/detect-loop-in-linked-list
class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
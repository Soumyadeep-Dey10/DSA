//https://www.geeksforgeeks.org/problems/find-length-of-loop/1?page=1&category=Linked%20List&sortBy=submissions
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node fast = head;
        Node slow = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                break;
            }
            
        }
        return length;     
    }
}
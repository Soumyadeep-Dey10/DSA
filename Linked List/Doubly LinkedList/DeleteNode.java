//https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list
class Solution {
    public Node deleteNode(Node head, int x) {
        
        // If the list is empty or x is invalid
        if (head == null || x <= 0) {
            return head;
        }
        
        // Deleting the head node (position 1)
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null; // If there is a next node, update its prev reference
            }
            return head;
        }
        
        Node temp = head;
       
        // Traverse to the node at position x
        for (int i = 1; temp != null && i < x; i++) {
            temp = temp.next;
        }

        // If temp is null, the position is out of bounds
        if (temp == null) {
            return head;
        }

        // If the node to be deleted is not the last node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // If the node to be deleted is not the first node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        return head;
    }
}

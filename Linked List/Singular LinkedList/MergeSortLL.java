//https://www.geeksforgeeks.org/problems/sort-a-linked-list/1
class Solution {
    private static Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
      private static Node merge(Node list1, Node list2) {
        Node mergedHead = new Node(0); // Dummy node
        Node current = mergedHead;
        
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Attach remaining nodes, if any
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        
        return mergedHead.next; 
    }
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        if(head == null || head.next == null) return head;
        Node mid = middleNode(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
}
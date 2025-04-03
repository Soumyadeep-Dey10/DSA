//https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1?page=1&category=Linked%20List&sortBy=submissions
class Solution {
    // Function to check whether the list is palindrome.
   public Node reverseList(Node head) {
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public  boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node fast = head;
        Node slow = head;

        // Find the middle of the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse the second half of the list
        Node newHead = reverseList(slow);
        Node first = head;
        Node second = newHead;

        // Compare the two halves
        
        while (second != null) {
            if (first.data != second.data) {
              return false;
            }
            first = first.next;
            second = second.next;
        }

        
        reverseList(newHead);
        return true;
    }
}

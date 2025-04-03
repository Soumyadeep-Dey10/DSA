//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1&category=Linked%20List&sortBy=submissions
class Solution {
    Node reverseList(Node head) {
        Node prev =  null;
        Node temp = head;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            //shifting
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
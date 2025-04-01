//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
class Solution {
    // Function to insert a node at the end of the linked list.
    
    Node insertAtEnd(Node head, int x) {
        Node tail = head;
        
        Node node = new Node(x);
        if (head == null) {
            return node;
        }
        
        while(tail.next != null){
            tail = tail.next;
        }
        
        tail.next = node;
       
       return head;
    }
    
}

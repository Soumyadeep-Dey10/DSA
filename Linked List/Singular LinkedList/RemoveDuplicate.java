//https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?page=1&category=Linked%20List&sortBy=submissions
class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
         Node temp = head;
         while(temp != null && temp.next != null ){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
        }
    }
    return head;  
    }
}
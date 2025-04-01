//https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
class Solution {
    static Node constructLL(int arr[]) {
         if (arr == null || arr.length == 0) {
            return null; // Return null if the array is empty or null
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        int i = 1;
        while(i < arr.length){
            Node node = new Node(arr[i]);
            temp.next = node; // Link the temp node to the new node
            temp = node; //Move the temp pointer to the new node
            i++;
        }
        return head;
    }
}

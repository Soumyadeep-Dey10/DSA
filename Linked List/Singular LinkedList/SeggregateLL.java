//https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=given-a-linked-list-of-0s-1s-and-2s-sort-it
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0) count0++;
            if(temp.data == 1) count1++;
            if(temp.data == 2) count2++;
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(count0 > 0){
                temp.data = 0;
                count0--;
            }
            else if(count1 > 0){
                temp.data = 1;
                count1--;
            }else{
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
    }
}
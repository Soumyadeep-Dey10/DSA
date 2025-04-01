//https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;
        while(temp != null){
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}

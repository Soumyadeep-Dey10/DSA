//https://leetcode.com/problems/delete-node-in-a-linked-list/
class Solution {
    public void deleteNode(ListNode node) {
        //4,5,1,9 val = 5
      node.val = node.next.val; //link 4 with 1
      node.next = node.next.next; //link 1 with 9
    }
}

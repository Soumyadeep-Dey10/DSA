//https://leetcode.com/problems/add-two-numbers/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1; //temp pointer for list1
        ListNode temp2 = l2; //temp pointer for list2
        ListNode dummy = new ListNode(-1); //to get the head of the new list at last
        ListNode current = dummy;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null) sum += temp1.val;
            if(temp2 != null) sum += temp2.val;
            //if sum > 10
            ListNode newNode = new ListNode(sum % 10);
            carry = sum/10;
            //move the cuurent pointer 
            current.next = newNode;
            current = current.next;

            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;            
        }
        //if carry left at last
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
        return dummy.next;
    }
}
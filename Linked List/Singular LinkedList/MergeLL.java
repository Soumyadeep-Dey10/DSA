//https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1?page=2&category=Linked%20List&sortBy=submissions
class Solution {
    Node sortedMerge(Node list1, Node list2) {
        if(list1 == null)   return list2;
        if(list2 == null)   return list1;
        Node merged = new Node(0);
        Node temp = merged;
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null) temp.next = list1;
        if(list2 != null) temp.next = list2;
        return merged.next;
    }
}
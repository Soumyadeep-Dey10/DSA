//https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-pairs-with-given-sum-in-doubly-linked-list

class Solution {
    public static Node findTail(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node right = findTail(head);
        Node left = head;
        while(left != null && right != null && left != right && left.data < right.data){
            if(left.data + right.data == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                list.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < target){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return list;
    }
}
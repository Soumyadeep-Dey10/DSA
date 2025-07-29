//https://leetcode.com/problems/binary-tree-level-order-traversal/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return list;
        queue.offer(root);

        while(queue.size() > 0){
            int level = queue.size();
            ArrayList<Integer> sub=new ArrayList<>();
            
            for(int i = 0; i < level; i++){

                if(queue.peek().left != null){
                    queue.offer(queue.peek().left); //add 2 after 1 in queue
                } 
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right); //add 3 after 2 in queue
                } 
                sub.add(queue.poll().val); //remove 1 from queue and add to ans
            }
            list.add(sub);
        }
        return list;
    }
}
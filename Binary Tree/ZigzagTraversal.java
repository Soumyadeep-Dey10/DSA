//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.offer(root);
        boolean flag = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>(Collections.nCopies(size, 0)); 

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); 

                int index = (flag) ? i : (size - i - 1);
                list.set(index, node.val); //add the value in the list

                if (node.left != null) queue.offer(node.left);   
                if (node.right != null) queue.offer(node.right); 
            }

            res.add(list);
            flag = !flag; // alternate direction
        }

        return res;
    }
}

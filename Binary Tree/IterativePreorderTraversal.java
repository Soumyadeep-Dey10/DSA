//https://leetcode.com/problems/binary-tree-preorder-traversal/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        if(root != null) st.add(root);

        while(!st.isEmpty()){
            TreeNode node = st.pop();
            list.add(node.val);

            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        } 
        return list;
    }
}
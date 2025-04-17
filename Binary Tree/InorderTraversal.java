//https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1312930265/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    void helper(TreeNode root, ArrayList<Integer> result){
        if (root == null) return ;
        helper(root.left,result);
        result.add(root.val);
        helper(root.right, result);
    }
}
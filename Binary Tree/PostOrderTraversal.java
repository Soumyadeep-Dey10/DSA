//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1273569832/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    public void helper(TreeNode root,List<Integer> result){
        if(root == null){
            return;
        }
        
        helper(root.left,result);
        helper(root.right,result);
        result.add(root.val);
    }
    
}
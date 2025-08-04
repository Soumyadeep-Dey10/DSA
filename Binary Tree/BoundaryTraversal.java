//https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
class Solution {
    void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) res.add(cur.data); 
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        ArrayList<Integer> list = new ArrayList<>();
        while (cur != null) {
            if (!isLeaf(cur)) list.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i)); 
        }
    }
    public  void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }

    boolean  isLeaf(Node node) {
        return node.left == null && node.right == null; 
    }

    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> ans = new ArrayList<>(); 

        if (!isLeaf(node)) ans.add(node.data); 
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);

        return ans;
    }
}

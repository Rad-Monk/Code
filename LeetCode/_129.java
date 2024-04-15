class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class _129 {
    public int traversal(TreeNode node, int val){
        if(node == null){
            return 0;
        }
        val = val *10 + node.val;
        if(node.left == null && node.right == null){
            return val;
        }
        return traversal(node.left,val) + traversal(node.right, val);
    }
    public int sumNumbers(TreeNode root) {
        return traversal(root,0);
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode xp = null;
    TreeNode yp = null;
    int xd = -1;
    int yd = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        
        
        findParentsAndDepth(root, x, y, 0, null);
        
        if (xp != yp && xd == yd) {
            return true;
        }else{
            return false;
        }
    }
    
    private void findParentsAndDepth(TreeNode root, int x, int y, int d, TreeNode parent) {
        if (root == null) {
            return;
        }
        
        if (root.val == x) {
            xp = parent;
            xd = d;
        } else if (root.val == y) {
            yp = parent;
            yd = d;
        } else {
            findParentsAndDepth(root.left, x, y, d+1, root);
            findParentsAndDepth(root.right, x, y, d+1, root);
        }
    }
}
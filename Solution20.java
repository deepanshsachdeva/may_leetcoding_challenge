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
    int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        TreeNode kth = helper(root,k);
        return kth.val;
    }
    
    TreeNode helper(TreeNode root, int k) {
        if (root==null) return null;
        
        TreeNode leftNode = helper(root.left, k);
        
        if (leftNode != null) {
            return leftNode;
        }
        count++;
        
        if (count == k) {
            return root;
        }
        
        return helper(root.right, k);
    }
}

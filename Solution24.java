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
    public TreeNode bstFromPreorder(int[] preorder) {        
        return bstHelper(preorder, 0, preorder.length-1);
    }
    
    private TreeNode bstHelper(int[] preorder, int start, int end) {
        if(start > end) return null;
        
        TreeNode root = new TreeNode(preorder[start]);
        
        int ix;
        
        for(ix=start;ix<=end;ix++) {
            if(preorder[ix] > root.val) break;
        }
        
        root.left = bstHelper(preorder, start+1, ix-1);
        root.right = bstHelper(preorder, ix, end);
        
        return root;
    }
}

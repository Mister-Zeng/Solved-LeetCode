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
    private boolean validBST(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }
        
        return (min == null || root.val > min) && (max == null || root.val < max) && validBST(root.left, min, root.val) && validBST(root.right, root.val, max);
    }
    
    public boolean isValidBST(TreeNode root) {
        return validBST(root, null, null);
    }
}
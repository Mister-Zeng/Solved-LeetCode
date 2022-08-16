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
    public TreeNode invertTree(TreeNode root) {
        // if root is empty, return null
        if(root == null) {
            return null;
        }
        // initialize a new TreeNode 
        TreeNode invert = new TreeNode(root.val);
        invert.left = invertTree(root.right);
        invert.val = root.val;
        invert.right = invertTree(root.left);
        
        return invert;
    }
}
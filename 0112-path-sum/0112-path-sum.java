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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return hasPathSum(root, targetSum, sum);
    }
    
    private boolean hasPathSum(TreeNode root, int targetSum, int sum) {
        if(root == null) return false; 
        
        if(root.left == null && root.right == null) {
            sum += root.val;
            
            if(sum == targetSum) return true; 
        }
        
        return (hasPathSum(root.left, targetSum, sum + root.val) || hasPathSum(root.right, targetSum, sum + root.val));
    }
} 
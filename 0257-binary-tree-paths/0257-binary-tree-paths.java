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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        Queue<TreeNode> tQueue = new LinkedList<>();
        Queue<String> sQueue = new LinkedList<>();
        
        if (root == null) return list; 
        
        tQueue.add(root);
        sQueue.add("");
        
        while (!tQueue.isEmpty()) {
            TreeNode currNode = tQueue.poll();
            String currS = sQueue.poll();
            
            if (currNode.left == null && currNode.right == null) {
                list.add(currS + currNode.val);
            }
            
            if (currNode.left != null) {
                tQueue.add(currNode.left);
                sQueue.add(currS + currNode.val + "->");
            }
            
            if (currNode.right != null) {
                tQueue.add(currNode.right);
                sQueue.add(currS + currNode.val + "->");
            }
        }
        
        return list;
    }
}
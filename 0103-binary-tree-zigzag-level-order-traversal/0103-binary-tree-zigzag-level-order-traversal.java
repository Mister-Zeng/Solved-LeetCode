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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result; 
        
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> row = null;
        deque.add(root);
        
        while(!deque.isEmpty()) {
            int size = deque.size();
            row = new ArrayList<>();
            result.add(row);
            
            while(size > 0) {
                TreeNode curr = deque.removeFirst();
                row.add(curr.val); 
                
                if(curr.left != null) deque.addLast(curr.left);
                if(curr.right != null) deque.addLast(curr.right);
                size--;
            } 
            
            size = deque.size();
            if(size > 0) {
                row = new ArrayList<>();
                result.add(row);
            }
            
            while(size > 0) {
                TreeNode curr = deque.removeLast();
                row.add(curr.val); 
                
                if(curr.right != null) deque.addFirst(curr.right);
                if(curr.left != null) deque.addFirst(curr.left);
                size--;
            } 
            
        }
        
        return result;
    }
}
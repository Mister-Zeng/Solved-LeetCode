/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    Set<Integer> visited;
    Map<TreeNode, TreeNode> parentMap; 
    List<Integer> result; 
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        visited = new HashSet<>();
        parentMap = new HashMap<>();
        result = new ArrayList<>();
        
        parent(root, null);
        dfs(target, k);
        
        return result;
    }
    
    public void parent(TreeNode root, TreeNode prev) {
        if(root == null) return; 
        
        parentMap.put(root, prev);
        parent(root.left, root);
        parent(root.right, root);
    }
    
    public void dfs(TreeNode root, int k) {
        if(root == null || visited.contains(root.val)) return;
        
        visited.add(root.val);
        
        if(k == 0) {
            result.add(root.val);
            return;
        }
        
        dfs(root.left, k - 1);
        dfs(root.right, k - 1);
        dfs(parentMap.get(root), k - 1);
    }
}
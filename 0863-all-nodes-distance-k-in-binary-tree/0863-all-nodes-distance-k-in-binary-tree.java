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
    List<Integer> result; 
    Map<TreeNode, TreeNode> parentMap;
    Set<Integer> visited;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        result = new ArrayList<>();
        parentMap = new HashMap<>();
        visited = new HashSet<>();
        addParent(root, null); 
        dfs(target, k);
        
        return result;
    }
    
    public void addParent(TreeNode root, TreeNode prev) {
        if(root == null) return;
        
        parentMap.put(root, prev);
        addParent(root.left, root);
        addParent(root.right, root);
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